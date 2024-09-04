
import java.util.Random;

public class Tableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jours[] = {"Lundi", "mardi", "merdredi", "jeudi", "vendredi", "samdi", "dimanche"};
		getDay(jours);
	
	}
	
	public static String getDay(String[] array) {
		Random rand = new Random();
		int randIndex = rand.nextInt(array.length);
		String day = array[randIndex];
		System.out.println("random day is: " + day);
		for (String d: array) {
			System.out.println(d);
		}
		return day;
 	}
	
	
}
