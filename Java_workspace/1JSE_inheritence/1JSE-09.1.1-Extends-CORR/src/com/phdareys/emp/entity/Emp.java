package com.phdareys.emp.entity;

public class Emp {
	protected final static int MONTHS_NB = 14;
	
	protected String name;
	protected int mSal;
	protected int yIncomes = 0;	// out
	
	public Emp(String name, int mSal) {
		super();
		this.name = name;
		this.mSal = mSal;
	}
	public void run() {
		this.yIncomes = MONTHS_NB*this.mSal;
		System.out.println("Salarié: " + name);
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", mSal=" + mSal + ", yIncomes=" + yIncomes + "]";
	}
	
}
