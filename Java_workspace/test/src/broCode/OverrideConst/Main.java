package broCode.OverrideConst;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza [] pizzalist = {
				new Pizza ("Calzone", "mayo","mozzarela","complet", 23 ),
				new Pizza ("Margarita",80,"Chedar", "Ceareal")
		};
		for (Pizza p: pizzalist) {
			System.out.println(p);
		}
	}

}
