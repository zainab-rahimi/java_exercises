package com.phdareys.sql.bean;

public class Employee {
	
	// Déclaration des variables d'instance
	private int id;
	private String name;
	private String firstName;
	private int age;
	private int salary;
	
	// Nécessaire: un constructeur vide par défaut pour référence ultérieure dans la jsp 
	public Employee() {
		super();
	}

	// Constructeur prenant en paramètres toutes les variables d'instance
	public Employee(int id, String name, String firstName, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.firstName = firstName;
		this.age = age;
		this.salary = salary;
	}
	
	// Constructeur sans l'id en paramètres
	public Employee(String name, String firstName, int age, int salary) {
		this(0, name, firstName, age, salary);
	}
	public Employee(int id, String name, String firstName, int salary) {
		this(id, name, firstName, 40, salary);
	}

	public Employee(String name, String firstName, int salary) {
		this(0, name, firstName, 30, salary);
	}
	
	// Redéfinition de la méthode toString()
	public String toString() {
		return String.join("-", 
				Integer.toString(this.id),
				this.name,
				this.firstName,
				Integer.toString(this.age),
				Integer.toString(this.salary)
				);
	}

	// Génération des accesseurs et mutateurs
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name.toUpperCase();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
}
