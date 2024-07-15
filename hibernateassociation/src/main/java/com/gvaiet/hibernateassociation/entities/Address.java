package com.gvaiet.hibernateassociation.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Address {

	@Id
	@Column(name = "address_id")
	private int addressId;

	private String area;

	@Column(name = "land_mark")
	private String landMark;

	private String city;

	@Column(name = "pin_code")
	private int pinCode;

	@OneToOne
	@JoinColumn(name="s_id")
	private Student student;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addressId, String area, String landMark, String city, int pinCode, Student student) {
		super();
		this.addressId = addressId;
		this.area = area;
		this.landMark = landMark;
		this.city = city;
		this.pinCode = pinCode;
		this.student = student;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", area=" + area + ", landMark=" + landMark + ", city=" + city
				+ ", pinCode=" + pinCode + "]";
	}

}
