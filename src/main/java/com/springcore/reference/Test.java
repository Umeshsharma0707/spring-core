package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/reference/ref-config.xml");
		
		Person p1 = (Person) context.getBean("Person");
		Person p2 = (Person) context.getBean("Person");
		
		System.out.println("name : " + p1.getName());
		System.out.println("city name : " + p1.getAddress().getCity());
		
		Address a1 = (Address) context.getBean("refAddress");
		
		a1.setCity("Rajkot");
		
		System.out.println(p2.getAddress().getCity());
		
	/*	A a1 = (A) context.getBean("aRef");
		
		System.out.println(a1);
		
		System.out.println(a1.getObj().getY());
		
		System.out.println("x + y : " + (a1.getX() + a1.getObj().getY()));
		*/
	}
}
