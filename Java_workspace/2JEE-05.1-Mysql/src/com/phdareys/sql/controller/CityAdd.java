package com.phdareys.sql.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phdareys.sql.bean.City;
import com.phdareys.sql.dao.CityDao;
import com.phdareys.sql.exception.DbsqlException;

/**
 * Servlet implementation class CityAdd
 */
@WebServlet("/CityAdd")
public class CityAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CityAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {	// recup des paramètres de l'url pour fabriquer une city!
				City c=new City(request.getParameter("name"), 
						Integer.parseInt(request.getParameter("pop")), 
						request.getParameter("country"));
					// j'insère ma city
				new CityDao().add(c);
				System.out.println("City: " + c.getName() + " insérée!");
				
			} catch (DbsqlException e) {
				System.err.println(e.getMessage());
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
