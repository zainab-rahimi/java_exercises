package com.phdareys.sql.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.phdareys.sql.bean.Actor;
import com.phdareys.sql.exception.DbsqlException;

public class ActorDAO implements Crudable<Actor> {

	@Override
	public Actor get(int id) throws DbsqlException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Actor> get() throws DbsqlException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Actor o) throws DbsqlException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(Actor o) throws DbsqlException {
		String sql =  
				"INSERT INTO Actor (NAME,NAT) VALUES (?,?);" ;
		try {         
			PreparedStatement pSmt = Dao.getInstance().prepareStatement(sql);  
			pSmt.setString(1, o.getName());
			pSmt.setString(2, o.getNat());
			int res = pSmt.executeUpdate() ;      // La requête retourne le nombre de création correctement exécutées  
			pSmt.close(); 							//Fermeture de l'objet Statement, non obligatoire mais recommandé
			if (res!=1)
				throw new DbsqlException ("Ajout avec: " + sql + " incorrect! ");
			
		} catch (SQLException e1) {
			throw new DbsqlException ("Insert avec Requete Preparée: " + sql + " incorrecte! " + e1.getMessage());
		}
		return false;
	}

	@Override
	public boolean update(Actor o) throws DbsqlException {
		// TODO Auto-generated method stub
		return false;
	}

}
