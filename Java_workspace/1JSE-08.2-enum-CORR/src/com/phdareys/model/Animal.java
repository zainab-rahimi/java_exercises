package com.phdareys.model;

public enum Animal {
	CAT("cat", "😼"),
	TIGER("tiger", "🐯"),
	BEAR("bear", "🐻");

	String name;
	String logo;
	
	Animal(String string, String string2) {
		// TODO Auto-generated constructor stub
		name=string;
		logo=string2;
	}
	public String getName() {
		return name;
	}

	public String getLogo() {
		return logo;
	}


}
