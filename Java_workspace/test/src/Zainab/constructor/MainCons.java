package Zainab.constructor;

public class MainCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Masoud", 30, 78.0);
		System.out.println(emp);
		
		Employee emp2 = new Employee("Murray", 60, 67.3);
		System.out.println(emp2);
		
		emp.isDrunk();
	}
		

}
