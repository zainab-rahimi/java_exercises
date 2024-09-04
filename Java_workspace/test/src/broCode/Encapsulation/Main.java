package broCode.Encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entity item1 = new Entity("Pen", 7);
		
		System.out.println(item1.getName());
		item1.setName("Black pen");
		
		System.out.println(item1.getName());
	}

}
