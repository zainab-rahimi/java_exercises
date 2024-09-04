package com.phdareys.emp.entity;

public class Manager extends Emp {
	protected int bonus=0;

	public Manager(String name, int mSal, int bonus) {
		super(name, mSal);
		this.bonus = bonus;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		this.yIncomes += this.bonus;
		System.out.println("Manager: " + name);
	}

	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", name=" + name + ", mSal=" + mSal + ", yIncomes=" + yIncomes + "]";
	}


}
