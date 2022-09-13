package com.cg.springIOC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mobile {

	public static void main(String[] args) {
//		we should not touch source code
//		app should be configurable
		// TODO Auto-generated method stub
//	    vi a=new vi();
//	    a.calling();
//	    a.data();
//	    
//	    Jio a1=new Jio();
//	    a1.calling();
//	    a1.data();
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("confihuration loaded.........");
        vi v=(vi)a.getBean("vi");
        v.calling();
        v.data();
        
      
	}

}
