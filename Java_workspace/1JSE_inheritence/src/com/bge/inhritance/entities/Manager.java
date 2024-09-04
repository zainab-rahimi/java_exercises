package com.bge.inhritance.entities;

public class Manager extends Employee{
	
	protected int bonus;
	public Manager(String name, int mSal, int bonus) {
		super(name, mSal);
		this.bonus = bonus;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		this.ySal += this.bonus;
		//System.out.println("Manager: "+ name);
	}
	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", name=" + name + ", mSal=" + mSal + ", ySal=" + ySal + "]";
	}
	
	
}