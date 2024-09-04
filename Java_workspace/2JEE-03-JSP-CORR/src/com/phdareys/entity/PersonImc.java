package com.phdareys.entity;

public class PersonImc {
	// 1/ les attributs?
	private String name;
	private int weight;
	private int height;

	private double imc;	// out

	// 2/ constructeur(s) ? (généré)
	public PersonImc(String name, int weight, int height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	public PersonImc(String name) {
		this(name, 80, 180);		// par défaut 80kg, 180cms
	}

	// 3/ méthodes publiques : calcul
	public void exec() {
		imc = this.round ((double) (10000*weight/Math.pow(this.height, 2)), 2);
	}

	// 4/ représentation de l'objet complexe (généré, toString() ou getters/setters)
	@Override
	public String toString() {
		return "[name=" + name + ", weight=" + weight + " kg, height=" + height + " cms, imc=" + imc + "]";
	}
	public int getHeight() {
		return height;
	}

	// 5/ méthodes privées (aides diverses)

	// b chiffres après la virgule
	private double round(double a, int b) {
		return (double) ( (int) (a * Math.pow(10, b) + .5)) / 
				Math.pow(10, b);
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public double getImc() {
		return imc;
	}

}
