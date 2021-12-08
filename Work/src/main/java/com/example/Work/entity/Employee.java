package com.example.Work.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int Id;
	
	public Employee()
	{
		
	}
	private String FirstName;
	
	private String LastName;
	
	private String Designation;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public Employee(String firstName, String lastName, String designation) {
		
		FirstName = firstName;
		LastName = lastName;
		Designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Designation="
				+ Designation + "]";
	}
	
	
}
