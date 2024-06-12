package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class JavaConfig {
	
	@Bean
	public Burger getBurger() {
		Burger burger = new Burger();
		return burger;
	}
	
	@Bean(name = {"student"})
	public Student getStudent() {
		Student student = new Student(getBurger());
		return student;
	}
	
	
}
