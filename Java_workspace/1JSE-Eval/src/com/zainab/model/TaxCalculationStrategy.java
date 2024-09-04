package com.zainab.model;

public interface TaxCalculationStrategy {
    double calculateTax(AbstractTaxPayer taxPayer);
    double calculateParts(AbstractTaxPayer taxpayer);
}
