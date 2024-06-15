package com.springcore.practice;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("com/springcore/practice/config.xml");
		
		
		Human h1 = context.getBean("h1", Human.class);
		Human h2 = context.getBean("h1", Human.class);
		System.out.println(h1);
		
		context.registerShutdownHook();
		
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		context.close();
	}
	
}
