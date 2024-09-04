package com.phdareys.sql.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.phdareys.sql.bean.Employee;
import com.phdareys.sql.exception.DbsqlException;

// La classe EmployeeDAO hérite de la classe abstraite DAO<T>
public class EmployeeDao extends Dao<Employee>{


	
	public EmployeeDao() throws DbsqlException {
		super();
		// TODO Auto-generated constructor stub
	}

	// Implémentation des 3 méthodes déclarées dans la classe abstraite DAO<T>
	
	// Méthode d'insertion d'un salarié
	public boolean add(Employee emp) throws DbsqlException {
		// utilisation des prepared Statement : des ? dans la requête sql
		String sql= "INSERT INTO EMPLOYEE (last_name, first_name, salary) VALUES (?, ?, ?);";
		try {
			PreparedStatement preparedStatement = this.connect.prepareStatement(sql);
	        preparedStatement.setString(1, emp.getName());	// substitution des ?
	        preparedStatement.setString(2, emp.getFirstName());	
	        preparedStatement.setInt(3, emp.getSalary());
	        
			// La méthode executeUpdate() retourne le nbr d'enregistrement correctement exécutés
			int nbMaj = preparedStatement.executeUpdate();
			String mess="Insert Employee: " + emp.getName();
			// Affichage message en fonction de la réussite ou non de la màj.
			System.out.println(nbMaj==1 ? mess + " ok!" : " nok!");
		} catch (SQLException e){
			throw new DbsqlException ("Request " + sql + " is incorrect!: " + e.getMessage());
		}
		return true;
	};
	
	public Employee get(int id) throws DbsqlException  {
		Employee emp = null;
		String sql = "SELECT * FROM EMPLOYEE WHERE ID = " + id;
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
				emp = new Employee(rs.getString("last_name"),				// Création d'un objet Salarie à partir du contenu de chaque colonne de la BDD correspondant à la ligne retournée
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
			int count = smt.executeUpdate(sql) ;								// Stockage du nombre de requêtes de suppression exécutées 
			ret = count>0 ? true:false;											// Ternaire: si nbr suppression effectuée > 0 retourne true, sinon retourne false
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
			while (rs.next()) {													// (La lecture des données retournées se fait toujours ligne par ligne... 
																				// ... Ici de la 1ère à la dernière). Ainsi Tant qu'il y a des lignes de résultats retournés...
				Employee emp = new Employee (rs.getInt("id"),
						rs.getString("last_name"),				// Création d'un objet Salarie à partir du contenu de chaque colonne de la BDD correspondant à la ligne retournée
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
