package Zainab.constructor;

public class Employee {
 
	String name;
	int age;
	double weight;
	Employee(String name, int age, double weight){
		this.age = age;
		this.name = name;
		this.weight = weight;
		
	}
	Employee(){
		
	}
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
//	public String toString() {
//		return "Employee name is : " + name;
//	}
	
	void isDrunk() {
		System.out.println(this.name + "  is a drunk!");
	}
}
