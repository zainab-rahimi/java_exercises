package com.phdareys.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phdareys.entity.PersonImc;

/**
 * Servlet implementation class Imc
 */
@WebServlet("/ImcController")
public class ImcController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String JSP_VIEW = "/WEB-INF/ImcView.jsp";
	private static final String JSP_ERR_VIEW = "/WEB-INF/ImcErr.jsp";
	
	private String err = "";	// attributs err et objet m�tier
	private PersonImc personImc=null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImcController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PersonImc personImc = new PersonImc("Djokovic", 85, 185);	// appel mod�le
		this.checkParams(request);
		String view=JSP_ERR_VIEW;
		if (err.trim().isEmpty()){// pas d'erreur
			personImc.exec();
			System.out.println(personImc);	// s'assurer que le mod�le fonctionne
			request.setAttribute("anImc", personImc);	// envoi de la data � la vue
			view=JSP_VIEW;	// vue nominale
		}
		request.setAttribute("err", err);	// envoi err � la vue
		this.getServletContext().getRequestDispatcher(view).forward( request, response );	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void checkParams(HttpServletRequest request) {
		String n=request.getParameter("name");
		err = "";
		int w=0; int h=0;
		try {
			w=Integer.parseInt(request.getParameter("weight"));
		}
		catch (Exception e){
			err+="Pb avec poids: " + request.getParameter("weight");
		}

		try {
			h=Integer.parseInt(request.getParameter("height"));
		}
		catch (Exception e){
			err+=" Pb avec taille: " + request.getParameter("height");
		}
		if (err.trim().isEmpty())
			personImc = new PersonImc (n, w, h);	// tout ok!
	}

}
