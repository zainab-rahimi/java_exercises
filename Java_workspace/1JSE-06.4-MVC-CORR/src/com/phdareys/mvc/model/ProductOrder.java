package com.phdareys.mvc.model;

public class ProductOrder {
		// 1.1: les constantes de classe
	private static final int PRICE_THRESHOLD=1000;	// au del� de ce prix gratuit
	private static final int DIST_THRESHOLD=20;		// en dessous de cette distance livraison gratuite
	private static final int TAX_LOW_PRICE=30;			// taxe prix
	private static final int TAX_LONG_DIST=40;			// taxe distance
	
		// 1.2: les attributs (ou vi)
	private String productName="";		// en entr�e le nom du produit
	private int price=0;			// prixHT
	private int dist=0;			// distance de livraison
	private int finalPrice=0;	// � calculer! (on aurait pu rajouter les frais)

		// 2: constructeur(s) (g�n�r� par Eclipse)
	public ProductOrder(String productName, int price, int dist) {
		super();
		this.productName = productName.toUpperCase();
		this.price = price;
		this.dist = dist;
	}
		// 2: 2�me constructeur
	public ProductOrder(String productName, int price) {
		this(productName, price, 10);	// par d�faut on livre � 10kms 
	}
		// 2: 3�me constructeur (je vends essentiellement des tables � 10kms)
	public ProductOrder(int price) {
		this("table", price);	// par d�faut on livre � 10kms 
	}

	// 3.1: m�thodes publiques(s)
	public void run() {
		finalPrice = price;
		if (price >= PRICE_THRESHOLD) {
			return;	// pas de taxe!
		}
		finalPrice += TAX_LOW_PRICE;	// produit 'pas cher'
		if (dist > DIST_THRESHOLD) {	// c'est loin on paie plus que si c'est pr�s!
			finalPrice += TAX_LONG_DIST;
		}
	}
	
		// 3.2: toString(), getter(), setter()...(m�thodes g�n�r�es par Eclipse)
	@Override
	public String toString() {
		return "Product [name=" + productName + ", price=" + price + ", dist=" + dist + ", finalPrice=" + finalPrice + "]";
	}

	public String getName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}

	public int getDist() {
		return dist;
	}

	public int getFinalPrice() {
		return finalPrice;
	}
	
		// 3.3: m�thodes priv�es

}
