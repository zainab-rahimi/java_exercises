package com.zainab.servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RandGenController
 */
@WebServlet("/random")
public class RandGenController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String RandomNumberView = "/WEB-INF/randView.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RandGenController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Random rand = new Random();
		int num = rand.nextInt(1, 100) + 1;
		
		//request.setAttribute("ServerPort", request.getServerPort());
		request.setAttribute("val", num);
		System.out.println(request.getServerPort() + " " + num);
		this.getServletContext().getRequestDispatcher(RandomNumberView).forward(request, response);
		
	}

	@Override
	public String toString() {
		return "RandGenController [toString()=" + super.toString() + "]";
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
