package com.phdareys.car.entity;

public class SportCar extends Car {

	private final static float PERCENT=(float) 0.1;
	
	private int speedValue;	// je n'étends pas la voiture de sport, donc private
	
	public SportCar(String brand, String model, String id, int speedValue) {
		super(brand, model, id);
		this.speedValue = speedValue;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " SportCar [speedValue=" + speedValue + "]";
	}
	
	@Override
	public boolean drive(int nbOcc) {
		// TODO Auto-generated method stub
		boolean b= super.drive(nbOcc);
		this.position += (int) this.position*PERCENT;
		return b;
	}
}
