package com.phdareys.model;

public enum Light {
	RED("Je Stoppe"), GREEN("Je roule"), ORANGE("Je freine");

	private String action;

	private Light(String action) {
		this.action = action;
	}

	public String getAction() {
		return "Action: " + action;
	}

}
