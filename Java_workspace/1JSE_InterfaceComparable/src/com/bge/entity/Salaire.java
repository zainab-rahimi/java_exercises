package com.bge.entity;

public class Salaire implements Comparable <Salaire> {
	
	protected String name;
	protected String lastName;
	protected int salary;
	

	public Salaire(String name, String lastName, int salary) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.salary = salary;
	}


	@Override
	public int compareTo(Salaire other) {
		// TODO Auto-generated method stub
		return Integer.compare(this.salary, other.salary);
	}


	@Override
	public String toString() {
		return "Salaire [name=" + name + ", lastName=" + lastName + ", salary=" + salary + "]";
	}

		
}
