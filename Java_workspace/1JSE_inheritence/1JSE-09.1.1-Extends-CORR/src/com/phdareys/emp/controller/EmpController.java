package com.phdareys.emp.controller;

import com.phdareys.emp.entity.Ceo;
import com.phdareys.emp.entity.Emp;
import com.phdareys.emp.entity.Manager;

public class EmpController {

	public static void main(String[] args) {
		Emp[] emps = {
				new Emp("Paul", 2000), 
				new Manager("Carlos", 3000, 5000),
				new Emp("Elsa", 2400), 
				new Ceo("John", 4000, 6000, 7000),
				};
		for (Emp e:emps) {
			e.run();	// polymorphisme
			System.out.println(e);
		}

	}

}
