package com.bge.inhritance.entities;

public class Employee {
	protected final static int mNum = 14;
	protected String name;
	protected int mSal;
	protected int ySal;
	
	public Employee(String name, int mSal) {
		super();
		this.name = name;
		this.mSal = mSal;
	}
	
	public void display() {
		this.ySal = mNum * this.mSal;
		//System.out.println("Salari?: " + name);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", mSal=" + mSal + ", ySal=" + ySal + "]";
	}
	
}
