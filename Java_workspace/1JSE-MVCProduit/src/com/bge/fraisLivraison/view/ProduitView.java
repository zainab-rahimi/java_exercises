package com.bge.fraisLivraison.view;

import javax.swing.JFrame;

import com.bge.fraisLivraison.produit.Produit;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

import static javax.swing.JOptionPane.showMessageDialog;
 
public class ProduitView {
	public void view(Produit[] products) {
		String Mess= "";
		for (Produit p : products) {
			Mess += " Product: " + p.getProductName() + " Price of the product: " + p.getPrice() +
					" Delivery distance : " + p.getDistance() + " Final price including delivery fee: " + 
					p.getFinalPrice()+ "\n";
		}
		showMessageDialog(null,Mess,"Order details", INFORMATION_MESSAGE);
	}
	
	

}
