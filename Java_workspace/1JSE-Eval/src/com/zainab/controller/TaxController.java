package com.zainab.controller;
import com.zainab.entities.FranceTaxCalculation;
import com.zainab.entities.SympaTaxLandCalculation;
import com.zainab.model.*;

public class TaxController {
	public static void main(String[] args) {
		 TaxCalculationStrategy franceTaxCalculation = new FranceTaxCalculation();
		 
	        TaxPayer taxpayer1 = new TaxPayer("Paul", 50000, EtatCivil.MARRIED, 2, franceTaxCalculation);
	        System.out.println("Nombre de parts pour " + taxpayer1.getNom() +" est: "+taxpayer1.getParts());
	        System.out.println("Impot pour Paul (France) : " + taxpayer1.getImpot());
	  
	        

	        TaxCalculationStrategy sympaTaxLandCalculation = new SympaTaxLandCalculation();
	        TaxPayer taxpayer2 = new TaxPayer("Sylvia", 30000, EtatCivil.DIVORCED, 3, sympaTaxLandCalculation);
	        System.out.println("Nombre de parts pour " + taxpayer2.getNom() +" est: "+taxpayer2.getParts());
	        System.out.println("Impot pour Sylvia (SympaTaxLand): " + taxpayer2.getImpot());
	        

	        TaxPayer taxpayer3 = new TaxPayer("John", 50000, EtatCivil.MARRIED, 2, sympaTaxLandCalculation);
	        System.out.println("Nombre de parts pour " + taxpayer3.getNom() +" est: "+taxpayer3.getParts());
	        System.out.println("Impot pour John (SympaTaxLand): " + taxpayer3.getImpot());
	        System.out.println("Imposable revenue sur revenue Annuel " + taxpayer3.getRevenueAnnuel() +" est: "+taxpayer3.getImpot());
	    }
    
}
