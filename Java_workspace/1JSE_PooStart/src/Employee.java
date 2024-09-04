
public class Employee{
	// Define two primitive variables
	private String nom;  
	private String Societe;
	// create another primitive variable to hold the default value
	private static final String Societe_defaut = "Orange";
	// create constructor for the default value variable
	public Employee (String nom) {
		this(nom, Societe_defaut);
	}
	// create constructor for the two fix primitive variable
	public Employee(String nom, String societe) {
		super();
		this.nom = nom.toUpperCase();
		this.Societe = societe;
	}
	
	
	public String getSociete() {
		return Societe;
	}

	public void setSociete(String societe) {
		Societe = societe;
	}

	@Override
	public String toString() {
		return "Employee [nom=" + nom + ", Societe=" + Societe + "]";
	}




	
}


