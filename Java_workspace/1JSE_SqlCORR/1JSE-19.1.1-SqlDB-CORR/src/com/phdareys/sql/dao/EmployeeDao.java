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
		try {   									       		// A la création de l'objet Statement...
			Statement smt = Dao.getInstance().createStatement(  		// ... possibilité de spécifier des paramètres pour une lecture particulière des résultats de la requête: 
																// 1er paramètre: la lecture des résultats peut se faire du début vers la fin des données renvoyées, ou inversement 
																// contrairement à "TYPE_FORWARD_READ" (par défaut) par lequel la consultation des résultats ne se fait qu'en avançant...
					ResultSet.TYPE_SCROLL_INSENSITIVE,      	//... Cependant si la BDD est modifiée pendant son parcours, ces changements n'apparaisseront pas pendant la lecture en cours (pour celà utiliser "TYPE_SCROLL_SENSITIVE") 
																// 2nd paramètre: les données peuvent être mises à jour ou non
					ResultSet.CONCUR_READ_ONLY) ; 				// Ici lecture seule (par défaut), utiliser "CONCUR_UPDATABLE" pour modifier les données et màj la bdd.
			ResultSet rs = smt.executeQuery(sql) ;				// A l'exécution de la requête sql, l'objet ResultSet récupère et stocke les données.
			if(rs.first())										// On place le curseur sur la 1ère ligne de résultat, si résultat il y a
				salarie = new Employee(id, rs.getString("nom"),  // Création d'un objet Salarie à partir du contenu de chaque colonne de la BDD correspondant à la ligne retournée
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
			while (rs.next()) {									// (La lecture des données retournées se fait toujours ligne par ligne... 
																// ... Ici de la 1ère à la dernière). Ainsi Tant qu'il y a des lignes de résultats retournés...
				Employee s = new Employee(rs.getInt("id"),		// ... création d'un nouvel objet Salarie
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
			// utilisation de prepared statement recommandée!
		String sql = "DELETE FROM salaries WHERE id = ?";
		boolean ret = false;
		try {
			PreparedStatement preparedStatement = Dao.getInstance().prepareStatement(sql);
	        preparedStatement.setInt(1, e.getId());	// substitution des ?
	        int count = preparedStatement.executeUpdate();
			ret = count>0;							// Ternaire: si nbr suppression effectuée > 0 retourne true, sinon retourne false
			System.out.println (ret?"Salarie: "+e.getId()+ " détruit":
				"Salarié: " + e.getId() + " non détruit");
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
			// ... Cet objet Statement permet d'exécuter des requête sql (ici de création) en interrogeant la BDD
			int res = pSmt.executeUpdate() ;      // La requête retourne le nombre de création correctement exécutées  
			//
			String mess= "Insertion Salarié: " + e.getName() ;
			System.out.println(res== 1 ? mess + " ok":			// Ternaire: affichage d'un message de résultat en fonction de la bonne exécution de la requête sql	
				" nok") ;
			pSmt.close(); 							//Fermeture de l'objet Statement, non obligatoire mais recommandé
			if (res!=1)
				throw new DbsqlException ("Ajout avec: " + sql + " incorrect! ");
			
		} catch (SQLException e1) {
			throw new DbsqlException ("Insert avec Requete Preparée: " + sql + " incorrecte! " + e1.getMessage());
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
			int count = smt.executeUpdate(sql) ;				// Stockage du nombre de requêtes de suppression exécutées 
			ret = count>0;							// Ternaire: si nbr suppression effectuée > 0 retourne true, sinon retourne false
			System.out.println (ret?"Salarie: "+e.getId()+ " maj":
				"Salarié: " + e.getId() + " non maj");
			smt.close();
		} catch (SQLException e1) {
			throw new DbsqlException ("Update avec Requete: " + sql + " incorrecte! ");
		}
		return ret;

	}

}
