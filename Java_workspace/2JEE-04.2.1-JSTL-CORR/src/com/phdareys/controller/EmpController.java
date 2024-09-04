package com.phdareys.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phdareys.dao.EmpDAO;

/**
 * Servlet implementation class Link1
 */
@WebServlet("/EmpController")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String URL = "/WEB-INF/EmpView.jsp";
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = URL;
			// ArrayList exploitée ensuite par JSTL:	
		EmpDAO empDAO = new EmpDAO();
		request.setAttribute("empList", empDAO.getEmps());
			// Redirection vers la jsp.
		this.getServletContext().
			getRequestDispatcher( url).
			forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
