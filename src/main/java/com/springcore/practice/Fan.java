package com.springcore.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("fan")

public class Fan {
	
	@Value("big")
	private String fanSize;
	
	@Value("120hp")
	private String motorPower;
	
	public String getFanSize() {
		System.out.println("getting fanSize");
		return fanSize;
	}
	public void setFanSize(String fanSize) {
		System.out.println("setting fanSize");
		this.fanSize = fanSize;
	}
	public String getMotorPower() {
		System.out.println("getting motor");
		return motorPower;
	}
	public void setMotorPower(String motorPower) {
		System.out.println("setting moterPower");
		this.motorPower = motorPower;
	}
	@Override
	public String toString() {
		return "Fan [fanSize=" + fanSize + ", motorPower=" + motorPower + "]";
	}
	
	
}
