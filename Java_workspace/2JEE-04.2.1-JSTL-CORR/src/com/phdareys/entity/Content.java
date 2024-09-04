package com.phdareys.entity;

public class Content {
	private int id;
	private String name;	// ex: géo
	private int coeff;		// ex: 2
	
	public Content(int id, String name, int coeff) {
		super();
		this.id = id;
		this.name = name;
		this.coeff = coeff;
	}
	
	@Override
	public String toString() {
		return "Content [id=" + id + ", name=" + name + ", coeff=" + coeff + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getCoeff() {
		return coeff;
	}
	
	

}
