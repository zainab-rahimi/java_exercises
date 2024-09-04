package broCode.scope;

import java.util.Random;

public class DiceRoller {
	Random rand = new Random();
	int number ;	
	// Create constructor 
	// here we have made a constructor and called the method inside it so, since we 
	// created an object within the main class, we don't need to call the method inside the main again.(it is called 
	//inside the constructor)
	// here I did both calling it inside the main and constructor both
	DiceRoller(){
		
		roll();
		
	}
	void roll() {
		number = rand.nextInt(6) +1;
		System.out.println(number);
	}
	
}
