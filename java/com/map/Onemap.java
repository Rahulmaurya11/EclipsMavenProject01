package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Onemap {
	
	public static void main (String args[]) {
		
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
	
		// creating object of question class 
		
		Question q1= new Question();
		q1.setQuestionID(2);
		q1.setQuestion("what is a python");
		
		
		
		
		// create object of answer class
		Answer ans1 = new Answer();
		ans1.setAnswerId(102);
		ans1.setAnswer("python is programming langauge");
		ans1.setQuestion(q1);
		
		q1.setAnswer(ans1);
		
		
		Session session  = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(q1);
		session.save(ans1);
		
		
		tx.commit();
		session.close();
		factory.close();
	}

}
