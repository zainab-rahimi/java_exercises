package com.phdareys.sql.bean;

public class Actor {
	private int id;
	private String name;
	private String nat;
	public Actor(String string, String string2) {
		// TODO Auto-generated constructor stub
		this.name = string;
		this.nat=string2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNat() {
		return nat;
	}
	public void setNat(String nat) {
		this.nat = nat;
	}
	@Override
	public String toString() {
		return "Actor [id=" + id + ", name=" + name + ", nat=" + nat + "]";
	}
	
	

}
