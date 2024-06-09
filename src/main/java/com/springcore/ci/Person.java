package com.springcore.ci;

public class Person {
	private String name;
	private Job job;
	public Person() {
		super();
		
	}
	public Person(String name, Job job) {
		super();
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
	
	
}
