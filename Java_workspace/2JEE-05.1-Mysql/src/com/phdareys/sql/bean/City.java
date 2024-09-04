package com.phdareys.sql.bean;

public class City {
	private String name;
	private int pop;
	private String country;
	
	public City(String name, int pop, String country) {
		super();
		this.name = name;
		this.pop = pop;
		this.country = country;
	}
	@Override
	public String toString() {
		return "City [name=" + name + ", pop=" + pop + ", country=" + country + "]";
	}
	public String getName() {
		return name;
	}
	public int getPop() {
		return pop;
	}
	public String getCountry() {
		return country;
	}
	

}
