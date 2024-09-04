package com.phdareys.sql.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlDbTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.printOneEmployee();
		employeeDao.printOneEmployee();
		employeeDao.printOneEmployee();
		employeeDao.printOneEmployee();
	}

}

class DbConnection {
	private static final String URL = 
			"jdbc:mysql://localhost:3308/test?allowKeyRetrieval=true&useSSL=false&serverTimezone=UTC";	//Nom du user
	private static final String USER = "root"; //(phpmyadmin)
	private static final String PASSWD = "";
    private static Connection dbInstance = null;

    private DbConnection() {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
		try {
			dbInstance = DriverManager.getConnection(URL, USER, PASSWD);
			System.out.println("Connexion unique!");
		} catch (SQLException e) {	// sinon quelle est l'erreur?
			System.err.println("Impossible de se connecter à la BDD: "+e.getMessage());
			System.exit(1);
		}
    }

    public static Connection getInstance() {
        if (dbInstance == null) {
        	new DbConnection();
         }
        return dbInstance;
    }

}

class EmployeeDao {
	public void printOneEmployee() {
		System.out.println(DbConnection.getInstance());
		
	}
}



