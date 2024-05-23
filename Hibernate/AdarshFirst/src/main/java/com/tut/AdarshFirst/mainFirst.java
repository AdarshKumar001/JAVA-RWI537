package com.tut.AdarshFirst;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mainFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("code Started  here:-");
		
		Configuration cfg = new Configuration();
		cfg.configure("AdarshHiber.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Bank bank = new Bank();
		
		bank.setBankName("HDFC");
		bank.setIFSC("hdfc123");
		
		Employee E1 = new Employee();
		
		E1.setEmployeName("Adarsh_Rajpu");
		E1.setJob_title("Software Developer");
		E1.setSalary("54000");
		
		
		bank.setEmployee(E1);

		Session session = factory.openSession();
	    session.save(bank);
	    
	    Transaction ts = session.beginTransaction();
	    
	    ts.commit();
	    session.close();
        System.out.println("Done..");
	}

}
