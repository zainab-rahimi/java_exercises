
public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("La somme est: " + sum(1, 14, 3));
	}
	public static int sum(int start, int stop, int tab) {
		int ret=0;
		for (int i=start;i<stop; i ++) {
			if (i%tab==0)
				ret+= i;
		}
		return ret;
	}

}
