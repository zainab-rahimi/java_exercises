package com.zainab.convert.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zainab.convert.model.ConType;
import com.zainab.convert.model.Convert;

/**
 * Servlet implementation class ConvertController
 */
@WebServlet("")
public class ConvertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String URL = "/WEB-INF/Convert.jsp";
	private static final String RESULT = "result";
	private static final String ERR_MSG = "Can't be blank or invalid ";
	private static final int THERESHOLD = 1000;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConvertController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher(URL).forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String err = "";
		Convert convObj = null;
		ConType cType = this.convertIntToCType(request);
		
			convObj = new Convert(Integer.parseInt(request.getParameter("amount")),cType);
			convObj.calcul(); // call the method calcul to do the calculation
			System.out.println(convObj);
		doGet(request, response);
	}

	private ConType convertIntToCType(HttpServletRequest request) {
		int conTypeValue = Integer.parseInt(request.getParameter("convType"));
		switch (conTypeValue) {
		case 0:
			return ConType.Euro2Dollar;
		case 1:
			return ConType.Dollar2Euro;
		default:
            throw new IllegalArgumentException("Invalid conversion type value: " + conTypeValue);
		}
	}

}
