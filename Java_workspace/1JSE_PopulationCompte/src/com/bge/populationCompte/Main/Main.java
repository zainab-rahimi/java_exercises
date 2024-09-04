package com.bge.populationCompte.Main;
import com.bge.populationCompte.entity.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("-------------> Calcul nb total et Calcul nb Alpes-Maritimes:");
		com.bge.populationCompte.entity.Person [] pop = {
				new Person ("Gilles","Dupont", 06, 
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
								06200, "Toulouse")),
				new Person ("Marc","Dumas", 40, 
						new Address (2, "Rue des Alouettes", 
								34000, "Montpellier")),
		};
		for (Person pers:pop)
			System.out.println (pers);

		System.out.println ("------> Il y a au final : "+Person.getNbAlepesMaritimes()+ " Alpes-Maritimes");
		System.out.println ("------> Il y a au final en tout : "+Person.getCount()+ " Personnes");
			//démenager Gilles -> Valérie
		System.out.println ("------> Déménager Gilles chez Valérie");
		pop[0].setAddress(pop[1].getAddress());
		System.out.println (pop[0]);
		System.out.println (pop[1]);
		
	}

}
