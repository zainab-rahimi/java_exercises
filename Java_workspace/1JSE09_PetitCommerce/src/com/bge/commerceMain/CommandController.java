package com.bge.commerceMain;

import java.util.concurrent.atomic.AtomicInteger;

import com.bge.commerceEntities.Command;

public class CommandController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an counter starting from 1
		AtomicInteger counter = new AtomicInteger(1);
		//Create a command object
		Command corde1 = new Command("Corde s", 200, counter); 
		
		
		// retrieve and print reference number
		String refNum = corde1.getReference(counter);
        System.out.println("Reference Number: " + refNum);
        
     
		
		
		
		
	}

}
