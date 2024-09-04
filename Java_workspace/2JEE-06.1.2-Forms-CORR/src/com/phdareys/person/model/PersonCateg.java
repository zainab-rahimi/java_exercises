package com.phdareys.person.model;

public enum PersonCateg {
	YOUNG(0,20),
	ADULT(21,60),
	SENIOR(61,110);
	
	private int min;
	private int max;
	PersonCateg(int i, int j) {
		// TODO Auto-generated constructor stub
		min=i;
		max=j;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}

}
