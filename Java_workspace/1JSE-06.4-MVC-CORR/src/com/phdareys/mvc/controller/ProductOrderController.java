package com.phdareys.mvc.controller;

import com.phdareys.mvc.model.ProductOrder;
import com.phdareys.mvc.view.ProductOrderView;

public class ProductOrderController {

	public static void main(String[] args) {
			// les donn�es � injecter
		ProductOrder[] prods = {
				new ProductOrder ("Canap�", 2000, 100),	// cher et loin
				new ProductOrder ("Armoire", 1500),		// cher et pr�s
				new ProductOrder ("Bureau", 200, 140),	// pas cher et loin
				new ProductOrder (500),		// pas cher et pr�s
		};
			// le calcul fait par le mod�le
		for (ProductOrder p:prods) {
			p.run();				// traitement
			System.out.println (p); // v�rif validit� des data avant la vue
		}
			// au final la vue auquel je passe mes produits
		ProductOrderView prodView = new ProductOrderView();
		prodView.view(prods);
	}

}
