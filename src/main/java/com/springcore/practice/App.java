//package com.springcore.practice;
//
//
//import org.springframework.context.support.AbstractApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class App {
//	
//	public static void main(String[] args) {
//		
//		AbstractApplicationContext context =
//				new ClassPathXmlApplicationContext("com/springcore/practice/config.xml");
//		
//		
//		Human h1 = context.getBean("human", Human.class);
//		
//		System.out.println(h1);
//		
//		context.registerShutdownHook();
//		
//		
//		context.close();
//	}
//	
//}
