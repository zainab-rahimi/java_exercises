package com.phdareys.entity;

public class Emp {
	private String firstName;
	private String lastName;
	private int age;
	public Emp(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
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
	
}
