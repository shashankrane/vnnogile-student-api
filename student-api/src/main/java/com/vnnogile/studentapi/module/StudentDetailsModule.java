package com.vnnogile.studentapi.module;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_form")
public class StudentDetailsModule {
	
	@Id
	@GeneratedValue
	private int id;
	
	
	private String firstName; 
	
	private String lastName;
	
	private String gender;
	
	private String city;
	
	
   //constructors
	public StudentDetailsModule() {
		super();
		
	}



	public StudentDetailsModule(int id, String firstName, String lastName, String gender, String city) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.city = city;
	}


 //getters and setters
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



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}
	
	

}
