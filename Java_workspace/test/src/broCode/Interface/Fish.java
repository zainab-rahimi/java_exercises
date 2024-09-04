package broCode.Interface;

public class Fish implements Predator, Prey {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("the big fish eat the little fish in the sea");
		
	}
	public void flee() {
	System.out.println(" the fish should flee the predator!");
	}

}
