package com.springcore.spel;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/springcore/spel/spel-config.xml");
		
		Demo d = context.getBean("demo", Demo.class);
		
		System.out.println(d);
		
		SpelExpressionParser temp = new SpelExpressionParser();
		
		org.springframework.expression.Expression expression = temp.parseExpression("5+5");
		System.out.println(expression.getValue());
		
	
	}
	
}
