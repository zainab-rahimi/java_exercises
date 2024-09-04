package com.phdareys.person.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.phdareys.person.form.PersonForm;

/**
 * Servlet implementation class PersonController
 */
// la route ! ici c'est la racine!
@WebServlet("")
public class PersonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String URL = "/WEB-INF/PersonForm.jsp";
	private static final String TARGET_URL = "/WEB-INF/Person.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher(URL).forward( request, response );		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PersonForm personForm = new PersonForm (request);
		request.setAttribute("person", personForm.getPerson());	// l'objet métier
		//System.out.println(personForm.getErrors() + " " + personForm.getPerson());
		if (personForm.getErrors().isEmpty()) { //pas d'erreur -> calcul categ+redirection
			personForm.getPerson().exec();	// calcul du cas nominal
			// s'il faut mettre l'info en BD!
			this.getServletContext().getRequestDispatcher(TARGET_URL).forward( request, response );	
		}
		else {	// on rappelle le form en cas d'erreur avec les erreurs
			request.setAttribute("errors", personForm.getErrors());	// les erreurs
	
			doGet(request, response);
		}
	}

}
