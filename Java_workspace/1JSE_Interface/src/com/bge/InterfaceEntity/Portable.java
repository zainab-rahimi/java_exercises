package com.bge.InterfaceEntity;

public class Portable  implements Vendable{

	int id;
	String nom; 
	String marque;
	int price;
	String info;
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getInfo() {
		return info;
	}
	public String getMarque() {
		return marque;
	}
	
}
