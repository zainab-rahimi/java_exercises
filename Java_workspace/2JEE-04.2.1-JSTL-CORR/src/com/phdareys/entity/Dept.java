package com.phdareys.entity;

public class Dept {
	private int num;
	private String name;

	public Dept(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Dept [num=" + num + ", name=" + name + "]";
	}

}
