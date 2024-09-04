package com.phdareys.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Link1
 */
@WebServlet("/Link1")
// La servlet Link1 est une classe java qui h�rite de HttpServlet.
public class Link1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Link1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    // La servlet h�rite des 2 principales m�thodes de HttpServlet: doGet() et doPost(), m�thodes de communication avec le serveur.
    // M�thode doGet() pour charger la page demand�e par le visiteur.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s="My name is: Bond, ";
		s += "James Bond, il est: " + new Date();
		System.out.println("Dans le servlet(java): " + s);
		
		//response.getWriter().append(s).append(request.getContextPath());
		response.getWriter().append("<html><head><title>title</title></head><body><h2>Titre H2...</h2>"+s+"</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	// M�thode doPost() pour envoyer des donn�es de formulaire par exemple.
	// Ici aucun traitement associ� � la requ�te de type POST, la m�thode doPost() va alors ex�cuter la m�thode doGet().
	// La servlet est ainsi capable de renvoyer une r�ponse pour les 2 types de requ�te. 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
