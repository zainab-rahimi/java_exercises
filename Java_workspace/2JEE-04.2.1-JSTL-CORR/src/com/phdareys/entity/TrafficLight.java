package com.phdareys.entity;

import java.util.Arrays;

public class TrafficLight {

	private Light lights[];
	private Light current;
	private int totalCycle = 0;
	
	public TrafficLight() {
		super();
		lights=new Light [3];
		lights[0] = new Light("green", 0.2F, 10, "Je passe");
		lights[1] = new Light("orange", 0.2F, 2, "Je freine");
		lights[2] = new Light("red", 0.2F, 5, "Je stoppe");
		totalCycle = lights[0].getDuration() + lights[0].getDuration() + lights[2].getDuration();
		
	}
	
	public void exec() {
		int rd=new java.util.Random().nextInt(3);	// entre 0 et 2
		current = lights[rd];
		current.setOpacity(1.0F);	// highlight
	}
		
		
	@Override
	public String toString() {
		return "TrafficLight [lights=" + Arrays.toString(lights) + "]";
	}

	public Light[] getLights() {
		return lights;
	}

	public Light getCurrent() {
		return current;
	}

	public int getTotalCycle() {
		return totalCycle;
	}
	
	
	

}
