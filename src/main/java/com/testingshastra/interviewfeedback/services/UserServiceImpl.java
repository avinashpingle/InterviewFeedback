package com.testingshastra.interviewfeedback.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.testingshastra.interviewfeedback.entities.User;

@Service
public class UserServiceImpl implements UserService {
	List<User> users;
	
	public UserServiceImpl() {
		users = new ArrayList<User>();
	}

	@Override
	public User deleteUser(User user) {
		users.remove(user);
		return user;
	}
	
	

	@Override
	public User createUser(User user) {
		users.add(user);
		return user;
	}

	@Override
	public User getUser(String id) {
		User usr = null;
		for (User user : users) {
			if(user.getId().equals(id)) {
				usr = user;
				break;
			}
		}
		return usr;
	}

	@Override
	public List<User> getUsers() {
		return users;
	}



}
