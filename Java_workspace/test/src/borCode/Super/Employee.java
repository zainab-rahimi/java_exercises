package borCode.Super;

public class Employee extends Human{

	String job; 
	
	Employee(String name, int age, String job){
		super(name, age);
		this.job = job;
	}
	
	// here we used the super to get the toString method from the parent class and we modified it to add the job title
	public String toString() {
		return super.toString() + "\n" +this.job;
	}
}
