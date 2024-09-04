package com.phdareys.sql.dao;

import java.sql.Connection;

import com.phdareys.sql.exception.DbsqlException;

// D�claration de la classe abstraite DAO (g�n�rique)
public abstract class Dao<T>{
	
	protected Connection connect=null;	// la connexion utilis�e par toute l'appli
	
	public Dao() throws DbsqlException {
		System.out.println("DAO connect");
		this.connect = SqlConnection.getInstance();

	}
	public void close() {
		SqlConnection.closeInstance();
	}
	
	// D�claration des m�thodes abstraites pour cr�er, rechercher et effacer dans la BD.
	public abstract boolean add (T obj) throws DbsqlException;
	public abstract T get(int id) throws DbsqlException;
	public abstract boolean delete(int id) throws DbsqlException;
}
