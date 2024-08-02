package com.gvaiet.springdidemo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gvaiet.springdidemo.beans.Student;

public class App {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/gvaiet/springdidemo/config/applicationcontext.xml");
		
		Student student = (Student) context.getBean("student1");
		
		System.out.println(student);
	}
}
