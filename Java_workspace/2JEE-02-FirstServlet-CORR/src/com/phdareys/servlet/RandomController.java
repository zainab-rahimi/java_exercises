package com.phdareys.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Random
 */
@WebServlet("/Random")
public class RandomController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String JSP_VIEW = "/WEB-INF/RandomView.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RandomController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Afficher un random entre 1 et 100
		java.util.Random rd=new java.util.Random();
		int n = 100;
		int i = rd.nextInt() % n;
		int randomNum =  Math.abs(1 + i);
			// des infos du serveur
		request.setAttribute("serverPort", request.getServerPort());
		request.setAttribute("value", randomNum);	// envoi de la data à la vue
		System.out.println(request.getServerPort() + " " + randomNum);
		this.getServletContext().getRequestDispatcher(JSP_VIEW).forward( request, response );	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
