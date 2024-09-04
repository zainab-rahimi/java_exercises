package com.zainab.model;

public class Person {
	
	private String fName;
	private String lName;
	private int age;
	private AgeCat AgeCat;
	
	public Person() {
		
	}
	public Person(String fName,String lName, int age ) {
		this.fName = fName;
		this.age = age;
		this.lName = lName;
	}
	
	public void getCat() {
		for (AgeCat ac: AgeCat.values()) {
			if(ac.getMax() <= this.age && ac.getMin() >= this.age) {
				this.AgeCat = ac;
				break;
			}
		}
	}
	@Override
	public String toString() {
		return "Person [fName=" + fName + ", lName=" + lName + ", age=" + age + ", AgeCat=" + AgeCat + "]";
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public AgeCat getAgeCat() {
		return AgeCat;
	}
	public void setAgeCat(AgeCat ageCat) {
		AgeCat = ageCat;
	}

}
