package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		 AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle-config.xml");
		 context.registerShutdownHook();
			/*
			 * Samosa s1 = (Samosa) context.getBean("samosa");
			 * 
			 * System.out.println(s1);
			 * 
			 * 
			 * System.out.println(
			 * "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			 * 
			 * Pepsi p = (Pepsi)context.getBean("pepsi"); System.out.println(p);
			 */
		 
		 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 
		 Burger b = (Burger)context.getBean("burger");
		 System.out.println(b);
	}
}
