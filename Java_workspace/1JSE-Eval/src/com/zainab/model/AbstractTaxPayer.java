package com.zainab.model;

public abstract class AbstractTaxPayer {
    protected String nom;
    protected int revenueAnnuel;
    protected EtatCivil etatCivil;
    protected double parts;
    protected int enfant;
    protected double impot;
    protected TaxCalculationStrategy taxCalculationStrategy;

    public AbstractTaxPayer(String nom, int revenueAnnuel, EtatCivil etatCivil, int enfant, TaxCalculationStrategy taxCalculationStrategy) {
        super();
    	this.nom = nom;
        this.revenueAnnuel = revenueAnnuel;
        this.etatCivil = etatCivil;
        this.enfant = enfant;
        this.taxCalculationStrategy = taxCalculationStrategy;
        this.parts = taxCalculationStrategy.calculateParts(this);
        this.impot = taxCalculationStrategy.calculateTax(this);
    }


	public String getNom() {
        return nom;
    }

    public int getRevenueAnnuel() {
        return revenueAnnuel;
    }

    public EtatCivil getEtatCivil() {
        return etatCivil;
    }

    public double getParts() {
        return parts;
    }

    public int getEnfant() {
        return enfant;
    }

    public double getImpot() {
        return impot;
    }
    
    @Override
	public String toString() {
		return "AbstractTaxPayer [nom=" + nom + ", revenueAnnuel=" + revenueAnnuel + ", etatCivil=" + etatCivil
				+ ", parts=" + parts + ", enfant=" + enfant + ", impot=" + impot + ", taxCalculationStrategy="
				+ taxCalculationStrategy + "]";
	}

}
