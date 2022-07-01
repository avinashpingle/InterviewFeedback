package com.testingshastra.interviewfeedback.entities;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question {
	@Id
	private int questionId;
	private String questionTitle;
	//private Map<Integer, Integer> scales;
	private String comment;

	public Question() {
		super();
	}

	public Question(int questionId, String questionTitle, Map<Integer, Integer> scales, String comment) {
		super();
		this.questionId = questionId;
		this.questionTitle = questionTitle;
	//	this.scales = scales;
		this.comment = comment;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

//	public Map<Integer, Integer> getScales() {
//		return scales;
//	}
//
//	public void setScales(Map<Integer, Integer> scales) {
//		this.scales = scales;
//	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
