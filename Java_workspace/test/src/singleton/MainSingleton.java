package singleton;

public class MainSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton singleinstance = Singleton.getexample("What??!");
		Singleton secondinstance = Singleton.getexample("Whay what??");
		System.out.println(singleinstance.example);
		System.out.println(secondinstance.example);
	}

}
