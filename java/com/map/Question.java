package com.map;

import java.util.jar.Attributes.Name;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Question {
	@Id
	private int QuestionID;
	@Column(name = "questions")
	private String question;
	@OneToOne
	private Answer answer ;
	
	
	public Answer getAnswer() {
		return answer;
	}


	public void setAnswer(Answer answer) {
		this.answer = answer;
	}


	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Question(int questionID, String question) {
		super();
		QuestionID = questionID;
		this.question = question;
	}


	public int getQuestionID() {
		return QuestionID;
	}


	public void setQuestionID(int questionID) {
		QuestionID = questionID;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}
		
}

