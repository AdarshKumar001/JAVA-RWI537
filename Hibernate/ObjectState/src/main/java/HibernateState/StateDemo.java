package HibernateState;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StateDemo 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //practical of hibernate object states:
        //1 Transient State
        //2 Persistent State
        //3 Detached State
        //4 Remove State
        
       SessionFactory f=new Configuration().configure("Hibernate66.cfg.xml").buildSessionFactory();
       
       
       Studentss student=new Studentss();
             student.setStudentId(03);
             student.setName("Adarsh_Rajput");
             student.setCityName("Bihar(Bikrajung)");
             student.setCertificate("Java Hibernate Course");
             
            // Student:Transient
       
       
       Session s=f.openSession();
       Transaction tx=s.beginTransaction();
       s.save(student);
       //student : Persistent-Session,database
       
       student.setCityName("Bhopal");//sabse pahale ye wala chalega
       tx.commit();
       
       
       s.close();//student: Detached:  ho gaya data base me value nahi badalegi
       student.setCityName("Indore");//database ne value nahi change hogi
       
       
       
       
       f.close();
        
    }
}
