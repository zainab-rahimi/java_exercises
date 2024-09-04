
public class PersonImc {	// Classe m�tier
		// 0/ constantes de classe
	private static final int WEIGHT_DEFAULT = 85; 
	private static final int HEIGHT_DEFAULT = 185; 
		// 1/ les attributs?
	private String name;
	private int weight;
	private int height;
	private double imc=0.0;	// out
	
		// 2/ constructeur(s) ? (g�n�r� automatiquement ou semi-automatiquement)
	public PersonImc(String name, int weight, int height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	public PersonImc(String name) {	// un autre constructeur
		this(name, WEIGHT_DEFAULT, HEIGHT_DEFAULT);	// appelle le 1�r
	}
	public PersonImc(String name, int height) {	// un autre constructeur
		this(name, WEIGHT_DEFAULT, height);	// appelle le 1�r
	}

		// 3/ m�thodes publiques : calcul
	public void exec() {	// souvent start() ou run() ou execute()...
		imc = this.round((double) (10000*weight/Math.pow(this.height, 2)), 1);
	}
	
		// 4/ repr�sentation de l'objet complexe (g�n�r�, toString() ou getters/setters)
	@Override
	public String toString() {
		return "----> PersonImc [name=" + name + ", weight=" + weight + " kg, height=" + height + " cms, imc=" + imc + "]";
	}
	
		// 5/ m�thodes priv�es (aides diverses)
	
	// b chiffres apr�s la virgule
	private double round(double a, int b) {
		return (double) ( (int) (a * Math.pow(10, b) + .5)) / 
				Math.pow(10, b);
	}
	
}
