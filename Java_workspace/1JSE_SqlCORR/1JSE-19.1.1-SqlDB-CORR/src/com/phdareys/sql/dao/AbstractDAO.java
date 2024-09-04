package com.phdareys.sql.dao;

import java.sql.Connection;

import com.phdareys.sql.exception.DbsqlException;

// Autre solution à la place de Dao.class et de l'interface Crudable
public abstract class AbstractDAO<T> {
	private static Connection connect = null;
	
	//Méthode qui va nous retourner notre instance 
	// et la créer si elle n'existe pas
	public static Connection getInstance() throws DbsqlException{
		return null;
	}
	abstract public boolean delete(T o) throws DbsqlException;
	// ... avec insert, update, get...
}
