package com.gvaiet.beans;

public class Student {
	private int rollNo;
	private String name;
	private String email;
	
	public Student() {}
	
	public Student(int rollNo, String name, String email) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "rollNo:" + rollNo + ",\nname:" + name + ",\nemail:" + email;
	}
}
