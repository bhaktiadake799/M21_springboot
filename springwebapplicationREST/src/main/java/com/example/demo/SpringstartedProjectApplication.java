package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication

public class SpringstartedProjectApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringstartedProjectApplication.class, args);
//		String str="welcome to spring REST";
//		System.out.println(str);
//		Employee e=new Employee();
//		e.print();
        ConfigurableApplicationContext context=SpringApplication.run(SpringstartedProjectApplication.class, args);
//		Employee e=context.getBean(Employee.class);
//		e.print();
        hellocontroller h=context.getBean(hellocontroller.class);
    	System.out.println(h.display());
		
				
	}

}
