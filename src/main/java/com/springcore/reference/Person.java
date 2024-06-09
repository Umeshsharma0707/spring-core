package com.springcore.reference;

public class Person {
	private String name;
	private long phone;
	private Address address;
	public Person() {
		super();
	}
	public Person(String name, long phone, Address address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
	
}
