package com.zainab.spring.bean;

public class Loan {
	//input attributes
	private int amount;
	private int nbMonth;
	private double rate;
	//output attributes
	private int monthlyPayment;
	private int bankBenefit;
	
	
	public Loan() {
		super();
	}
	public Loan(int amount, int nbMonth, double rate) {
		super();
		this.amount = amount;
		this.nbMonth = nbMonth;
		this.rate = rate;
	}
	
	public void run() {
		monthlyPayment = (int) ((amount * rate / 12) /
				(1 - Math.pow(1 + (rate/12), - nbMonth)));
		bankBenefit = monthlyPayment * nbMonth - amount;
	}

	@Override
	public String toString() {
		return "Loan [amount=" + amount + ", nbMonth=" + nbMonth + ", rate=" + rate + ", monthlyPayment="
				+ monthlyPayment + ", bankBenefit=" + bankBenefit + "]";
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getNbMonth() {
		return nbMonth;
	}
	public void setNbMonth(int nbMonth) {
		this.nbMonth = nbMonth;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getMonthlyPayment() {
		return monthlyPayment;
	}
	public void setMonthlyPayment(int monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	public int getBankBenefit() {
		return bankBenefit;
	}
	public void setBankBenefit(int bankBenefit) {
		this.bankBenefit = bankBenefit;
	}
	
	
	
}
