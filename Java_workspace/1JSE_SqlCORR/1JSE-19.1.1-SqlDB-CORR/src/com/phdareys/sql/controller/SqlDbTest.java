package com.phdareys.sql.controller;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class SqlDbTest {
	// l'url de connexion commence par "jdbc(J-Connector/pilote):nom de la BDD:chemin d'acc�s � la localisation de la bdd depuis la racine; d�verrouillage de l'acc�s"
	private static final String URL = 
	"jdbc:mysql://localhost:3308/test?allowKeyRetrieval=true&useSSL=false&serverTimezone=UTC";	//Nom du user
	private static final String USER = "root"; //(phpmyadmin)
	private static final String PASSWD = "";
	
	//Objet Connection=static singleton Pattern (je ne me connecte qu'une fois
	private static Connection connect = null;
	
	//M�thode qui va nous retourner notre instance 

	@Test
	public void test() {
		//fail("Not yet implemented");
		try {
			connect = DriverManager.getConnection(URL, USER, PASSWD);
			System.out.println("Connect�!! ");	// je vois �a=je suis connect�	
			
		} catch (SQLException e) {	// sinon quelle est l'erreur?
			System.err.println("Impossible de se connecter � la BDD: "+e.getMessage());		
		}

	}

}
