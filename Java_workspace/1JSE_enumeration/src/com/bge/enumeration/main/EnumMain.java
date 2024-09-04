package com.bge.enumeration.main;

import com.bge.enumeration.jeune.Animal;
import com.bge.enumeration.jeune.Jeunes;

public class EnumMain {
		
	public static void main(String [] args) {
	
	Jeunes j;
	j = Jeunes.JUNIOR;
	j.display();
	
	Animal a = Animal.TIGER;
	System.out.println("nom: " + a.getName() + " logo: " + a.getEmoji());
	}
	
}
