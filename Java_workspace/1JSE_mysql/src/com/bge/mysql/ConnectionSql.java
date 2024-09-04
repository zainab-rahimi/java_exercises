package com.bge.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class  ConnectionSql {
	 
	// Declaring the database attributes for connection
	private static final String url = "jdbc:mysql://localhost:3306/bge?serverTimezone=UTC";
	private static final String user = "zainab";
	private static final String pass = "1111";
	
	// create an static object singleton pattern, to ensure have only one connection
	private static Connection conn = null;
	
	public void testConn () {
		 try {
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Une erreur occured: " + e);
		}
	}
	


	
}
