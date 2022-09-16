package com.cg.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) 
	{
		/*Student s = new Student();
		s.setStudentName("bhakti Adake");
		s.display();*/
		
		@SuppressWarnings("resource")
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("The file is executing.....");
		student s1 = c.getBean("s1",student.class);
		//Student s2 = c.getBean("s2",Student.class);
		s1.display();
		//s2.display();
	}
}
