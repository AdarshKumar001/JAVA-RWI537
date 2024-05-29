package Hibernate12;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "questions")
public class Question12 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private int questionId;

    private String question;
@OneToMany(mappedBy = "question")
   private List<Answer12> answer;

public int getQuestionId() {
	return questionId;
}

public void setQuestionId(int questionId) {
	this.questionId = questionId;
}

public String getQuestion() {
	return question;
}

public void setQuestion(String question) {
	this.question = question;
}

public List<Answer12> getAnswer() {
	return answer;
}

public void setAnswer(List<Answer12> answer) {
	this.answer = answer;
}

public Question12() {
	super();
	this.questionId = questionId;
	this.question = question;
	this.answer = answer;
}

    
}
