package com.gvaiet.springdiautowired.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	private int rno;
	private String name;
	@Autowired
	private Address address;

	public Student() {}

	public Student(int rno, String name, Address address) {
		this.rno = rno;
		this.name = name;
		this.address = address;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
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
		return "Student [rno=" + rno + ", name=" + name + ", address=" + address + "]";
	}

}
