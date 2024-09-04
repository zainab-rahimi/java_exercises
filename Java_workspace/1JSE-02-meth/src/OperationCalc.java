
public class OperationCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// We invoke the method inside the main, initialization of method parameters inside the main method

		int start;
		int end ;
		int interval ;
		System.out.println(sumValues(1,14,3));
	}
		
		public static int sumValues(int start, int end, int interval) {
			int result = 0;
			for (int i = start; i < end; i++) {
				if (i % interval ==0) 
					result += i;
			}
			return result;
		}
		
	
}
