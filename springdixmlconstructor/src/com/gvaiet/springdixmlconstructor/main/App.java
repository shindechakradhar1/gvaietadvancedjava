package com.gvaiet.springdixmlconstructor.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gvaiet.springdixmlconstructor.beans.Student;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext("com/gvaiet/springdixmlconstructor/config/applicationcontext.xml");
		
		Student student = (Student)ctx.getBean("student1");
		
		System.out.println(student);
	}
}
