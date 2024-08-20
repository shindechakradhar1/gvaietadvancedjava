package com.gvaiet.springemployeecrud.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
public class EAddress {

	@Id
	@Min(value = 1, message = "*Addres id Must be Greater Than 0")
	private int addressId;

	@Size(min = 5, max = 15, message = "*Area Should be 5-15 characters")
	private String area;

	private int pincode;

	@OneToOne
	private Employee employee;

	public EAddress() {
	}

	public EAddress(int addressId, String area, int pincode) {
		this.addressId = addressId;
		this.area = area;
		this.pincode = pincode;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
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
		return "Address [addressId=" + addressId + ", area=" + area + ", pincode=" + pincode + "]";
	}

}
