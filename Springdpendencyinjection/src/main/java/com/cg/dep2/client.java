package com.cg.dep2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		student1 s = c.getBean("s3",student1.class);
		s.cheating();
		
		anotherstudent a = c.getBean("s4",anotherstudent.class);
		a.startcheating();
	}
}


