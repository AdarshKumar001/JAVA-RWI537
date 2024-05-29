package Hibernate12;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App_main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Configuration cfg = new Configuration();
        cfg.configure("hibernate33.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        // First question and answer
        
        Question12 q1=new Question12();
        q1.setQuestion("What is Java");

        
        //Creating answer
        Answer12 answer = new Answer12();
        answer.setAnswer("Java is a programming language");
        answer.setAnswerId(222);
        answer.setQuestion(q1);
        
        // Second answer
        
        //Creating answer
        Answer12 answer1 = new Answer12();
        answer1.setAnswer("with the help of java we can creat software");
        answer1.setAnswerId(352);
        answer1.setQuestion(q1);
        
        //thrid answer
        
        //Creating answer
        Answer12 answer2 = new Answer12();
        answer2.setAnswer("java has different type of framework");
        answer2.setAnswerId(858);
        answer2.setQuestion(q1);
        
        List<Answer12> list=new ArrayList<Answer12>(); 
        list.add(answer);
        list.add(answer1);
        list.add(answer2);
        
         

        Session session = factory.openSession();
        session.save(q1);
        session.save(answer1);
        session.save(answer2);
        session.save(answer);
       
        
        q1.setAnswer(list);
        
        
        Transaction tx = session.beginTransaction();
        
        tx.commit();

       
        session.close();
        factory.close();
    }
}
