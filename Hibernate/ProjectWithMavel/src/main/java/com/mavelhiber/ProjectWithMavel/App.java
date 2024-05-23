package com.mavelhiber.ProjectWithMavel;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Initialize Hibernate configuration
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        // Build session factory
        SessionFactory factory = cfg.buildSessionFactory();

        // Create entity instances
        StudentDetail st = new StudentDetail();
        st.setId(2);
        st.setName("Adarsh");
        st.setRollNo("Roll-102");
       

        Address ad = new Address();
        ad.setHouseNo(55);
        ad.setPincode(802215);
        ad.setStreet("Narela Ayodhaya by pass");

        // Open session
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        // Save entities
        session.save(st);
        session.save(ad);

        // Commit transaction
        tx.commit();

        // Close session and factory
        session.close();
        factory.close();

        System.out.println("Done..");
    }
}
