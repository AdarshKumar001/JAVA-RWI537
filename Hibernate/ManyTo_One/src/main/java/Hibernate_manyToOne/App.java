package Hibernate_manyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Create SessionFactory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Open a session
        Session session = sessionFactory.openSession();

        // Begin transaction
        Transaction transaction = session.beginTransaction();

        // Create a new product
        Product product = new Product();
        product.setName("Laptop");
        session.save(product);

        // Create a new purchase
        Purchase purchase = new Purchase();
        purchase.setQuantity(5);
        purchase.setProduct(product);
        session.save(purchase);

        // Commit transaction
        transaction.commit();

        // Close the session
        session.close();

        // Close the sessionFactory
        sessionFactory.close();
    }
}
