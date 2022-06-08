package com.testingshastra.interviewfeedback.services;

import java.util.List;

import com.testingshastra.interviewfeedback.entities.User;

public interface UserService {

	public User deleteUser(User user);
	public User createUser(User user);
	public User getUser(String id);
	public List<User> getUsers();
	
}
