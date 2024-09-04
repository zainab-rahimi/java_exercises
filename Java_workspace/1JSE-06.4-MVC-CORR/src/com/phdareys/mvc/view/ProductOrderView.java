package com.phdareys.mvc.view;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

import com.phdareys.mvc.model.ProductOrder;

public class ProductOrderView {
	
	public void view(ProductOrder[] prods) {
		String aMess = "";
		for (ProductOrder p:prods) {	// fabrication du message (1 ligne par produit)
			aMess += "Produit: " + p.getName() + ", Prix d'achat: "+ p.getPrice() + "€ A livrer à: " + p.getDist() + 
					" Kms -> Total: " + p.getFinalPrice() + "€" + 
					" (taxe: " + (p.getFinalPrice() - p.getPrice()) + "€)\n";
		}
		
		showMessageDialog(null, aMess, "Ma commande", INFORMATION_MESSAGE);
	}
	
	

}
