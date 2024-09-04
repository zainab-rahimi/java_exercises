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
 * Servlet implementation class ManageEmployee
 */
@WebServlet("/Employee")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Stockage du chemin de 2 jsp... 
		// ... l'une pour une requête valide, reprenant les data salarié
		final String URL_FWD = "/WEB-INF/Employee.jsp";
		// ... l'autre annonçant une erreur de requête
		final String URL_FWD_ERR = "/WEB-INF/EmployeeError.jsp";
		String fwd = URL_FWD;
		
		try {			// url de la forme: http://<nomDomaine>/projet/id=123
			int id= Integer.parseInt(request.getParameter("id"));
			// Connexion BD
			EmployeeDao empDAO = new EmployeeDao();
			 
			// Tentative de récup du salarié
			Employee emp = empDAO.get(id);
//			empDAO.add(new Employee("Dupont", "Pierre", 30, 34000)); // test insert
			empDAO.close();
			if (emp==null) 	// introuvable -> en erreur
				throw new DbsqlException("Cannot find Employee from: " + id);
			// on passe l'objet entier dans un attribut
			System.out.println(emp); // être sûr des data avant d'afficher!
			request.setAttribute("anEmployee", emp);
		}
		catch (DbsqlException e){   // redirection vers jsp d'erreur
			request.setAttribute("anError", e.getError());
			fwd = URL_FWD_ERR; 
		}
		catch (Exception e){   // redirection vers jsp d'erreur
			request.setAttribute("anError", "id not integer");
			fwd = URL_FWD_ERR; 
		}
		
		// Redirection vers une des 2 jsp
		this.getServletContext().getRequestDispatcher(fwd).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
