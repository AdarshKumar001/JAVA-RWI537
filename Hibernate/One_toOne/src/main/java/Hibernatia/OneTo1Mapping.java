package Hibernatia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneTo1Mapping {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();//
        cfg.configure("hibernate22.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        // First question and answer
        Question q1 = new Question();
        q1.setQuestion("What is Java");

        Answer answer1 = new Answer();
        answer1.setAnswer("Java is a programming language");
        q1.setAnswer(answer1);

        // Second question and answer
        Question q2 = new Question();
        q2.setQuestion("What is Collection");

        Answer answer2 = new Answer();
        answer2.setAnswer("API to work with objects in Java");
        q2.setAnswer(answer2);

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        // Save the questions, cascading should handle the answers
        session.save(q1);
        session.save(q2);

        tx.commit();
        
        session.close();
        factory.close();
    }
}
