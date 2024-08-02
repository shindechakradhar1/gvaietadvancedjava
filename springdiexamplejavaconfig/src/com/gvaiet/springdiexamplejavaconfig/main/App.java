package com.gvaiet.springdiexamplejavaconfig.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gvaiet.springdiexamplejavaconfig.beans.Address;
import com.gvaiet.springdiexamplejavaconfig.beans.Student;
import com.gvaiet.springdiexamplejavaconfig.config.SpringConfiguration;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		Student student=(Student)context.getBean("student1");
		Address address=(Address)context.getBean("address1");
		
		System.out.println(student);
		System.out.println(address);
	}
}
