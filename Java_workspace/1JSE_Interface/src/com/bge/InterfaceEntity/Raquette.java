package com.bge.InterfaceEntity;

public class Raquette implements Vendable {

	public Raquette(int id, int price, String champ, String mark) {
		super();
		this.id = id;
		this.price = price;
		this.champ = champ;
		this.mark = mark;
	}

	int id;
	int price;
	String champ; 
	String mark;
	
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
	public int getPrice() {
		// TODO Auto-generated method stub
		return price -= price * 20/100;
	}
	
	public String getDesc() {
		// TODO Auto-generated method stub
		return champ + " " + mark;
	}

}
