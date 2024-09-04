package com.phdareys.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phdareys.dao.DeptDAO;

/**
 * Servlet implementation class DeptController
 */
@WebServlet("/DeptController")
public class DeptController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String URL = "/WEB-INF/DeptView.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeptController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Map exploité ensuite par JSTL:	
		request.setAttribute("deptMap", (new DeptDAO()).get());
		// Redirection vers la jsp:
		this.getServletContext().getRequestDispatcher( URL).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
