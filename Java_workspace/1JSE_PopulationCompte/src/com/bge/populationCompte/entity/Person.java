package com.bge.populationCompte.entity;

public class Person {
	
	//Constant, the postal code for department 
	private static final int ALPES_MARITIMES = 06;
	
	// input and output attributes
	private String name;
	private String lastName;
	private int age;
	private Address address;
	//Static attributes
	private static int count = 0; // counter to keep track of the total number of person objects created
	private static int nbAlepesMaritimes = 0; //counter to keep track of the number of person objects who live in alpes maritimes
	
	
	// Constructor
	public Person(String name, String lastName, int age, Address address) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		
		if (this.isAlpesMaritimes(this.address.getCodeZip())) //if zip code corresponds to Alpes Maritimes increment the counter 
			nbAlepesMaritimes ++;
		count++; //else increment the counter for the total number of person objects created	
	}
	
	//Private method to check if a given postal code corresponds to Alpes maritimes department
	private boolean isAlpesMaritimes(int postalCode) {
		return ((int) (postalCode /1000) == ALPES_MARITIMES);
	}

	public String getName() {
		return name;
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

	public void setAddress(Address address) {
		if (this.isAlpesMaritimes(address.getCodeZip()) && 
				! this.isAlpesMaritimes(this.address.getCodeZip()))
			Person.nbAlepesMaritimes++;
		if (!this.isAlpesMaritimes(address.getCodeZip()) &&
				this.isAlpesMaritimes(address.getCodeZip()))
			Person.nbAlepesMaritimes--;
		this.address = address;
	}

	public static int getCount() {
		return count;
	}

	public static int getNbAlepesMaritimes() {
		return nbAlepesMaritimes;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", age=" + age + ", address=" + address + "]";
	}


}
