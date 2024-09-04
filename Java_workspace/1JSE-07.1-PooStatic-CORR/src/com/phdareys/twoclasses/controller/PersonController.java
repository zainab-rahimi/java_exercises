package com.phdareys.twoclasses.controller;

import com.phdareys.twoclasses.model.Address;
import com.phdareys.twoclasses.model.Person;

public class PersonController {
	public static void main(String[] args) {
		/* Test POO objets imbriqu�s
		 * + objets statiques
		 * + notions packages
		 */  

		System.out.println ("-------------> Calcul nb total et Calcul nb Haut-Garonnais:");
		Person [] pop = {
				new Person ("Gilles","Dupont", 32, 
						new Address (2, "Rue Canebi�re", 
								13000, "Marseille")),
				new Person ("Val�rie","Duparc", 20, 
						new Address (2, "Rue Pyr�n�es", 
								31800, "St-Gaudens")),
				new Person ("Virginie","Dulac", 30, 
						new Address (2, "Rue de la Paix", 
								75000, "Paris")),
				new Person ("Christine","Dubois", 40, 
						new Address (2, "Rue du Perdigu�re", 
								38000, "Grenoble")),
				new Person ("Jean","Dubois", 40, 
						new Address (2, "Rue Pargamini�res", 
								31000, "Toulouse")),
				new Person ("Marc","Dumas", 40, 
						new Address (2, "Rue des Alouettes", 
								34000, "Montpellier")),
		};

		for (Person pers:pop)
			System.out.println (pers);

		System.out.println ("------> Il y a au final : "+Person.getNbHautGaronnais()+ " Haut-Garonnais");
		System.out.println ("------> Il y a au final en tout : "+Person.getCount()+ " Personnes");
			//d�menager Gilles -> Val�rie
		System.out.println ("------> D�m�nager Gilles chez Val�rie");
		pop[0].setAddress(pop[1].getAddress());
		System.out.println (pop[0]);
		System.out.println (pop[1]);
		
	}
}
