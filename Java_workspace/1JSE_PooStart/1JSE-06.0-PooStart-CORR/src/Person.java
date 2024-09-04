
public class Person {
	// 0/ Constante de classe
	private static final String SOCIETE_DEFAUT = "ORANGE" ;
	// 1/ attributs
	private String nom ;
	private String societe ;

	// 2/ constructeur
	public Person (String nom) {
		this(nom, SOCIETE_DEFAUT);	// invoque l'autre constructeur
	}

	// un autre constructeur (peut être généré automatiquement)
	public Person(String nom, String societe) {
		super();
		this.nom = nom.toUpperCase();
		this.setSociete(societe);
	}

	// 3/ méthodes (setter/getter générés automatiquement)
	public void setSociete(String societe) {
		this.societe = societe;
	}

	public String getSociete() {
		return societe;
	}

	// méthode "surchargée" (issue de Object, générée automatiquement!)
	@Override
	public String toString() {
		return "-> Personne [nom=" + nom + ", societe=" + societe + "]";
	}
		
} // class Personne
