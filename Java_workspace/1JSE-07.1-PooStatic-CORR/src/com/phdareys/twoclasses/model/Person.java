package com.phdareys.twoclasses.model;

public class Person {
		// 1/ constantes de classe
	private final static int HAUTE_GARONNE = 31; // final indique que ce ne peut être modifié (=cte) -> Majuscule

		// 2/ attributs (in et out)
	private String firstName;
	private String lastName;
	private int age;
	private Address address;	// appartenance

		// 2.1/ attributs statiques (déconseillé, si on ne peut pas faire autrement)
	private static int count = 0;
	private static int nbHtGaronnais=0; // data liée à la classe et non à l'objet

	
		// 3/ constructeurs
	public Person(String prenom, String nom, int age, Address
			adresse) {
		this.firstName = prenom;
		this.lastName = nom;
		this.age = age;
		this.address = adresse;
		
		if (this.isHtGaronnais(this.address.getZipCode()))
			nbHtGaronnais ++;
		count++;
	}
	
		// 4/ méthodes publiques
	public static int getNbHautGaronnais() {	// static!!
		return nbHtGaronnais;
	}
	public static int getCount() {	// static!!
		return count;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address adresse) {
		if (this.isHtGaronnais(adresse.getZipCode()) && 
				! this.isHtGaronnais(this.address.getZipCode()))
			Person.nbHtGaronnais++;
		if (! this.isHtGaronnais(adresse.getZipCode()) && 
				this.isHtGaronnais(this.address.getZipCode()))
			Person.nbHtGaronnais--;
		this.address = adresse;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=\n" + address
				+ "]";
	}

		// 5/ méthodes privées

	private boolean isHtGaronnais (int postalCode) {
			// ou 31000<= postalCode <32000
		return ((int) (postalCode / 1000) == HAUTE_GARONNE);
	}

}
