package com.phdareys.sql.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.phdareys.sql.bean.City;
import com.phdareys.sql.exception.DbsqlException;

public class CityDao extends Dao<City> {

	public CityDao() throws DbsqlException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean add(City obj) throws DbsqlException {
		// utilisation des prepared Statement : des ? dans la requête sql
		String sql= "INSERT INTO CITY (name, pop, country) VALUES (?, ?, ?);";
		try {
			PreparedStatement preparedStatement = this.connect.prepareStatement(sql);
	        preparedStatement.setString(1, obj.getName());	// substitution des ?
	        preparedStatement.setInt(2, obj.getPop());	
	        preparedStatement.setString(3, obj.getCountry());
	        
			// La méthode executeUpdate() retourne le nbr d'enregistrement correctement exécutés
			int nbMaj = preparedStatement.executeUpdate();
			String mess="Insert city: " + obj.getName();
			// Affichage message en fonction de la réussite ou non de la màj.
			System.out.println(nbMaj==1 ? mess + " ok!" : " nok!");
		} catch (SQLException e){
			throw new DbsqlException ("Request " + sql + " is incorrect!: " + e.getMessage());
		}
		return true;
	}

	@Override
	public City get(int id) throws DbsqlException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) throws DbsqlException {
		String sql= "DELETE FROM City WHERE id= ?;";
		int nbMaj = 0;
		try {
			PreparedStatement preparedStatement = this.connect.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			nbMaj = preparedStatement.executeUpdate();
		} catch (SQLException e){
			throw new DbsqlException ("Requête de destruction: " + sql + " incorrecte, raison: " + e.getMessage());
		}
		return nbMaj == 1;	// doit ramener exactement 1 sinon la ville n'existe pas

	}

}
