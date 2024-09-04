package com.bge.enumeration.jeune;

public enum Jeunes {	
	ENFENT(0,8),
	ADO (9),
	MINIME(12,15),
	JUNIOR(15,18);

	private int min;
	private int max;
	
	private Jeunes(int a, int b) {
		this.min = a;
		this.max = b;
	}
	
	private Jeunes(int a) {
		this(a , a +2);
	}
	
	public void display() {
		System.out.println("You are " + this.name() + " et donc tu as entre:  " + this.min + " et " +
	this.max + " ans ");
		
	}
	
	
}
