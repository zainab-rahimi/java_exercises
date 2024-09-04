package com.zainab.form;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.zainab.model.Person;

public class FormValidation {
	
	private Person person;
	private Map <String, String> errors = new HashMap<>();
	private int age = 0;
	
	public FormValidation(HttpServletRequest request) {
		this.checkValues(
				request.getParameter("fName"),
				request.getParameter("lName"),
				request.getParameter("age"));  // get the age in String form
		person = new Person(
				request.getParameter("fName"),
				request.getParameter("lName"),
				age  // get the age after parsing into integer
			) ;
	}
	
	public void checkValues(String fName, String lName, String sAge) {
		if (fName.length()< 3) {
			errors.put(fName, "First name is less than 3 characters");
		}
		if(lName.length()<2) {
			errors.put(lName, "Last name can't be less than 2 characters");
		}
		this.age = 0;
		
		try {
			this.age = Integer.parseInt(sAge);
			if (this.age > 110) {
				errors.put("age", "Age more than 110?? Are you sure!");
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			errors.put("age","Enter numbers ");
		}
	}



	public Person getPerson() {
		return person;
	}

	public Map<String, String> getErrors() {
		return errors;
	}


}
