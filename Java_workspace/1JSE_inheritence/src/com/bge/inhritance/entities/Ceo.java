package com.bge.inhritance.entities;

public class Ceo extends Manager{
	
	protected int stockValue;
	public Ceo (String name, int mSal, int ySal, int  bonus, int stockValue) {
		super(name, mSal, bonus);
		this.stockValue = stockValue;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		this.ySal += this.stockValue;
	}
	@Override
	public String toString() {
		return "Ceo [stockValue=" + stockValue + ", bonus=" + bonus + ", name=" + name + ", mSal=" + mSal + ", ySal="
				+ ySal + "]";
	}
	
	

}
