package model;

public class Person {
	
	
	//1variables
	//getters and setters
	//constructors
	//toString functions
	//other functions if it is neccessary
	
	private String name;
	private String surname;
	private String personCode;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null  && name.matches("[A-Z]{1}[a-z]{1,20}"))
			this.name = name;
		else
			this.name = "Undefinied";
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		if(surname != null && surname.matches("[A-Z]{1}[a-z]{1,20}"))
			this.surname = surname;
		else
			this.surname = "Undefinied";
	}
	
	
	public String getPersonCode() {
		return personCode;
	}
	public void setPersonCode(String personCode) {
		if(personCode != null && personCode.matches("[0-9]{6}-[0-9]{5}"))
			this.personCode = personCode;
		else
			this.personCode = "Undefinied";
	}
	
	
	
	
	
	
	
	
	
	
	

}
