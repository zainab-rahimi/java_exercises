package com.phdareys.model;

public enum Shape {
	SQUARE(4), 
	CIRCLE(2*Math.PI); 

	private double param;

	Shape(double d) {
	// TODO Auto-generated constructor stub
		this.param = d;
	}
	public double perim (double p) {
		return this.param * p;
	}
	
}
