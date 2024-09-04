package com.phdareys.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phdareys.dao.DeptDAO;
import com.phdareys.entity.TrafficLight;

/**
 * Servlet implementation class TrafficLightController
 */
@WebServlet("/TrafficLightController")
public class TrafficLightController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String URL = "/WEB-INF/TrafficLightView.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TrafficLightController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TrafficLight trafficLight = new TrafficLight();
		trafficLight.exec();
		request.setAttribute("light1", trafficLight.getLights()[0]);
		request.setAttribute("light2", trafficLight.getLights()[1]);
		request.setAttribute("light3", trafficLight.getLights()[2]);
		request.setAttribute("current", trafficLight.getCurrent());
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
