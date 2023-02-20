package com.tut.ProjectWithMaven;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;



import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 *
 */
public class App 
{
    public static void main( String[] args )throws IOException
    {
       System.out.println( "project started " );
       Configuration cfg= new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory = cfg.buildSessionFactory();
       
       //creating student object. 
       
Student st= new Student();  
st.setId(108);
st.setName("saroj ");
st.setCity("prayagraj");
System.out.println(st);

// creating  object of address class; 

Address ad= new Address();
ad.setStreet("street1");
ad.setCity("Prayagraj");
ad.setIs_open(true);
ad.setAddedDate(new Date());
ad.setX(1243.44);

//Reading image 
FileInputStream fis= new FileInputStream("C:\\Users\\RAHUL\\eclipse-workspace\\ProjectWithMaven\\src\\main\\java\\tuhi06.png");
byte[] data = new byte[fis.available()];
fis.read(data);
ad.setImage(data);



 Session session =  factory.openSession();
    Transaction tx = session.beginTransaction();
    
    session.save(st);
    session.save(ad);
   
     tx.commit();
    session.close();
    fis.close();
    System.out.println("DONE");
    
     
    }
}
