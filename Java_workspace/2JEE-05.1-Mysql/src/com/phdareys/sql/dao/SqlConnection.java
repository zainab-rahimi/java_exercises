package com.phdareys.sql.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.phdareys.sql.exception.DbsqlException;

public class SqlConnection {

	// Objet Connection statique (singleton pattern)
	private static Connection connect = null;

	// Constructeur privé
	private SqlConnection() throws DbsqlException{
		// Le principe de connexion est différent de celui d'un projet Standalone
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("java:/comp/env/jdbc/dbMysql");
			connect = ds.getConnection();
			System.out.println("Connect BD  ok...");
		}
		catch (Exception e){ // pour simplifier
			throw new DbsqlException("Connect BD  nok, error: " + e.getMessage());
			
		}

	}

	//Méthode qui va nous retourner notre instance 
	// et la créer si elle n'existe pas
	public static Connection getInstance() throws DbsqlException {
		if (connect == null) {
			System.out.println("1ère et unique connection BD par process...");
			new SqlConnection();
		}
		return connect;

	}
	public static void closeInstance(){
		try {
			connect.close();
			connect = null;
			System.out.println("close BD");
		} catch (SQLException e) {
			System.out.println ("Cannot disconnect from Db");
		}
	}

}
