package Hibernatia;

import javax.persistence.*;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Use appropriate strategy
    @Column(name = "answer_id") // Explicitly specify column name
    private int answerId;

    private String answer;

    @OneToOne(mappedBy = "answer")
    private Question question;

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

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
