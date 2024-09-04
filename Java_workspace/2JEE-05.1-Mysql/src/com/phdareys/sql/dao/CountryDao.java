package com.phdareys.sql.dao;

import java.sql.ResultSet;
import java.sql.Statement;

import com.phdareys.sql.bean.Country;
import com.phdareys.sql.exception.DbsqlException;

public class CountryDao extends Dao<Country> {

	public CountryDao() throws DbsqlException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean add(Country obj) throws DbsqlException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Country get(int id) throws DbsqlException {
		Country c = null;
		String sql = "SELECT * FROM COUNTRY WHERE ID = " + id;
		try {																// A la cr�ation de l'objet Statement...
			Statement smt=this.connect.createStatement(						// ... possibilit� de sp�cifier des param�tres pour une lecture particuli�re des r�sultats de la requ�te: 
					ResultSet.TYPE_SCROLL_INSENSITIVE,						// 1er param�tre: la lecture des r�sultats peut se faire du d�but vers la fin des donn�es renvoy�es, ou inversement 
																			// contrairement � "TYPE_FORWARD_READ" (par d�faut) par lequel la consultation des r�sultats ne se fait qu'en avan�ant...
																			//... Cependant si la BDD est modifi�e pendant son parcours, ces changements n'apparaitront pas pendant la lecture en cours (pour cel� utiliser "TYPE_SCROLL_SENSITIVE") 
					ResultSet.CONCUR_READ_ONLY);							// 2nd param�tre: les donn�es peuvent �tre mises � jour ou non
			System.out.println("Request= " + sql );
																			// Ici lecture seule (par d�faut), utiliser "CONCUR_UPDATABLE" pour modifier les donn�es et m�j la bdd.
			ResultSet rs = smt.executeQuery(sql);							// A l'ex�cution de la requ�te sql, l'objet ResultSet r�cup�re et stocke les donn�es.
			if(rs.first())													// On place le curseur sur la 1�re ligne de r�sultat, si r�sultat il y a
				c = new Country(rs.getString("name"), rs.getInt("pop"));
			else
				System.out.println("Employee: " + id + " does not exist!");
			rs.close();
			smt.close();			
		}catch (Exception e) {
			throw new DbsqlException ("Request " + sql + " is incorrect: "+e.getMessage());
		}
		return c;
	}

	@Override
	public boolean delete(int id) throws DbsqlException {
		// TODO Auto-generated method stub
		return false;
	}

}
