package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new  ClassPathXmlApplicationContext("com/springcore/ci/ci-config.xml");
		
		Person p1 = (Person) context.getBean("person");
		
		System.out.println(p1);
		
		Person p2 = (Person) context.getBean("person2");
		
		System.out.println(p2);
		
	}
	
}
