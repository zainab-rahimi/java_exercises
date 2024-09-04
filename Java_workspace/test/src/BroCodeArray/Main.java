package BroCodeArray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare some arrays of different types
		int [] numbers =new int [4];
		String [] names =  new String[2];
		char [] chars = new char[3];
		
		// now let's create an array of objects
		
		Food []listFood = new Food[3] ;
		Food food1 = new Food("rice");
		Food food2 = new Food("pasta");
		Food food3 = new Food("pizza");
		Food food4 = new Food ("fish");
		
		listFood [0]= food1;
		listFood[1]= food2;
		listFood [2] = food3;
		System.out.println(listFood[0].name);
		System.out.println(food3.size);		 
	}

}
