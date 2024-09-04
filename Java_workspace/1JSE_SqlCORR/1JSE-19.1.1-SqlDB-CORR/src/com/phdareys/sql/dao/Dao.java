package com.phdareys.sql.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.phdareys.sql.exception.DbsqlException;

public class Dao {
	// ici connexion à une bdd hsqldb (et non mysql)
	// Stockage des données de connexion qui auraient été entrées manuellement à l'ouverture de "runManagerSwing.bat": url + user + password	 
	
	// l'url de connexion commence par "jdbc(J-Connector/pilote):nom de la BDD:chemin d'accès à la localisation de la bdd depuis la racine; déverrouillage de l'accès"
	private static final String URL = 
	//		"jdbc:hsqldb:file:C:\\Users\\Admin\\Documents\\softwares\\hsqldb-2.4.1\\hsqldb\\data\\dbTest;hsqldb.lock_file=false;exists=true";
	// sinon ici à jdbc mysql 
	"jdbc:mysql://localhost:3308/test?allowKeyRetrieval=true&useSSL=false&serverTimezone=UTC";	//Nom du user
//	private static final String USER = "SA";
	private static final String USER = "root"; //(phpmyadmin)
	//Mot de passe de l'utilisateur
	private static final String PASSWD = "";
	
	//Objet Connection
	private static Connection connect = null;
	
	//Méthode qui va nous retourner notre instance 
	// et la créer si elle n'existe pas
	public static Connection getInstance() throws DbsqlException{
		if(connect == null){
			System.out.println("Unique Connection BDD...");
			try {
				connect = DriverManager.getConnection(URL, USER, PASSWD);
			} catch (SQLException e) {
				throw new DbsqlException ("Impossible de se connecter à la BDD: "+e.getMessage());			
			}
		}
		return connect;
	}
	
	//Méthode de déconnexion de la BDD
	public static void closeInstance(){
		try {
			connect.close();
		} catch (SQLException e) {
			System.out.println("Impossible de me déconnecter de la BDD...");
		}
	}
	
}
