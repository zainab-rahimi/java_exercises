
public class DayController {

	public static String getDay() {
		int index_day =  new java.util.Random().nextInt(myDays.length);
		return myDays[index_day];
	}
	
	public static void displayDay() {
		String day = getDay();
		for (String d: myDays) {
			String out = day.equals(d) ? "\t": "";
			out +=d ;
			System.out.println(out);
					
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		displayDay();
	}
	static String myDays []= {"Lundi", "mardi", "merdredi", "jeudi", "vendredi", "samdi", "dimanche"};

}
