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
    	s.setId(2);
    	s.setNme("Jeeva");
    	s.setTech("Python");
    	
//    	StudentDao.saveStudent(s);
    	
//    	Student s1=StudentDao.getStudentById(2);
//    	System.out.println(s1.getId());
//    	System.out.println(s1.getNme());
//    	System.out.println(s1.getTech());
    	
    	Student s2=new Student();
    	s2.setId(2);
    	s2.setNme("Jeeva");
    	s2.setTech("c++");
    	
    	StudentDao.UpdateStudent(s2);
    	
    }
}
