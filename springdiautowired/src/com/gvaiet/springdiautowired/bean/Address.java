package com.gvaiet.springdiautowired.bean;

public class Address {

	private String area;
	private int pincode;

	public Address() {}

	public Address(String area, int pincode) {
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
