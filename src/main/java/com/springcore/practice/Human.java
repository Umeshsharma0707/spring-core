package com.springcore.practice;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Human {
	private String name;
	private int age;
	private Developer developer;
	public String getName() {
		System.out.println("setting human name");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Developer getDeveloper() {
		return developer;
	}
	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", developer=" + developer + "]";
	}
	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Human(String name, int age, Developer developer) {
		super();
		System.out.println("human constructor");
		this.name = name;
		this.age = age;
		this.developer = developer;
	}

	@PostConstruct
	public void init() {
		System.out.println("init method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method");
	}
	
	
	
}
