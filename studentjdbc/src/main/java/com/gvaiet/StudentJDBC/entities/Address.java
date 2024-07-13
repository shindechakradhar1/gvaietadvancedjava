package com.gvaiet.StudentJDBC.entities;

public class Address {
	private String landMark;
	private String area;
	private String pincode;
	private String city;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String landMark, String area, String pincode, String city) {
		super();
		this.landMark = landMark;
		this.area = area;
		this.pincode = pincode;
		this.city = city;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [landMark=" + landMark + ", area=" + area + ", pincode=" + pincode + ", city=" + city + "]";
	}

}
