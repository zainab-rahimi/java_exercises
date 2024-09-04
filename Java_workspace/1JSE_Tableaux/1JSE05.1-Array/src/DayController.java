
public class DayController {
	
	private static String WEEKDAYS[] = {
			"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	
	public static void main(String[] args) {
		displayDays();
	}
	
	public static String getDay() {
		int pos = new java.util.Random().nextInt(WEEKDAYS.length + 0) + 0;
		return WEEKDAYS[pos];
	}
	public static void displayDays() {
		String day=getDay();
		for (String d: WEEKDAYS) {
			String out = day==d ? "\t": "";	// une ternaire
			out += d;
			System.out.println(out);

		}
	}


}
