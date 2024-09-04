package com.zainab.entities;

import com.zainab.model.EtatCivil;
import com.zainab.model.AbstractTaxPayer;
import com.zainab.model.TaxCalculationStrategy;

public class FranceTaxCalculation implements TaxCalculationStrategy {

    @Override
    public double calculateTax(AbstractTaxPayer taxpayer) { 
        double parts = calculateParts(taxpayer);
        double revenuImposable = taxpayer.getRevenueAnnuel() / parts;
        double impot = 0;

        if (revenuImposable <= 9807) {
            impot = 0;
        } else if (revenuImposable <= 27086) {
            impot = (taxpayer.getRevenueAnnuel() * 0.14) - (1372.98 * parts);
        } else if (revenuImposable <= 72617) {
            impot = (taxpayer.getRevenueAnnuel() * 0.30) - (5706.74 * parts);
        } else if (revenuImposable <= 153783) {
            impot = (taxpayer.getRevenueAnnuel() * 0.41) - (13694.61 * parts);
        } else {
            impot = (taxpayer.getRevenueAnnuel() * 0.45) - (19845.93 * parts);
        }

        return impot;
    }

    @Override
    public double calculateParts(AbstractTaxPayer taxpayer) { 
        double parts = 1;
        if (taxpayer.getEtatCivil() == EtatCivil.MARRIED) {
            parts += 1;
        }
        parts += 0.5 * taxpayer.getEnfant();
        return parts;
    }
}
