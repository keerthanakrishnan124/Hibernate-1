package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDao {
	
	public static SessionFactory getSession() {
		Configuration cnfg=new Configuration();
    	cnfg.addAnnotatedClass(com.demo.Student.class);
    	cnfg.configure("hibernate.cfg.xml");
    	SessionFactory sf=cnfg.buildSessionFactory();
    	return sf;
//    	Session session=sf.openSession();
//    	Transaction transaction=session.beginTransaction();
//    	session.persist(s);
//    	transaction.commit();
	}
	
	
	public static void saveStudent(Student s) {
		SessionFactory sf=StudentDao.getSession();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		session.persist(s);
		t.commit();
		session.close();
		sf.close();
		System.out.println("Success");
	}
	
	public static Student getStudentById(int id) {
		SessionFactory sf=StudentDao.getSession();
		Session session=sf.openSession();
		Student s=session.find(Student.class, 2);
		return s;
	}
}
