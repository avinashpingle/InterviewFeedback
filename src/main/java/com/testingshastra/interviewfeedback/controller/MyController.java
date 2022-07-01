package com.testingshastra.interviewfeedback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testingshastra.interviewfeedback.entities.Question;
import com.testingshastra.interviewfeedback.entities.Template;
import com.testingshastra.interviewfeedback.entities.User;
import com.testingshastra.interviewfeedback.services.TemplateService;
import com.testingshastra.interviewfeedback.services.UserService;

@RestController
public class MyController {

	@Autowired
	private TemplateService templateService;
	@Autowired
	private UserService userService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome";
	}

//	@GetMapping("/templates/{userId}")
//	public List<Template> getTemplates(@PathVariable String userId) {
//		return templateService.getTemplates(userId);
//	}
//	
//	@PostMapping("/templates/{userId}")
//	public Template createTemplate(@RequestBody Template template, @PathVariable String userId) {
//		System.out.println(template.toString());
//		return templateService.createTemplate(template, userId);
//	}
//	
//	@GetMapping("/questions/{userId}/{templateId}")
//	public List<Question> getQuestions(@PathVariable String userId, @PathVariable long templateId) {
//		return templateService.getQuestions(userId, templateId);
//	}
//	
//	@PostMapping("/user")
//	public User createUser(@RequestBody User user) {
//		return userService.createUser(user);
//	}
//	
//	@GetMapping("/users")
//	public List<User> getUsers() {
//		return userService.getUsers();
//	}
//	
//	@GetMapping("/user/{userId}")
//	public User getUser(@PathVariable String userId) {
//		return userService.getUser(userId);
//	}
}
