 package com.phdareys.twoclasses.model;

public class Address
{			// att Names
	private int streetNumber;
	private String streetName;
	private int zipCode;   
	private String city;
	
		// constructor
	public Address(int streetNumber, String streetName, int zipCode, String city) {
		super();
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.zipCode = zipCode;
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void afficher() {
		
	}
	@Override
	public String toString() {
		return "\tAddress [streetNumber=" + streetNumber + ", streetName=" + streetName + ", zipCode=" + zipCode
				+ ", city=" + city + "]";
	}


}
