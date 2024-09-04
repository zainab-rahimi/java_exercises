package broCode.OverrideConst;

public class Pizza {
	String name;
	int size;
	String sauce;
	String cheese;
	String bread;
	
	//make the constructor
	Pizza(String name, String sauce, String cheese, String bread, int size) {
		this.name = name;
		this.bread= bread;
		this.cheese = cheese;
		this.sauce = sauce;
		this.size = size;
	}

	public Pizza(String name, int size, String cheese, String bread) {
		super();
		this.name = name;
		this.size = size;
		this.cheese = cheese;
		this.bread = bread;
	}

	@Override
	public String toString() {
		return "Pizza [name ="+ name + "size is " + size;
	}
	
	
	
	
}
