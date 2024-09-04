
public class InseeMain { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InseeClass my_num = new InseeClass(2690549588157l);
		
		
	
		int result =InseeClass.calNum(my_num.getInsee_num()) ; //called in the static way which is not good 
		//insee.calNum()

		
		System.out.println("The two last digits for "+ my_num+ " is : " + result );
	
		
	}
}

