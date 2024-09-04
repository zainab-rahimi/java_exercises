

public class EmployeeController{
public static void main(String []args) {


	Employee employeelist [] = {
			new Employee("Fatima", "Valbonne"),
			new Employee("Sameer", "Eurecom"),
			new Employee("Aamir", "Orange"),
			new Employee("zainab")
	};
	
	for (Employee el: employeelist) {
		System.out.println(el);
	}
}
}