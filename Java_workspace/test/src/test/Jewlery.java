package test;

public class Jewlery {
	
	private String type = "earing";  
	String color = "golden";
	int price = 300;
	int model = 2024;
	
	void print_detail() {
		System.out.println("We want to print the details of our object" + type);
	}
 
	public String getType() {
		return type;
	}
	 
}
