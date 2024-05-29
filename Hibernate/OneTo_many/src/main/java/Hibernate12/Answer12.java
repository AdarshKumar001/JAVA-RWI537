package Hibernate12;

import javax.persistence.*;

@Entity
@Table(name = "answers")
public class Answer12 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_id")
    private int answerId;

    private String answer;

    @ManyToOne 
    private Question12 question;

    // Getters and setters
    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question12 getQuestion() {
        return question;
    }

    public void setQuestion(Question12 question) {
        this.question = question;
    }
}
