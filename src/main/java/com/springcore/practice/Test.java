package com.springcore.practice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		/*
		 * AbstractApplicationContext context = new
		 * ClassPathXmlApplicationContext("com/springcore/practice/coolerfan.xml");
		 */
		
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(com.springcore.practice.JavaConfig.class);
		
		Cooler c = context.getBean("cooler",Cooler.class);
		System.out.println(c.hashCode());
		System.out.println(c);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Cooler c1 = context.getBean("cooler",Cooler.class);
		System.out.println(c1.hashCode());
	}
}
