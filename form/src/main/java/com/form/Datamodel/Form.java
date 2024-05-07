package com.form.Datamodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Form {
	public String Firstname;
	public String Lastname;
	@Id
	public String number;
	
	public String Password;
	public String email;
	public String gender;
	public String address;
	public String hobbies;
	

}
