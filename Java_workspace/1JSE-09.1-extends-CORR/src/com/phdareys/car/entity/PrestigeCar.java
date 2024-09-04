package com.phdareys.car.entity;

public class PrestigeCar extends Car {
	private int price;

	public PrestigeCar(String brand, String model, String id, int price) {
		super(brand, model, id);
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " PrestigeCar [price=" + price + " $]";
	}
	
}
