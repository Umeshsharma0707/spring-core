package com.springcore.auto.wire.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autoconfig.xml");
		
		
		Employee emp1 = context.getBean("emp1",Employee.class);
		
		System.out.println(emp1);
	}
}
