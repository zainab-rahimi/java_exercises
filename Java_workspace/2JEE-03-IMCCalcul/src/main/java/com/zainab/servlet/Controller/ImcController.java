package com.zainab.servlet.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zainab.servlet.entity.PersonImc;

/**
 * Servlet implementation class IMCController
 */
@WebServlet("/ImcController")
public class ImcController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String jspView = "/WEB-INF/ImcView.jsp";
	private static final String jspError = "/WEB-INF/ImcError.jsp";
	private String err = "";
	private PersonImc personImc = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImcController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generate
		// response.getWriter().append("Served at: ").append(request.getContextPath()); //this line is for when we don't have jsp vue
		this.checkParams(request);
		String view = jspError;
		if (err.isBlank()) {
			personImc.exec();
			System.out.println(personImc);
			request.setAttribute("anImc", personImc);
			view = jspView;
		}
		
		request.setAttribute("err", err);
		this.getServletContext().getRequestDispatcher(view).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	private void checkParams(HttpServletRequest request) {
		String n = request.getParameter("name");
		err = "";
		int w = 0;
		int h = 0;
		try {
			w = Integer.parseInt(request.getParameter("weight"));
		} catch (NumberFormatException e) {
			err += "the entered weight is incorrect " + request.getParameter("weight") + ". ";
		}
		
		try {
			h = Integer.parseInt(request.getParameter("height"));
		} catch (NumberFormatException e) {
			err += "The entered height is incorrect format " + request.getParameter("height") + " ";
		}
		if (err.isBlank()) {
			personImc = new PersonImc(n,w,h);
		}
	}
}
