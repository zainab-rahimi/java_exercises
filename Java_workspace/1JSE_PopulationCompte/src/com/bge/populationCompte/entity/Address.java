package com.bge.populationCompte.entity;

public class Address {
	private int number;
	private String  streetName;
	private int codeZip;
	private String city;
	
	public Address(int number, String streetName, int codeZip, String city) {
		super();
		this.number = number;
		this.streetName = streetName;
		this.codeZip = codeZip;
		this.city = city;
	}



	public int getCodeZip() {
		return codeZip;
	}
	public void show() {
		
	}



	@Override
	public String toString() {
		return "Address [number=" + number + ", streetName=" + streetName + ", codeZip=" + codeZip + ", city=" + city
				+ "]";
	}
	
	
}
