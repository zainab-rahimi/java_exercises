package broCode.Encapsulation;

public class Entity {

	private String name;
	private int number;
	
	Entity(String name, int number){
		this.setName (name);
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
