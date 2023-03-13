package onetomany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Manymap {
	
	public static void main (String args[] )
	{
	  	
		   Configuration cfg= new Configuration();
	       cfg.configure("hibernate.cfg.xml");
	       SessionFactory factory = cfg.buildSessionFactory();
	       
	//create object 
//	
//	Question_1 q1= new Question_1();
//	q1.setQuestion_id(201);
//	q1.setQuestion("where is mahakubh ");

	
	
	// other object
//	
//Answer_1 a1= new Answer_1();
//a1.setAnswerid(11);
//a1.setAnswer("mahakumbh is organaized state of uttar pradesh dist. prayagaraj. ");
//a1.setQuestion_1(q1);
//	
//
//Answer_1 a2= new Answer_1();
//a2.setAnswerid(12);
//a2.setAnswer("another Kumbh is organized in state of maharashtra dist nasik ");
//  a2.setQuestion_1(q1);
// 

Session session= factory.openSession();
Transaction tx = session.beginTransaction();

Question_1 q1= (Question_1)session.get(Question_1.class,201);
System.out.println(q1.getQuestion_id());
System.out.println(q1.getQuestion());
System.out.println("size of answer is:  "+q1.getAnswer_1().size());
//session.save(q1);
//session.save(a2);
//session.save(a1);

//Question_1 q1= (Question_1)session.get(Question_1.class, 201);
//System.out.println(q1.getQuestion());
//for(Answer_1 answer_1:q1.getAnswer_1())
//	System.out.println(answer_1.getAnswer());

	
tx.commit();
session.close();
factory.close();
		
	
	}

}
