package com.phdareys.sql.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class TestMysql
 */
@WebServlet("/TestMysql")
public class TestMysql extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestMysql() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.MysqlConnection();
	}
	private void MysqlConnection(){
		try {
			Context ctx = new InitialContext();
			DataSource dataSource = (DataSource) ctx.lookup("java:/comp/env/jdbc/dbMysql");
			Connection connect = dataSource.getConnection();
			System.out.println("Connect BD ok...");
			// lecture d'une info?
			int id=9;
			String sql = "SELECT * FROM EMPLOYEE WHERE ID = " + id;
			Statement statement=connect.createStatement(						// ... possibilité de spécifier des paramètres pour une lecture particulière des résultats de la requête: 
					ResultSet.TYPE_SCROLL_INSENSITIVE,						// 1er paramètre: la lecture des résultats peut se faire du début vers la fin des données renvoyées, ou inversement 
																			// contrairement à "TYPE_FORWARD_READ" (par défaut) par lequel la consultation des résultats ne se fait qu'en avançant...
																			//... Cependant si la BDD est modifiée pendant son parcours, ces changements n'apparaitront pas pendant la lecture en cours (pour celà utiliser "TYPE_SCROLL_SENSITIVE") 
					ResultSet.CONCUR_READ_ONLY);							// 2nd paramètre: les données peuvent être mises à jour ou non
			System.out.println("Request= " + sql );
			ResultSet resultSet = statement.executeQuery(sql);
			if(resultSet.first()) {
				System.out.println(resultSet.getString("last_name") + " " + resultSet.getString("first_name") + " " + 
						resultSet.getInt("salary"));
			}
			else {
				System.out.println("id inéxistant!!");
			}
			sql= "INSERT INTO EMPLOYEE (last_name, first_name, salary) VALUES('Dupont', 'Paul', 3000);";
			Statement smt=connect.createStatement(); 
			System.out.println(smt.executeUpdate(sql));

		}
		catch (Exception e) {
			System.out.println("Connect BD nok..." + e.getMessage());
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
