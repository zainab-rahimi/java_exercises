package com.phdareys.sql.bean;

public class Employee {
	// Variables d'instance
	private int id;
	private String name;
	private String firstname;
	private int age;
	private int salary;
	
	public Employee() {
		super();
	}

	// Constructeur complet
	public Employee(int id, String nom, String prenom, int age, int salaire) {
		super();
		this.id = id;
		this.name = nom;
		this.firstname = prenom;
		this.age = age;
		this.salary = salaire;
	}
	
	// Constructeur sans l'id en paramètres
	public Employee(String nom, String prenom, int age, int salaire) {
		this(0, nom, prenom, age, salaire);
	}
	
	// Accesseurs et mutateurs
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String nom) {
		this.name = nom;
	}
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String prenom) {
		this.firstname = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salaire) {
		this.salary = salaire;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", firstname=" + firstname + ", age=" + age + ", salary="
				+ salary + "]";
	}

}
