package com.phdareys.person.model;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	private PersonCateg personCateg;	// out!
		
	public Person()  {	// constructeur vide
		this("Paul", "Durand", 30);
	}
	public Person(String firstName, String lastName, int age) {	// constructeur "efficace"
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;		
	}
	public void exec() {	// déterminer la categ
		this.personCateg = PersonCateg.YOUNG;	// init
		for (PersonCateg pC:PersonCateg.values()) {
			if (pC.getMax()>=this.age&& this.age>=pC.getMin()) {
					// dans le range donc je l'ai!
				this.personCateg = pC;
				break;
			}
		}
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age 
				+ "]";
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
	
	public PersonCateg getPersonCateg() {
		return personCateg;
	}
	public void setPersonCateg(PersonCateg personCateg) {
		this.personCateg = personCateg;
	}

}
