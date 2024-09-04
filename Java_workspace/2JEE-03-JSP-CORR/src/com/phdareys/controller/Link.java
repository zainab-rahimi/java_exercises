package com.phdareys.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Link
 */
// Indiquer le chemin de la jsp à partir du dossier WEB-INF (la route)
@WebServlet("/Link")
public class Link extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String JSP_VIEW = "/WEB-INF/MyJSP.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Link() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    // Appel de la JSP depuis la méthode doGet().
    // doGet() renvoie le contenu de MyJSP.jsp
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
				// Indiquer le chemin de la jsp à partir de la racine du projet.
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
