package com.gvaiet.springdiexamplejavaconfig.beans;

public class Address {

	private String area;
	private int pincode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String area, int pincode) {
		super();
		this.area = area;
		this.pincode = pincode;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [area=" + area + ", pincode=" + pincode + "]";
	}

}
