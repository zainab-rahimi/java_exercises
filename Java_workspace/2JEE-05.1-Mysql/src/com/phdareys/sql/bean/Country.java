package com.phdareys.sql.bean;

public class Country {
	private String name;
	private int pop;
	
	public Country(String name, int pop) {
		super();
		this.name = name;
		this.pop = pop;
	}
	public Country() {
		super();
	}
	public String getName() {
		return name;
	}
	public int getPop() {
		return pop;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", pop=" + pop + "]";
	}
	
}
