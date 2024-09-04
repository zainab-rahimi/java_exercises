package borCode.Super;

public class Human {
	
	String name;
	int age;

	Human(String name, int age){
		this.name = name;
		this.age = age;
		
		
	}

	@Override
	public String toString() {
		return "name = " + name+ " \nage = " + age; 
	}
	
}
