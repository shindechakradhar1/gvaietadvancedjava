package com.gvaiet.springbootcrud.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {

	@Id
	private int id;
	private String area;
	private String pincode;
	@OneToOne
	private Employee employee;

	public Address() {}

	public Address(int id, String area, String pincode, Employee employee) {
		this.id = id;
		this.area = area;
		this.pincode = pincode;
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", area=" + area + ", pincode=" + pincode + "]";
	}

}
