package com.springcore.reference;

public class Address {
	private int houseNo;
	private String societyName;
	private String city;
	private int pincode;
	public Address(int houseNo, String societyName, String city, int pincode) {
		super();
		this.houseNo = houseNo;
		this.societyName = societyName;
		this.city = city;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getSocietyName() {
		return societyName;
	}
	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", societyName=" + societyName + ", city=" + city + ", pincode="
				+ pincode + "]";
	}
	
	
}
