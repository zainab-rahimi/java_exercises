package com.bge.fraisLivraison.main;

import com.bge.fraisLivraison.produit.Produit;
import com.bge.fraisLivraison.view.ProduitView;

public class FraisContoroller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produit [] produitArray = {
				new Produit("CANAPE",2000, 100),
				new Produit("Armoir", 1500),
				new Produit("Bureau", 200, 140),
				new Produit ( 500),
		
	};
		
		
	for (Produit p: produitArray) {
		p.run();
        System.out.println("Name: " + p.getProductName() + 
                ", Price: " + p.getPrice() + 
                ", Dist: " + p.getDistance()+ 
                ", Final Price: " + p.getFinalPrice());
	}
	System.out.println("\n"+"The result for the second method : ");
	for (Produit p: produitArray) {
		p.run2();
		
		System.out.println("PRODUCT : " + p.getProductName() +
				" Price: " + p.getPrice() +
				"Distance: " + p.getDistance() +
				" Final Price :" + p.getFinalPrice());
		
	}
	ProduitView view = new ProduitView();
	view.view(produitArray);
	

}
	}
