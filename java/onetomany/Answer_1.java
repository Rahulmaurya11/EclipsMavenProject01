package onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Answer_1 {
 @Id
 @Column(name = "ANSWER_ID")
	private int answerid ;
 @Column(name = "ANSWER")
	private String answer;
	@ManyToOne
	private Question_1 question_1;
	public int getAnswerid() {
		return answerid;
	}
	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question_1 getQuestion_1() {
		return question_1;
	}
	public void setQuestion_1(Question_1 question_1) {
		this.question_1 = question_1;
	}
	public Answer_1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer_1(int answerid, String answer, Question_1 question_1) {
		super();
		this.answerid = answerid;
		this.answer = answer;
		this.question_1 = question_1;
	}
	
	
	
	
	


}
