package com.phdareys.person.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.phdareys.person.form.PersonForm;
import com.phdareys.person.form.UserForm;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserCreate")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String URL = "/WEB-INF/UserForm.jsp";
	private static final String TARGET_URL = "/WEB-INF/User.jsp";

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
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
		UserForm userForm = new UserForm (request);
		request.setAttribute("user", userForm.getUser());	
		//System.out.println(userForm.getErrors() + " " + userForm.getUser());
		if (userForm.getErrors().isEmpty()) { 
			this.getServletContext().getRequestDispatcher(TARGET_URL).forward( request, response );	
		}
		else {	// on rappelle le form en cas d'erreur avec les erreurs
			request.setAttribute("errors", userForm.getErrors());	// les erreurs
			doGet(request, response);
		}
	}

}
