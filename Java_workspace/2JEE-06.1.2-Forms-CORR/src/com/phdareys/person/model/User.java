package com.phdareys.person.model;

import java.util.Date;

public class User {
	private String id;
	private Date birthDate;
	private String passwd;	// on ne met pas 2 fois le password!
	
	// bonne pratique en JEE: constructeur vide
	public User() {
		super();
	}

	public User(String id, Date birthDate, String passwd) {
		super();
		this.id = id;
		this.birthDate = birthDate;
		this.passwd = passwd;
	}

	// bonne pratique: mon objet fonctionne!
	@Override
	public String toString() {
		return "User [id=" + id + ", birthDate=" + birthDate + ", passwd=" + passwd + "]";
	}

	// obligatoire en JEE: les getters!
	public String getId() {
		return id;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public String getPasswd() {
		return passwd;
	}
	
	

}
