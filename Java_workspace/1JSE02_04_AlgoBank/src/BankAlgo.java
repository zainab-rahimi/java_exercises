
public class BankAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int years = 4;
		float interest_rate = 0.3f;
		int money_invested = 100000;
		System.out.println("Total balance is: " + compound_interest_cal(money_invested, interest_rate,years));
	}
	
	
	public static float compound_interest_cal(
			int money_invested,
			float interest_rate,
			int years	
		) {
			float balance = money_invested * (float)Math.pow((1 + interest_rate) , years);
			return balance;
		
		
}
	}
