package com.phdareys.convert.model;

import java.util.Currency;

public class Convert {

	private int amount = 0;			// att in
	private ConvType cType;		// att in 
	private double result;		// att out
	private String symbol;		// att out
	
	public Convert() {
		super();
	}

	public Convert(int amount, ConvType cType) {
		super();
		this.amount = amount;
		this.cType = cType;
		this.result=0.0;
		this.symbol = Currency.getInstance("EUR").getSymbol();
	}

	public void exec() {
		this.result = this.round(this.cType.getRate()*this.amount, 2);
		String symb = this.cType==ConvType.EURO_TO_DOLLAR ? 
				"USD" : (this.cType==ConvType.DOLLAR_TO_EURO ? 
						"EUR" : "GBP");
		this.symbol = Currency.getInstance(symb).getSymbol();
	}
	
	public double getResult() {
		return result;
	}

	public int getAmount() {
		return amount;
	}


	public ConvType getcType() {
		return cType;
	}


	public String getSymbol() {
		return symbol;
	}


	@Override
	public String toString() {
		return "Converter [amount=" + amount + ", cType=" + cType + ", result=" + result + ", symbol=" + symbol + "]";
	}

	// only a few digits after , (b digits).
	private double round(double a, int b) {
		return (double) ( (int) (a * Math.pow(10, b) + .5)) / 
				Math.pow(10, b);
	}
}
