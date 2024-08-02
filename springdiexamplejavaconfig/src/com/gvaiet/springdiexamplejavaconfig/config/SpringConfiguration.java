package com.gvaiet.springdiexamplejavaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gvaiet.springdiexamplejavaconfig.beans.Address;
import com.gvaiet.springdiexamplejavaconfig.beans.Student;

@Configuration
public class SpringConfiguration {
	
	
	@Bean
	public Student student1() {
		Student student = new Student();
		student.setRollNo(1);
		student.setName("ABC");
		student.setAddress(address1());
		return student;
	}
	
	
	@Bean 
	public Address address1() {
		Address address  = new Address();
		address.setArea("Shelu");
		address.setPincode(410101);
		
		return address;
	}
}
