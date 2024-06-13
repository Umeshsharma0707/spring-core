package com.springcore.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student s = context.getBean("student", Student.class);
		
		System.out.println(s.hashCode());
		
		
		s.study();
		s.getBurger().display();
		context.close();
	}
}
