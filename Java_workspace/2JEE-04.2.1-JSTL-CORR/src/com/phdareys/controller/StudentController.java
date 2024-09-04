package com.phdareys.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phdareys.dao.StudentDAO;
import com.phdareys.entity.Student;
import com.phdareys.entity.TrafficLight;
import com.phdareys.exception.StudentException;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String URL = "/WEB-INF/StudentView.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentDAO studentDao = new StudentDAO();
		Student [] students=studentDao.get();	// ça vient de la BD
		String err = manageStudents(students);	// gestion des étudiants
		request.setAttribute("students", students);	// passe les étudiants à la vue
		request.setAttribute("err", err);			// + l'erreur!
			// la vue
		this.getServletContext().getRequestDispatcher( URL).forward( request, response );
	}

	private String manageStudents(Student [] students) {
		String err="";
		try {
			for (Student s: students) {
				s.exec();
				//System.out.println(s);	// vérifier que le modèle fonctionne!
			}	
		}
		catch (StudentException e) {
			err = e.getMessage();
		}
		//System.out.println(err);
		return err;
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
