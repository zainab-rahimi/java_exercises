package com.phdareys.person.form;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.phdareys.person.model.Person;

public class PersonForm {
	// but: depuis la saisie opérateur, fabriquer une Personne et un annuaire d'erreurs éventuelles
	private Person person;
    private Map<String, String> errors = new HashMap <>();  // pour g�rer l'erreur par champ
    
    private int age = 0;
    
    public PersonForm(HttpServletRequest request) {
    	this.checkValues(
    			request.getParameter("firstName"), 
    			request.getParameter("lastName"), 
    			request.getParameter("age"));	// age reçu sous forme String
		person = new Person (
				request.getParameter("firstName"), 
				request.getParameter("lastName"), 
				age);	// age sous forme int

    }
    	// check de chaque champ UN par UN
    private void checkValues(String firstName, String lastName, String sAge) {
    	if (firstName.length() <3)
    		errors.put("firstName", "FirstName length < 3!");
    	if (lastName.length() <3)
    		errors.put("lastName", "LastName length < 3!");
    	this.age = 0;		// je calcule l'age en int
    	try {	// j'essaie de convertir en int?
			this.age = Integer.parseInt(sAge);
	    	if (this.age > 110)
	    		errors.put("age", "age > 110!");
		} catch (NumberFormatException e) {
			errors.put("age", "Numeric value for Age!");
		}
   
    }
	public Person getPerson() {
		return person;
	}
	public Map<String, String> getErrors() {
		return errors;
	}


}
