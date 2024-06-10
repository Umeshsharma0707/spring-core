package com.springcore.auto.wire;

public class Employee {
	private String name;
	private Address address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
		System.out.println("inside constructor");
	}



	public Employee(Address address) {
		super();
		this.address = address;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}
	
	
}
