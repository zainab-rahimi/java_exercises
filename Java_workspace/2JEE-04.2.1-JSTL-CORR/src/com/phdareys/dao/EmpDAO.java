package com.phdareys.dao;

import java.util.ArrayList;

import com.phdareys.entity.Emp;

public class EmpDAO {
	private ArrayList<Emp> emps;
	public EmpDAO() {
		// TODO Auto-generated constructor stub
		this.emps = new ArrayList<Emp>();
		this.emps.add(new Emp("Paul", "Durand", 40)); 
		this.emps.add(new Emp("Patricia", "Duval", 50));
		this.emps.add(new Emp("Luigi", "DiMaria", 44)); 
		this.emps.add(new Emp("Alberto", "Milano", 24));
		this.emps.add(new Emp("John", "Doe", 42));
		this.emps.add(new Emp("Johnny", "Depp", 49));
	}
	public ArrayList<Emp> getEmps() {
		return emps;
	}

}
