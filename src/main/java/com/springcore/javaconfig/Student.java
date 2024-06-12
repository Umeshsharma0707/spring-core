package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

import com.springcore.lifecycle.Samosa;


public class Student {
	
	private Burger burger;
	
	



	public Student(Burger burger) {
		super();
		this.burger = burger;
	}


	public Burger getBurger() {
		return burger;
	}



	public void setBurger(Burger burger) {
		this.burger = burger;
	}


	

	@Override
	public String toString() {
		return "Student [burger=" + burger + "]";
	}



	public void study() {
		System.out.println("student is studying");
	}
}
