package com.gvaiet.springdidemo.beans;

public class Address {
	private String area;
	private String pincode;

	public Address() {}

	public Address(String area, String pincode) {
		this.area = area;
		this.pincode = pincode;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [area=" + area + ", pincode=" + pincode + "]";
	}

}
