package com.phdareys.emp.entity;

public class Ceo extends Manager {

	private int stockOptions;
	
	public Ceo(String name, int mSal, int bonus, int stockOptions) {
		super(name, mSal, bonus);
		this.stockOptions = stockOptions;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		this.yIncomes += this.stockOptions;
		System.out.println("Ceo: " + name);
	}

	@Override
	public String toString() {
		return "Ceo [bonus=" + this.bonus + ", stockOptions=" + this.stockOptions + " , name=" + name + ", mSal=" + mSal + ", yIncomes=" + yIncomes + "]";
	}
	

}
