package onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question_1 {
@Id
private int question_id;
private String question;
 
@OneToMany(mappedBy = "question_1") 
private List<Answer_1> answer_1;

public Question_1() {
	super();
	// TODO Auto-generated constructor stub
}

public int getQuestion_id() {
	return question_id;
}

public void setQuestion_id(int question_id) {
	this.question_id = question_id;
}

public String getQuestion() {
	return question;
}

public void setQuestion(String question) {
	this.question = question;
}

public List<Answer_1> getAnswer_1() {
	return answer_1;
}

public void setAnswer_1(List<Answer_1> answer_1) {
	this.answer_1 = answer_1;
}

public Question_1(int question_id, String question, List<Answer_1> answer_1) {
	super();
	this.question_id = question_id;
	this.question = question;
	this.answer_1 = answer_1;
}




}
