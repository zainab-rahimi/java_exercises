package com.phdareys.twoclasses.controller;

import com.phdareys.twoclasses.model.Address;
import com.phdareys.twoclasses.model.Person;

public class PersonController {
	public static void main(String[] args) {
		/* Test POO objets imbriqués
		 * + objets statiques
		 * + notions packages
		 */  

		System.out.println ("-------------> Calcul nb total et Calcul nb Haut-Garonnais:");
		Person [] pop = {
				new Person ("Gilles","Dupont", 32, 
						new Address (2, "Rue Canebière", 
								13000, "Marseille")),
				new Person ("Valérie","Duparc", 20, 
						new Address (2, "Rue Pyrénées", 
								31800, "St-Gaudens")),
				new Person ("Virginie","Dulac", 30, 
						new Address (2, "Rue de la Paix", 
								75000, "Paris")),
				new Person ("Christine","Dubois", 40, 
						new Address (2, "Rue du Perdiguère", 
								38000, "Grenoble")),
				new Person ("Jean","Dubois", 40, 
						new Address (2, "Rue Pargaminières", 
								31000, "Toulouse")),
				new Person ("Marc","Dumas", 40, 
						new Address (2, "Rue des Alouettes", 
								34000, "Montpellier")),
		};

		for (Person pers:pop)
			System.out.println (pers);

		System.out.println ("------> Il y a au final : "+Person.getNbHautGaronnais()+ " Haut-Garonnais");
		System.out.println ("------> Il y a au final en tout : "+Person.getCount()+ " Personnes");
			//démenager Gilles -> Valérie
		System.out.println ("------> Déménager Gilles chez Valérie");
		pop[0].setAddress(pop[1].getAddress());
		System.out.println (pop[0]);
		System.out.println (pop[1]);
		
	}
}
