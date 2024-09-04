package mypackage;
import java.util.Random;

public class MainDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRolls = 5;
		int []rollCounts = new int [6];
		Random rand = new Random();
		
		for (int i ; i< numRolls; i++) {
			int roll = rand.nextInt(6) + 1;
			rollCounts[roll --]++;
		}
		System.out.println()
	}

}
