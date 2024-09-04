package com.bge.MainController;

import java.util.Comparator;

import com.bge.entity.Salaire;

public class MainComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Salaire[] listSalary = {
                new Salaire("Obama", "Sylvia", 1000),
                new Salaire("Pat", "Trump", 2000),
                new Salaire("Alicia", "Murray", 4000),
                new Salaire ("Emma", "watson", 1000)
            };

        // print the list elements
        for (Salaire s: listSalary) {
        	System.out.println(s);
        }
	}

}
