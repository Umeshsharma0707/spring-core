package com.springcore.spel;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demo")
public class Demo {
	
	@Value("#{5+5}")
	private int x;
	@Value("#{10 + 5}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	
	@Value("#{T(java.lang.Math).E}")s
	private double e;
	
	
	
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + "]";
	}
	
	
}
