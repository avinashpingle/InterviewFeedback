package com.testingshastra.interviewfeedback.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Template {
	@Id
	private long templateId;
	private String title;
	@ManyToOne
	private User user;
	@OneToMany(mappedBy = "template")
	private List<Question> questions;

	public Template(long id, String title, List<Question> questions, User user) {
		super();
		this.templateId = id;
		this.title = title;
		this.questions = questions;
		this.user=user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public long getTemplateId() {
		return templateId;
	}

	public void setTemplateId(long id) {
		this.templateId = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
//
//	public List<Question> getQuestions() {
//		return questions;
//	}
//
//	public void setQuestions(List<Question> questions) {
//		this.questions = questions;
//	}

	@Override
	public String toString() {
		return "Template [templateId=" + templateId + ", title=" + title + ", user=" + user + ", questions=" + questions
				+ "]";
	}

}
