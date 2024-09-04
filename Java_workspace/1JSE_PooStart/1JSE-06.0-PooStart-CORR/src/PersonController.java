
public class PersonController {

	public static void main(String[] args) {
		
		Person [] personnes = {
				new Person ("Paul", "Sfr"),
				new Person ("Cynthia", "Free"),
				new Person ("Pierre"),
				new Person ("Elsa"),
				
		};
		for (Person p:personnes)
			System.out.println (p);

	}

}
