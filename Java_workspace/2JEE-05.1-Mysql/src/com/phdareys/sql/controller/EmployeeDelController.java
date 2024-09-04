package com.phdareys.sql.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phdareys.sql.bean.Employee;
import com.phdareys.sql.dao.EmployeeDao;
import com.phdareys.sql.exception.DbsqlException;

/**
 * Servlet implementation class EmployeeDelController
 */
@WebServlet("/EmployeeDel")
public class EmployeeDelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeDelController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String URL_FWD = "/WEB-INF/Employees.jsp";
		String err = "";
		String message = "";
		int id=0;
		try {
			id= Integer.parseInt(request.getParameter("id"));
			// supp salarié
			new EmployeeDao().delete(id);
			request.setAttribute("emps", new EmployeeDao().get());
			message = "Employé supprimé: " + id;
			
		} catch (Exception e) {
			err = "Cannot delete Employee: "+id;
		}
			//	redirect to jsp	(qui va afficher tableau et map) grâce à la JSTL
		request.setAttribute("error", err);
		request.setAttribute("message", message);
		this.getServletContext().getRequestDispatcher(URL_FWD).forward( request, response );		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
