package com.phdareys.car.entity;

public class Car {

	protected static final int STEP = 100;
	
	protected String brand;
	protected String model;
	protected String ident;
	protected int position=0;			// out
	protected boolean isStarted=false; 	// out
	
	public Car(String brand, String model, String id) {
		super();
		this.brand = brand;
		this.model = model;
		this.ident = id;
	}
	
	public boolean drive(int nbOcc) {
		for (int i=0; i < nbOcc; i++) {
			if (! this.isStarted)
				return false;	// erreur si pas démarrée!
			this.position += STEP;
		}
		return true;
	}

	
	@Override
	public String toString() {
		return "-> Car [brand=" + brand + ", model=" + model + ", id=" + ident + ", position=" + position + " (km) ]";
	}
	public String getModel() {
		return model;
	}
	public void setStarted(boolean isStarted) {	// démarrer la voiture
		this.isStarted = isStarted;
	}

	
}
