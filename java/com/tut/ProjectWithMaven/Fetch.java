package com.tut.ProjectWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {
	
public static void main(String args[]) {
	//get and load method example 
	 
 Configuration cfg= new Configuration();
 cfg.configure("hibernate.cfg.xml");
 SessionFactory factory = cfg.buildSessionFactory();
 Session session= factory.openSession();
 
 /*Student student= (Student)session.get(Student.class, 108);
 System.out.println(student);*/
 
 Student s1= (Student)session.load(Student.class, 108);
 System.out.println(s1);
 
 
 
 Address ad= (Address)session.get(Address.class, 6);
     System.out.println(ad.getStreet()+" "  + ad.getCity());
   
 session.close();
 factory.close();
 
}

}