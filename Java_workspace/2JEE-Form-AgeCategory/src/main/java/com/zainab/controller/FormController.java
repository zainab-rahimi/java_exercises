package com.zainab.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zainab.form.FormValidation;
import com.zainab.model.Person;

/**
 * Servlet implementation class FormController
 */
@WebServlet("")
public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String URL = "/WEB-INF/FormPerson.jsp";
    private static final String RESULT_URL = "/WEB-INF/Result.jsp";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//this.getServletContext().getRequestDispatcher(URL).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		FormValidation formvalidation= new FormValidation(request);
		request.setAttribute("person", formvalidation.getPerson()); //business object
		System.out.println(request.getParameter("person"));
		System.out.println(formvalidation.getErrors() + " " + formvalidation.getPerson());
		if (formvalidation.getErrors().isEmpty()) {
			formvalidation.getPerson().getAgeCat();
			this.getServletContext().getRequestDispatcher(RESULT_URL).forward(request, response);
		}
		else {
			request.setAttribute("errors", formvalidation.getErrors());
		}
		
		doGet(request, response);
	}

}
