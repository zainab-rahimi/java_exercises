package com.phdareys.mvc.model;

public class ProductOrder {
		// 1.1: les constantes de classe
	private static final int PRICE_THRESHOLD=1000;	// au delà de ce prix gratuit
	private static final int DIST_THRESHOLD=20;		// en dessous de cette distance livraison gratuite
	private static final int TAX_LOW_PRICE=30;			// taxe prix
	private static final int TAX_LONG_DIST=40;			// taxe distance
	
		// 1.2: les attributs (ou vi)
	private String productName="";		// en entrée le nom du produit
	private int price=0;			// prixHT
	private int dist=0;			// distance de livraison
	private int finalPrice=0;	// à calculer! (on aurait pu rajouter les frais)

		// 2: constructeur(s) (généré par Eclipse)
	public ProductOrder(String productName, int price, int dist) {
		super();
		this.productName = productName.toUpperCase();
		this.price = price;
		this.dist = dist;
	}
		// 2: 2ème constructeur
	public ProductOrder(String productName, int price) {
		this(productName, price, 10);	// par défaut on livre à 10kms 
	}
		// 2: 3ème constructeur (je vends essentiellement des tables à 10kms)
	public ProductOrder(int price) {
		this("table", price);	// par défaut on livre à 10kms 
	}

	// 3.1: méthodes publiques(s)
	public void run() {
		finalPrice = price;
		if (price >= PRICE_THRESHOLD) {
			return;	// pas de taxe!
		}
		finalPrice += TAX_LOW_PRICE;	// produit 'pas cher'
		if (dist > DIST_THRESHOLD) {	// c'est loin on paie plus que si c'est près!
			finalPrice += TAX_LONG_DIST;
		}
	}
	
		// 3.2: toString(), getter(), setter()...(méthodes générées par Eclipse)
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
	
		// 3.3: méthodes privées

}
