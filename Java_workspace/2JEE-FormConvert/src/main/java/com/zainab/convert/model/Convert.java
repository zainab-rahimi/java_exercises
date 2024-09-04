package com.zainab.convert.model;

import java.util.Currency;

public class Convert {
	
	private int amount = 0;
	//private double rate;
	private double output;
	private String symbol;
	private ConType cType;
	
	public Convert() {
		super();
	}
	public Convert(int amount, ConType cType) {
		this.amount = amount;
		this.cType = cType;
		this.output = 0.0;
		this.symbol = Currency.getInstance("EUR").getSymbol();
	}
	
	public void calcul() {
		this.output = this.cType.getRate() * this.amount;
	
	}
	public int getAmount() {
		return amount;
	}
	public double getOutput() {
		return output;
	}
	public String getSymbol() {
		return symbol;
	}
	public ConType getcType() {
		return cType;
	}
	@Override
	public String toString() {
		return "Convert [amount=" + amount + ", output=" + output + ", symbol=" + symbol + ", cType=" + cType + "]";
	}
	
}
