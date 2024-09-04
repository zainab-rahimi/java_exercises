package com.phdareys.car.entity;

public class FamilyCar extends Car {
	private int seats;
	public FamilyCar(String brand, String model, String id, int seats) {
		super(brand, model, id);
		this.seats = seats;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " FamilyCar [seats=" + seats + "]";
	}

}
