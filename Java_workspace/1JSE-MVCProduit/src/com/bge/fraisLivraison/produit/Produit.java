package com.bge.fraisLivraison.produit;

public class Produit {
	
	// input and output attributes
	private double price=0;
	private int distance=0;
	private double finalPrice=0;
	private String productName="";
	
	// Constant values for the class
	private static final int PRICE_THRESHOLD =1000;
	private static final int DISTANCE_THRESHOLD = 20;
	private static final int FEE_LOW_PRICE= 30;
	private static final int FEE_LONG_DIST = 40;
	
	//First constructor to get the 3 input attributes and convert the product name to upper case
	public Produit(String productName, double price, int distance) {
		super();
		this.price = price;
		this.distance = distance;
		this.productName = productName.toUpperCase();
	}
	
	//Second constructor, we set a default value for distance, then get 2 attributes as input 
	// and the third one is the default value
	public Produit(String productName, double price) {
		this(productName, price, 10);
	}
	
	// 3rd constructor, I sell tables in distance of 10 km
	public Produit(int price) {
		this("table", price);
	}
	
	//public method to calculate the final price
	public void run() {
		finalPrice = finalPrice;
		if (price > PRICE_THRESHOLD) {
			finalPrice = price;
		}
		else if (distance < DISTANCE_THRESHOLD && price < PRICE_THRESHOLD) {
			finalPrice = price + FEE_LOW_PRICE;
		}
		else if (price < PRICE_THRESHOLD && distance > DISTANCE_THRESHOLD) {
			finalPrice = price + FEE_LONG_DIST + FEE_LOW_PRICE;
		}
		else if (price > PRICE_THRESHOLD && distance > DISTANCE_THRESHOLD) {
			finalPrice = price + FEE_LONG_DIST;
		}	
	}
	
	// Now we try to improve our code 
	public void run2() {
		finalPrice = price; //initializing the price 
		if (price >= PRICE_THRESHOLD) {
			return; // no fee 
		}
		finalPrice += FEE_LOW_PRICE ;// if the price is less than threshold add the fee
		if (distance > DISTANCE_THRESHOLD) {
			finalPrice += FEE_LONG_DIST;
		}
		
	}

	@Override
	public String toString() {
		return "Produit [price=" + price + ", distance=" + distance + ", finalPrice=" + finalPrice + ", productName="
				+ productName + "]";
	}

	public double getPrice() {
		return price;
	}

	public int getDistance() {
		return distance;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public String getProductName() {
		return productName;
	}
	
	
	
	
	
}
