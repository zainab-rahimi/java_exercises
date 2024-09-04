package com.phdareys.sql.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.phdareys.sql.bean.Employee;
import com.phdareys.sql.exception.DbsqlException;

public class EmployeeDao implements Crudable<Employee> {

	public EmployeeDao() {
		super();
	}
	
	public Employee get(int id) throws DbsqlException {
		Employee salarie = null;
		String sql = "SELECT * FROM salaries WHERE id = " + id;
		try {   									       		// A la cr�ation de l'objet Statement...
			Statement smt = Dao.getInstance().createStatement(  		// ... possibilit� de sp�cifier des param�tres pour une lecture particuli�re des r�sultats de la requ�te: 
																// 1er param�tre: la lecture des r�sultats peut se faire du d�but vers la fin des donn�es renvoy�es, ou inversement 
																// contrairement � "TYPE_FORWARD_READ" (par d�faut) par lequel la consultation des r�sultats ne se fait qu'en avan�ant...
					ResultSet.TYPE_SCROLL_INSENSITIVE,      	//... Cependant si la BDD est modifi�e pendant son parcours, ces changements n'apparaisseront pas pendant la lecture en cours (pour cel� utiliser "TYPE_SCROLL_SENSITIVE") 
																// 2nd param�tre: les donn�es peuvent �tre mises � jour ou non
					ResultSet.CONCUR_READ_ONLY) ; 				// Ici lecture seule (par d�faut), utiliser "CONCUR_UPDATABLE" pour modifier les donn�es et m�j la bdd.
			ResultSet rs = smt.executeQuery(sql) ;				// A l'ex�cution de la requ�te sql, l'objet ResultSet r�cup�re et stocke les donn�es.
			if(rs.first())										// On place le curseur sur la 1�re ligne de r�sultat, si r�sultat il y a
				salarie = new Employee(id, rs.getString("nom"),  // Cr�ation d'un objet Salarie � partir du contenu de chaque colonne de la BDD correspondant � la ligne retourn�e
						rs.getString("prenom"), 
						rs.getInt("age"), 
						rs.getInt("salaire"));
			else
				System.out.println("Salarie:" + id + " Introuvable");

			rs.close();											
			smt.close();
		} catch (SQLException e) {
			throw new DbsqlException ("Requete: " + sql + " incorrecte! "+e.getMessage());
		}
		return salarie;
	}
	
	public ArrayList<Employee> get() throws DbsqlException {
		String sql =  "SELECT * FROM salaries" ;
		ArrayList<Employee> list = new ArrayList<Employee>();
		try {
			Statement smt = Dao.getInstance().createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY) ;
			ResultSet rs = smt.executeQuery(sql) ;
			while (rs.next()) {									// (La lecture des donn�es retourn�es se fait toujours ligne par ligne... 
																// ... Ici de la 1�re � la derni�re). Ainsi Tant qu'il y a des lignes de r�sultats retourn�s...
				Employee s = new Employee(rs.getInt("id"),		// ... cr�ation d'un nouvel objet Salarie
						rs.getString("NOM"),
						rs.getString("PRENOM"),
						rs.getInt("AGE"),
						rs.getInt("SALAIRE"));
				list.add(s);
			}
			rs.close();
			smt.close();
		} catch (SQLException e) {
			throw new DbsqlException ("Liste, Requete: " + sql + " incorrecte! ");
		}
		//System.out.println (list);    
		return list;
	}

	public boolean delete(Employee e) throws DbsqlException {
			// utilisation de prepared statement recommand�e!
		String sql = "DELETE FROM salaries WHERE id = ?";
		boolean ret = false;
		try {
			PreparedStatement preparedStatement = Dao.getInstance().prepareStatement(sql);
	        preparedStatement.setInt(1, e.getId());	// substitution des ?
	        int count = preparedStatement.executeUpdate();
			ret = count>0;							// Ternaire: si nbr suppression effectu�e > 0 retourne true, sinon retourne false
			System.out.println (ret?"Salarie: "+e.getId()+ " d�truit":
				"Salari�: " + e.getId() + " non d�truit");
			preparedStatement.close();
			if (!ret)
				throw new DbsqlException ("Delete avec Requete: " + sql + " incorrect! ");

		} catch (SQLException e1) {
			throw new DbsqlException ("Delete avec Requete: " + sql + " incorrecte! ");
		}
		return ret;
	}
	
	public boolean add(Employee e) throws DbsqlException {
		String sql =  
				"INSERT INTO salaries (NOM,PRENOM,AGE,SALAIRE) VALUES (?,?,?,?);" ;
		try {         
			PreparedStatement pSmt = Dao.getInstance().prepareStatement(sql);  
			pSmt.setString(1, e.getName());
			pSmt.setString(2, e.getFirstName());
			pSmt.setInt(3, e.getAge());
			pSmt.setInt(4, e.getSalary());
			// ... Cet objet Statement permet d'ex�cuter des requ�te sql (ici de cr�ation) en interrogeant la BDD
			int res = pSmt.executeUpdate() ;      // La requ�te retourne le nombre de cr�ation correctement ex�cut�es  
			//
			String mess= "Insertion Salari�: " + e.getName() ;
			System.out.println(res== 1 ? mess + " ok":			// Ternaire: affichage d'un message de r�sultat en fonction de la bonne ex�cution de la requ�te sql	
				" nok") ;
			pSmt.close(); 							//Fermeture de l'objet Statement, non obligatoire mais recommand�
			if (res!=1)
				throw new DbsqlException ("Ajout avec: " + sql + " incorrect! ");
			
		} catch (SQLException e1) {
			throw new DbsqlException ("Insert avec Requete Prepar�e: " + sql + " incorrecte! " + e1.getMessage());
		}
		return false;
	}

	public boolean update(Employee e) throws DbsqlException {
		String sql = "UPDATE employees SET nom='" +
				e.getName() + "', prenom='" +
				e.getFirstName() + "', age=" +
				e.getAge() + ", salaire=" + e.getSalary() +
				" WHERE id = " + e.getId();
		System.out.println (sql);
		boolean ret = false;
		try {
			Statement smt = Dao.getInstance().createStatement() ;
			int count = smt.executeUpdate(sql) ;				// Stockage du nombre de requ�tes de suppression ex�cut�es 
			ret = count>0;							// Ternaire: si nbr suppression effectu�e > 0 retourne true, sinon retourne false
			System.out.println (ret?"Salarie: "+e.getId()+ " maj":
				"Salari�: " + e.getId() + " non maj");
			smt.close();
		} catch (SQLException e1) {
			throw new DbsqlException ("Update avec Requete: " + sql + " incorrecte! ");
		}
		return ret;

	}

}
