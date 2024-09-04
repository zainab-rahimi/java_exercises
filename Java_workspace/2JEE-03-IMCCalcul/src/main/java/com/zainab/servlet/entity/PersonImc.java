package com.zainab.servlet.entity;

public class PersonImc {
	private String name;
	private int weight;
	private int height;
	
	private double imc; // output
	// Constructors
	public PersonImc(String name, int weight, int height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	public PersonImc(String name) {
		this(name,80,190);  // to set default values of 80 weight and 190 height
	}
	public void exec() {
		imc = this.round ((double)(10000 *weight/Math.pow(this.height ,2)),2);
	}
	//method to round to b digits 
	private double round(double a, int b) {
		return (double) ((int) (a * Math.pow(10, b)+ .5)) /
				Math.pow(10, b);
	}
	@Override
	public String toString() {
		return "PersonImc [name=" + name + ", weight=" + weight + ", height=" + height + ", imc=" + imc + "]";
	}
	
	//Getter and Setters
	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public int getHeight() {
		return height;
	}

	public double getImc() {
		return imc;
	}

	
	
}
