package com.springcore.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cooler")
@Scope("prototype")
public class Cooler {
	
	public Cooler(Fan fan) {
		super();
		this.fan = fan;
	}

	@Value("voltas")
	private String name;
	@Value("15")
	private float maxSpeed;
	
	@Value("#{true}")
	private boolean isInverter;
	
	@Autowired
	private Fan fan;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setting cooler name");
		this.name = name;
	}

	

	public float getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(float maxSpeed) {
		System.out.println("setting max speed");
		this.maxSpeed = maxSpeed;
	}

	public boolean isInverter() {
		
		return isInverter;
	}

	public void setInverter(boolean isInverter) {
		System.out.println("setting isInverter");
		this.isInverter = isInverter;
	}

	public Fan getFan() {
		return fan;
	}

	public void setFan(Fan fan) {
		System.out.println("setting fan class");
		this.fan = fan;
	}

	@Override
	public String toString() {
		return "Cooler [name=" + name + ", maxSpeed=" + maxSpeed + ", isInverter=" + isInverter + ", fan=" + fan + "]";
	}
	
	
}
