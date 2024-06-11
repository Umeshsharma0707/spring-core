package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/springcore/stereotype/stereotype-config.xml");		
		
		Student s = context.getBean("student", Student.class);
		
		System.out.println(s.hashCode());
		
		Student s1 = context.getBean("student", Student.class);
		
		System.out.println(s1.hashCode());
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Teacher t1 = context.getBean("teacher", Teacher.class);
		Teacher t2 = context.getBean("teacher",Teacher.class);
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}
}
