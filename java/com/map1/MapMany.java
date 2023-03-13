package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapMany {
	
	public static void main (String args[]) {
		
		Configuration cfg= new Configuration();
	       cfg.configure("hibernate.cfg.xml");
	       SessionFactory factory = cfg.buildSessionFactory();
	       
	      // create object
	       
	       Emp e1= new Emp();
	       Emp e2 = new Emp();
	       
	       Project p1= new Project();
	       Project p2= new Project();
	       
	      
	       e1.setEmpid(20068933);
	       e1.setEmpname("Rahul maurya ");
	       
	       p1.setProjectid(101);
	       p1.setProjectName("ransomware");
	    
	       e2.setEmpid(20068937);
	       e2.setEmpname("saurabh pandey");
	        
	       p2.setProjectid(102);
	       p2.setProjectName("trozen");
	       
	       
	       List<Emp> list1= new ArrayList<Emp>();
	       List<Project> list2= new ArrayList<Project>();

	       list1.add(e2);
	       list1.add(e1);
	       list2.add(p2);
	       list2.add(p1);
	     
	     e1.setProject(list2);
	     p1.setEmp(list1);
	     
	     Session session = factory.openSession();
	     Transaction tx = session.beginTransaction();
	     
	     session.save(e1);
	     session.save(e2);
	     session.save(p1);
	     session.save(p2);
	     
	    tx.commit();
	    session.close();
	    factory.close();
	    for (int i = 0; i<list1.size(); i++) {
	   System.out.println("size of list1 array is : " +list1 );      
	} 

	}
	
}
