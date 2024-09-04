package com.phdareys.convert.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.phdareys.convert.exception.ConvertException;
import com.phdareys.convert.model.ConvType;
import com.phdareys.convert.model.Convert;

/**
 * Servlet implementation class ConvertController
 */
@WebServlet("")
public class ConvertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String URL = "/WEB-INF/Convert.jsp";
	private static final String LAST_RESULT = "result";
	private static final String ERROR_MESS = "Cannot be blank or Invalid (>1000)!";
	private static final int THRESHOLD = 1000;
       
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
		this.getServletContext().getRequestDispatcher(URL).forward( request, response );		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String err="";
		Convert convObj = null;
		ConvType cType = this.convertIntToCType(request);	// déterminer type Conversion
		try {
			convObj = new Convert
					(Integer.parseInt(request.getParameter("amount")), cType);
			convObj.exec();	// do the job!
			System.out.println (convObj);
			if (convObj.getResult() > THRESHOLD)
				throw new ConvertException(ERROR_MESS); 

		} catch (Exception e) {
			// TODO Auto-generated catch block
			convObj=null;
			err = e.getMessage();
		} 
		request.setAttribute("error", err);
		request.setAttribute("convert", convObj);
		
		doGet(request, response);
	}
	
	private ConvType convertIntToCType(HttpServletRequest request) {
		return Integer.parseInt(request.getParameter("convType"))==0?
				ConvType.EURO_TO_DOLLAR : 
					(Integer.parseInt(request.getParameter("convType"))==1?
							 ConvType.DOLLAR_TO_EURO: ConvType.EURO_TO_POUND);		
		
	}

}
