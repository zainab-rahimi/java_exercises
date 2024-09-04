package com.phdareys.sql.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.phdareys.sql.bean.Employee;
import com.phdareys.sql.exception.DbsqlException;

// La classe EmployeeDAO h�rite de la classe abstraite DAO<T>
public class EmployeeDao extends Dao<Employee>{


	
	public EmployeeDao() throws DbsqlException {
		super();
		// TODO Auto-generated constructor stub
	}

	// Impl�mentation des 3 m�thodes d�clar�es dans la classe abstraite DAO<T>
	
	// M�thode d'insertion d'un salari�
	public boolean add(Employee emp) throws DbsqlException {
		// utilisation des prepared Statement : des ? dans la requ�te sql
		String sql= "INSERT INTO EMPLOYEE (last_name, first_name, salary) VALUES (?, ?, ?);";
		try {
			PreparedStatement preparedStatement = this.connect.prepareStatement(sql);
	        preparedStatement.setString(1, emp.getName());	// substitution des ?
	        preparedStatement.setString(2, emp.getFirstName());	
	        preparedStatement.setInt(3, emp.getSalary());
	        
			// La m�thode executeUpdate() retourne le nbr d'enregistrement correctement ex�cut�s
			int nbMaj = preparedStatement.executeUpdate();
			String mess="Insert Employee: " + emp.getName();
			// Affichage message en fonction de la r�ussite ou non de la m�j.
			System.out.println(nbMaj==1 ? mess + " ok!" : " nok!");
		} catch (SQLException e){
			throw new DbsqlException ("Request " + sql + " is incorrect!: " + e.getMessage());
		}
		return true;
	};
	
	public Employee get(int id) throws DbsqlException  {
		Employee emp = null;
		String sql = "SELECT * FROM EMPLOYEE WHERE ID = " + id;
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
				emp = new Employee(rs.getString("last_name"),				// Cr�ation d'un objet Salarie � partir du contenu de chaque colonne de la BDD correspondant � la ligne retourn�e
									   rs.getString("first_name"),
									   rs.getInt("salary"));
			else
				System.out.println("Employee: " + id + " does not exist!");
			rs.close();
			smt.close();			
		}catch (Exception e) {
			throw new DbsqlException ("Request " + sql + " is incorrect: "+e.getMessage());
		}
		return emp;
	}
	
	public boolean delete(int id) throws DbsqlException {
		String sql = "DELETE FROM EMPLOYEES WHERE id = " + id;
		boolean ret = false;
		try {
			Statement smt = this.connect.createStatement() ;
			int count = smt.executeUpdate(sql) ;								// Stockage du nombre de requ�tes de suppression ex�cut�es 
			ret = count>0 ? true:false;											// Ternaire: si nbr suppression effectu�e > 0 retourne true, sinon retourne false
			System.out.println (ret?"Employee: "+id+ " removed":
				"Employee: " + id + " not removed");
			smt.close();
		} catch (SQLException e) {
			throw new DbsqlException ("Request " + sql + " is incorrect: "+e.getMessage());
		}
		return ret;
	}
	
	public ArrayList<Employee> get() throws DbsqlException {
		String sql =  "SELECT * FROM EMPLOYEE" ;
		ArrayList<Employee> emps = new ArrayList<Employee> ();
		try {
			Statement smt = this.connect.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY) ;
			ResultSet rs = smt.executeQuery(sql) ;
			while (rs.next()) {													// (La lecture des donn�es retourn�es se fait toujours ligne par ligne... 
																				// ... Ici de la 1�re � la derni�re). Ainsi Tant qu'il y a des lignes de r�sultats retourn�s...
				Employee emp = new Employee (rs.getInt("id"),
						rs.getString("last_name"),				// Cr�ation d'un objet Salarie � partir du contenu de chaque colonne de la BDD correspondant � la ligne retourn�e
						   rs.getString("first_name"),
						   rs.getInt("salary"));
				System.out.println (emp);							 // Formatage 
				emps.add(emp);
			}
			rs.close();
			smt.close();
		} catch (SQLException e) {
			throw new DbsqlException ("Request " + sql + " is incorrect: "+e.getMessage());
		}
		return emps;
	}
	
}
