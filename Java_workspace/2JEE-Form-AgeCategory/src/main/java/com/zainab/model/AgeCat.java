package com.zainab.model;

public enum AgeCat {
	JEUNE (1,19),
	AULTE (20,59),
	SENIOR(60, 110);
	
	private int min;
	private int max;

	AgeCat(int i, int j) {
		// TODO Auto-generated constructor stub
		min = i;
		max = j;
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
