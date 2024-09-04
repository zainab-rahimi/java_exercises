
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

	// un autre constructeur (peut �tre g�n�r� automatiquement)
	public Person(String nom, String societe) {
		super();
		this.nom = nom.toUpperCase();
		this.setSociete(societe);
	}

	// 3/ m�thodes (setter/getter g�n�r�s automatiquement)
	public void setSociete(String societe) {
		this.societe = societe;
	}

	public String getSociete() {
		return societe;
	}

	// m�thode "surcharg�e" (issue de Object, g�n�r�e automatiquement!)
	@Override
	public String toString() {
		return "-> Personne [nom=" + nom + ", societe=" + societe + "]";
	}
		
} // class Personne
