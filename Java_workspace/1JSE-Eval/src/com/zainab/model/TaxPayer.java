package com.zainab.model;

public class TaxPayer extends AbstractTaxPayer {

    public TaxPayer(String nom, int revenueAnnuel, EtatCivil etatCivil, int enfant, TaxCalculationStrategy taxCalculationStrategy) {
        super(nom, revenueAnnuel, etatCivil, enfant, taxCalculationStrategy);
    }
}
