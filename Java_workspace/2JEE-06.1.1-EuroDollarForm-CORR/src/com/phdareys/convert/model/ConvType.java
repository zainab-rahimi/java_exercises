package com.phdareys.convert.model;

public enum ConvType {
	EURO_TO_DOLLAR(1.08),
	DOLLAR_TO_EURO(1/1.08),
	EURO_TO_POUND(1/1.2);

	double rate;
	ConvType(double d) {
		// TODO Auto-generated constructor stub
		this.rate = d;
	}
	public double getRate() {
		return rate;
	}
	public String toString() {
		return this.name();
		
	}
}
