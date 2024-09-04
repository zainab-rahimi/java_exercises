package com.bge.inheritence.main;
import com.bge.inhritance.entities.Ceo;
import com.bge.inhritance.entities.Employee;
import com.bge.inhritance.entities.Manager;

public class SalariMain {
	
	public static void main(String[]args) {
		Employee[] empList = {
				new Employee ("Zainab", 2000),
				new Manager ("Jake", 3000, 300),
				new Employee ("Sam", 3000),
				new Ceo ("Zainab42", 4500, 3000,200,300)
		}; 
		
	for (Employee e: empList){
		e.display();
		System.out.println(e);
	}
		
	}
}
