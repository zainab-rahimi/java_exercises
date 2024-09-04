package com.phdareys.sql.controller;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance("FOO");
		System.out.println(singleton.value); 
		Singleton anotherSingleton = Singleton.getInstance("BAR");
		System.out.println(anotherSingleton.value);
		anotherSingleton = Singleton.getInstance("BAR2");
		System.out.println(anotherSingleton.value);

	}
}
class Singleton {
	    private static Singleton instance = null;
	    public String value;

	    private Singleton(String value) {
	        // The following code emulates slow initialization.
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException ex) {
	            ex.printStackTrace();
	        }
	        this.value = value;
	    }

	    public static Singleton getInstance(String value) {
	        if (instance == null) {
	            instance = new Singleton(value);
	            System.out.println("Instantiation");
	        }
	        return instance;
	    }

}
