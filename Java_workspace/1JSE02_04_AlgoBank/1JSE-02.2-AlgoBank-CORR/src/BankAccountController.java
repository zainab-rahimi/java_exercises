/**
 * Pb bancaire
 * @author Philippe Dareys
 * @version renseigne le numero de version d'une classe  
 * @since indique depuis quelle version de la classe existe une methode, un parametre.
 * 
 */
public class BankAccountController {

	/**
	 * le main
	 * @param args les args
	 */
	public static void main(String[] args) {
			// init
		int amount=1000000;
		int year=5;
		float rate=0.04F;
		int tax = 100;
			// calcul
		int benefit=getBenefit(amount, year, rate, tax);
		int res=getFinalAmount(amount, benefit);
			// rendu
		System.out.println("Initial amount: " + amount + 
				", year: "+year+ ", rate: " + rate +
				" -> benefit: " + benefit+
				" (total: " + res + ")");

	}

	/**
	 * la somme finale
	 * @param amount
	 * @param benefit
	 * @return total
	 */
	private static int getFinalAmount(int amount, int benefit) {
		return amount + benefit;
	}

	/**
	 * Partir de la somme initiale, l'incrementer au cours des annees, deduire la taxe
	 * @param amount		somme initiale
	 * @param yearNb		nombre d'annees en depot
	 * @param rate			taux
	 * @return				benefice
	 */
	private static int getBenefit(int amount, int yearNb, float rate, int tax) {
		float finalAmount = amount;
		for (int i=0; i < yearNb; i++) {
			float add = rate*finalAmount;	// par année
			finalAmount += add;
		}
		return (int) (finalAmount-tax-amount);
	}


}
