package com.phdareys.model;

public enum Young {
	ENFANT(0,8), POUSSIN(9), MINIME(12, 15), JUNIOR(15, 18);
	
	private int min; 
	private int max;
	
	// plusieurs constructeurs
	private Young(int a, int b) {
		this.min = a;
		this.max = b;
	}
	private Young(int a) {
		this(a, a+2);
	}
	public void display() {
		System.out.println ("Je suis: " + this.name() + " et donc j'ai entre: " + this.min + " et: " + this.max + 
				" ans!");
	}
}
