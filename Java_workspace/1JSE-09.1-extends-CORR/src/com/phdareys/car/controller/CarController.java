package com.phdareys.car.controller;

import com.phdareys.car.entity.Car;
import com.phdareys.car.entity.FamilyCar;
import com.phdareys.car.entity.PrestigeCar;
import com.phdareys.car.entity.SportCar;

public class CarController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cars [] = new Car [] {
			new Car("Toyota", "Corolla", "ES-456-FW"),
			new FamilyCar("Volkswagen", "Touran", "PT-345-JH", 7),
			new SportCar("Porsche", "Carrera", "EX-567-ZA", 350),
			new PrestigeCar("Rolls", "Phantom", "FR-334-RR", 300_000),
		};
		for (Car c:cars) {
			c.setStarted(true);		// start engine!
			if (! c.drive(3))		// Méthode polymorphe
				System.out.println ("Car: " + c.getModel() + " is not Started");
			c.setStarted(false);		// stop engine
			System.out.println(c);		
		}
	}

}
