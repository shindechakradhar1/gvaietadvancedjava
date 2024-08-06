package com.gvaiet.datahandeling.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DemoUser {

	@Id
	private String userName;
	private String password;
	private int age;

	public DemoUser() {}

	public DemoUser(String userName, String password, int age) {
		this.userName = userName;
		this.password = password;
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "DemoUser [userName=" + userName + ", password=" + password + ", age=" + age + "]";
	}

}
