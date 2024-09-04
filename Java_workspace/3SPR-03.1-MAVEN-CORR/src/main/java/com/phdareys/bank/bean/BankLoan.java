package com.phdareys.bank.bean;

public class BankLoan {
	private int amount;		// la somme à emprunter
	private int monthsNb;	// la durée en mois
	private double rate;	// le taux
	
	private int monthlyPaiement;	// out: le paiement mensuel
	private int bankBenefit;		// out: le bénéfice de la banque
	
	public BankLoan() {
		super();
	}
	
	public BankLoan(int amount, int monthsNb, double rate) {
		super();
		this.amount = amount;
		this.monthsNb = monthsNb;
		this.rate = rate;
	}

	public BankLoan(int amount, int monthsNb) {
		this(amount, monthsNb, 0.045);	// autre constructeur!
	}

	public void run() {
			// rôle: maj les 2 attributs
		monthlyPaiement = (int) ((amount*rate/12)/
				(1 - Math.pow(1+(rate/12),-monthsNb)));
		bankBenefit = monthlyPaiement*monthsNb - amount;
	}

	@Override
	public String toString() {
		return "BankLoan [amount=" + amount + ", monthsNb=" + monthsNb + ", rate=" + rate + ", monthlyPaiement="
				+ monthlyPaiement + ", bankBenefit=" + bankBenefit + "]";
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getMonthsNb() {
		return monthsNb;
	}

	public void setMonthsNb(int monthsNb) {
		this.monthsNb = monthsNb;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getMonthlyPaiement() {
		return monthlyPaiement;
	}

	public void setMonthlyPaiement(int monthlyPaiement) {
		this.monthlyPaiement = monthlyPaiement;
	}

	public int getBankBenefit() {
		return bankBenefit;
	}

	public void setBankBenefit(int bankBenefit) {
		this.bankBenefit = bankBenefit;
	}

}
