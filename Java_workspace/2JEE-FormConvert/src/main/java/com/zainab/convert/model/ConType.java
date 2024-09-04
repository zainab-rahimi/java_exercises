package com.zainab.convert.model;

public enum ConType {
	Euro2Dollar(1.08),
	Dollar2Euro(1.0/1.08);
	
	double rate;
	ConType(double rate) {
		// TODO Auto-generated constructor stub
		this.rate = rate;
	}
	public double getRate() {
		return rate;
	}
	public String toString() {
		return this.name();
	}
}
