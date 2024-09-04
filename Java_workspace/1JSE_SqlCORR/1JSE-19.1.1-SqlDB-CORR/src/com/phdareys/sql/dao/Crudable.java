package com.phdareys.sql.dao;

import java.util.ArrayList;
import com.phdareys.sql.exception.DbsqlException;

public interface Crudable<T> {
		// T est la classe m�tier g�n�rique ! 
		// toutes les m�thodes l�vent des exceptions!
	public T get(int id) throws DbsqlException;	// retour d'une ligne
	public ArrayList<T> get() throws DbsqlException; // retour de toutes les lignes
	public boolean delete(T o) throws DbsqlException;	// delete ligne
	public boolean add(T o) throws DbsqlException; 	// insert d'une ligne
	public boolean update(T o) throws DbsqlException; // update d'une ligne

}
