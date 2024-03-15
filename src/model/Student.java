package model;

public class Student extends Person {
	
	//1. variables
	private long sID;

	
	private static long counter = 1000;

	
	public long getsID1() {
		return sID;
	}
	public void setsID1() {
		this.sID = counter;
		counter++;
	}
	
	
	//2.set and get
	
	public long getsID() {
		return sID;
	}
	public void setsID() {
		this.sID = counter;
		counter++;
	}
	
	//3. constructors
	public Student()
	{
		super();
		setsID1();
	}
	
	public Student(String name, String surname, String personCode)
	{
		super(name, surname, personCode);
		setsID1();
		setName(name);
		setSurname(surname);
		setPersonCode(personCode);
	}
	
	//4. toString
	@Override
	public String toString() {
		return sID + ": "+super.toString();
	}
	
	//5. other functions

}
