package com.phdareys.person.form;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import com.phdareys.person.model.User;

public class UserForm {
	//	objectif: restituer l'objet métier et les erreurs éventuelles sur le formulaire
	// Astuce: les clés de mon hashmap d'erreurs sont les noms HTML des champs du formulaire
	// attribut: name
	private User user;	// out
    private Map<String, String> errors = new HashMap <>();  // out 
    
    public UserForm(HttpServletRequest request) {
     	Date d=this.convDate(request.getParameter("birthDate")); // date convertie! 
		user = new User (
				request.getParameter("id"), 
				d,	// null si pas bonne
				request.getParameter("passwd"));	
	   	this.checkValues(
    			request.getParameter("id"), 
    			request.getParameter("passwd"), 
    			request.getParameter("passwd2"),
    			d);	

    }
    	// check de chaque champ UN par UN
    private void checkValues(String sId, String pass1, String pass2, Date d) {
    	// contrôles: ereg sur id, mdp=mdp2, mdp1 + de 6, date not null
    	// 1/
        Pattern pattern = Pattern.compile("^BGE-[0-9]{3,3}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sId);
        boolean matchFound = matcher.find();
        if(! matchFound) {
           errors.put("id", "Règle: BGE-<3 entiers> !");
        }
         // 2/ et 3/
        if (! pass1.equalsIgnoreCase(pass2)) {
        	errors.put("passwd2", "Password non identiques !");
        }
        if (pass1.length() < 6) {
        	errors.put("passwd", "Longueur Password < 6 !");      	
        }
        if (pass2.length() < 6) {
        	errors.put("passwd2", "Longueur Password < 6 !");      	
        }
        // 4/
        if (d==null) {
        	errors.put("birthDate", "Date incorrecte !");      	
       	
        }
    }
    private Date convDate(String sDate) {	// conversion date String en Date Java
    	Date d=new Date();
    	DateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
    	try {
			d = formatter.parse(sDate);
		} catch (ParseException e) {
			d=null;
		}
		return d;
    	
    }
	public Map<String, String> getErrors() {
		return errors;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}


}
