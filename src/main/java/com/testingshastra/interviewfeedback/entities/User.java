package com.testingshastra.interviewfeedback.entities;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String id;
	private String firstName;
	private String lastName;
	private String password;
	private String confirmPassword;
	private String phone;
	private List<Template> userTemplates;
	
	public User(String id, String firstName, String lastName, String password, String confirmPassword, String phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.phone = phone;
		//Create empty arraylist of templates for new user
		this.userTemplates = new ArrayList<Template>();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Template> getUserTemplates() {
		return userTemplates;
	}

	public void setUserTemplates(List<Template> userTemplates) {
		this.userTemplates = userTemplates;
	}

	
	
}
