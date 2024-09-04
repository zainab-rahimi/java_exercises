package com.phdareys.sql.controller;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;

public class SqlDbTest {
	// l'url de connexion commence par "jdbc(J-Connector/pilote):nom de la BDD:chemin d'accès à la localisation de la bdd depuis la racine; déverrouillage de l'accès"
	private static final String URL = 
	"jdbc:mysql://localhost:3308/test?allowKeyRetrieval=true&useSSL=false&serverTimezone=UTC";	//Nom du user
	private static final String USER = "root"; //(phpmyadmin)
	private static final String PASSWD = "";
	
	//Objet Connection=static singleton Pattern (je ne me connecte qu'une fois
	private static Connection connect = null;
	
	//Méthode qui va nous retourner notre instance 

	@Test
	public void test() {
		//fail("Not yet implemented");
		try {
			connect = DriverManager.getConnection(URL, USER, PASSWD);
			System.out.println("Connecté!! ");	// je vois ça=je suis connecté	
			
		} catch (SQLException e) {	// sinon quelle est l'erreur?
			System.err.println("Impossible de se connecter à la BDD: "+e.getMessage());		
		}

	}

}
