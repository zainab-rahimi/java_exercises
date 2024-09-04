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
 * Servlet implementation class EmployeeAdd
 */
@WebServlet("/EmployeeAdd")
public class EmployeeAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeAdd() {
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
		try {
			// add salarié en "dur"
			new EmployeeDao().add(new Employee("Djokovic", "Novak", 50000));
			request.setAttribute("emps", new EmployeeDao().get());
			message = "Employé ajouté";
			
		} catch (DbsqlException e) {
			err = "Cannot add Employee: " + e.getError();
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
