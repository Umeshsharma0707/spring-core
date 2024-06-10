package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Burger {
	private int price;
	
	public Burger() {
		super();
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Burger [price=" + price + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println**************************/"starting method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("ending method");
	}
	
}
