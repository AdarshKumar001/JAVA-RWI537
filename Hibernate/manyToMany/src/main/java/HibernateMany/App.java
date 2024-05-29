package HibernateMany;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate44.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Employees E1 = new Employees();
        Employees E2 = new Employees();
        
        E1.setEmployeeId(33);
        E1.setEmployeeName("Ram");
        
        E2.setEmployeeId(35);
        E2.setEmployeeName("Shayam");
        
        Project P1 = new Project();
        Project P2 = new Project();
        
        P1.setProjectId(2125236);
        P1.setProjectName("Libery management system");
        
        P2.setProjectId(252487);
        P2.setProjectName("CHATBOT");
        
        List<Employees> employeesList = new ArrayList<Employees>();
        List<Project> projectsList = new ArrayList<Project>();
        
        employeesList.add(E2);
        employeesList.add(E1);
        
        projectsList.add(P1);
        projectsList.add(P2);
        
        E1.setProjects(projectsList);
        E2.setProjects(projectsList);
        P1.setEmployees(employeesList);
        P2.setEmployees(employeesList);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(P1);
        session.save(P2);
        session.save(E1);
        session.save(E2);
        
        tx.commit();
        session.close();
        factory.close();
    }
}
