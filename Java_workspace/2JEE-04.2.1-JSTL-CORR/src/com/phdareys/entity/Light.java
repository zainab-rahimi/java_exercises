package com.phdareys.entity;

public class Light {
	private String color;
	private float opacity = 0.2F;
	private int duration;
	private String message;
	
	public Light(String color, float opacity, int duration, String message) {
		super();
		this.color = color;
		this.opacity = opacity;
		this.duration = duration;
		this.message = message;
	}

	@Override
	public String toString() {
		return "Light [color=" + color + ", opacity=" + opacity + ", duration=" + duration + ", message=" + message
				+ "]";
	}

	public String getColor() {
		return color;
	}

	public float getOpacity() {
		return opacity;
	}

	public int getDuration() {
		return duration;
	}

	public String getMessage() {
		return message;
	}

	public void setOpacity(float opacity) {
		this.opacity = opacity;
	}

}
