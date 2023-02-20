package com.tut.ProjectWithMaven;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embedcerti{
	 
	public static void main ( String args[]) {
		
		
		 Configuration cfg= new Configuration();
	       cfg.configure("hibernate.cfg.xml");
	       SessionFactory factory = cfg.buildSessionFactory();
	       
	       Student student1 = new Student();
	       student1.setId(9930);
	       student1.setName("ragav");
	       student1.setCity("prayagraj");
	       
	       Certificate certificate = new Certificate();
	       certificate.setCourse("ADVANCE JAVA");
	       certificate.setDuration("9 month");
	        
	       student1.setCerti(certificate);
		
	       
	       Student student2 = new Student();
	       student2.setId(9931);
	       student2.setName("ravi");
	       student2.setCity("prayagraj");
	       
	       Certificate certificate1 = new Certificate();
	       certificate1.setCourse("ADVANCE JAVA");
	       certificate1.setDuration("9 month");
	        
	       student2.setCerti(certificate1);
	       
	       
	       
	    Session s= factory.openSession();
	    Transaction tx= s.beginTransaction();
	    // save objects 
	   s.save(student1);
	   s.save(student2);
	   
	    
	 tx.commit();
	 s.close();
	 factory.close();
	    
	}
	
}
