package com.gvaiet.springdidemo.beans;

public class Student {

	private int rno;
	private String name;
	private Address adress;

	public Student() {}

	public Student(int rno, String name, Address adress) {
		this.rno = rno;
		this.name = name;
		this.adress = adress;
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

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", adress=" + adress + "]";
	}

}
