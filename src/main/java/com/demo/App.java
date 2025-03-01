package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	Student s=new Student();
    	s.setId(1);
    	s.setNme("Diya");
    	s.setTech("java");
    	
    	Configuration cnfg=new Configuration();
    	cnfg.addAnnotatedClass(com.demo.Student.class);
    	cnfg.configure("hibernate.cfg.xml");
    	SessionFactory sf=cnfg.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction transaction=session.beginTransaction();
    	session.persist(s);
    	transaction.commit();
    }
}
