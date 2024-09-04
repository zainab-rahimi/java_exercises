package com.bge.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//
//			System.out.println("trying to connect...") ;
//
//			Connection cn = DriverManager.getConnection(
//
//					"jdbc:mysql://localhost:3306/bge?serverTimezone=UTC", "zainab", "1111") ;
//
//			System.out.println("Connected...") ;
//
//
//			String sql =  "select * from Employee" ;
//
//			Statement smt = cn.createStatement() ; // création statement
//
//			ResultSet rs = smt.executeQuery(sql) ; // exécution commande
//
//			while (rs.next()) {	// boucle dans la BD, affichage d'un champ
//
//				System.out.println("NOM="+rs.getString("name")) ;
//
//			}
//
//			rs.close();
//
//			smt.close();
//
//		}  catch (Exception e) {
//
//			System.out.println(e.getMessage());
//
//		}
		Connection conn = ConnectionSql.getConnection();
		try {
			Statement queryStatement = conn.createStatement();
			queryStatement.executeQuery("Select * from Employee");
			queryStatement.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
