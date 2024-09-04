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
		try {																// A la création de l'objet Statement...
			Statement smt=this.connect.createStatement(						// ... possibilité de spécifier des paramètres pour une lecture particulière des résultats de la requête: 
					ResultSet.TYPE_SCROLL_INSENSITIVE,						// 1er paramètre: la lecture des résultats peut se faire du début vers la fin des données renvoyées, ou inversement 
																			// contrairement à "TYPE_FORWARD_READ" (par défaut) par lequel la consultation des résultats ne se fait qu'en avançant...
																			//... Cependant si la BDD est modifiée pendant son parcours, ces changements n'apparaitront pas pendant la lecture en cours (pour celà utiliser "TYPE_SCROLL_SENSITIVE") 
					ResultSet.CONCUR_READ_ONLY);							// 2nd paramètre: les données peuvent être mises à jour ou non
			System.out.println("Request= " + sql );
																			// Ici lecture seule (par défaut), utiliser "CONCUR_UPDATABLE" pour modifier les données et màj la bdd.
			ResultSet rs = smt.executeQuery(sql);							// A l'exécution de la requête sql, l'objet ResultSet récupère et stocke les données.
			if(rs.first())													// On place le curseur sur la 1ère ligne de résultat, si résultat il y a
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
