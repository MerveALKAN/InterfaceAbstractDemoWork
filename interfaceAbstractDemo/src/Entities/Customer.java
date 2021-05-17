package Entities;



import java.time.LocalDate;

import Abstract.Entity;

public class Customer implements Entity {
private int id;
private String firstName;
private String lastName;
private LocalDate birthOfDate;
private String nationalityID;

public  Customer() {
	
}

public Customer(int id, String firstName, String lastName, LocalDate birthOfDate, String nationalityID) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.birthOfDate = birthOfDate;
	this.nationalityID = nationalityID;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public LocalDate getBirthOfDate() {
	return birthOfDate;
}

public void setBirthOfDate(LocalDate birthOfDate) {
	this.birthOfDate = birthOfDate;
}

public String getNationalityID() {
	return nationalityID;
}

public void setNationalityID(String nationalityID) {
	this.nationalityID = nationalityID;
}

}
