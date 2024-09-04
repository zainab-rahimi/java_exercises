package com.phdareys.spr.entity;

public class Meal {
	private String name;
	private MealCateg categ;	// une énumération
	private String country;
	private int cost;
	
	public Meal(String name, MealCateg categ, String country, int cost) {
		super();
		this.name = name;
		this.categ = categ;
		this.country = country;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MealCateg getCateg() {
		return categ;
	}
	public void setCateg(MealCateg categ) {
		this.categ = categ;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Meal [name=" + name + ", categ=" + categ + ", country=" + country + ", cost=" + cost + "]";
	}
	
}

