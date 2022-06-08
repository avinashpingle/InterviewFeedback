package com.testingshastra.interviewfeedback.entities;

import java.util.List;

public class Template {

	private long id;
	private String title;
	private List<Question> questions;
	
	public Template(long id, String title, List<Question> questions) {
		super();
		this.id = id;
		this.title = title;
		this.questions = questions;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Template [id=" + id + ", title=" + title + ", questions=" + questions + "]";
	}
	
	
	
}
