package com.bge.InterfaceEntity;

public class Book implements Vendable{
	
	int id;
	int price;
	String desc;

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return desc;
	}
	public Book(int id, int price, String desc) {
		super();
		this.id = id;
		this.price = price;
		this.desc = desc;
	}

}
