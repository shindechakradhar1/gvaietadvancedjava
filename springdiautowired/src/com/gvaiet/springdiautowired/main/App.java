package com.gvaiet.springdiautowired.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gvaiet.springdiautowired.bean.Student;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/gvaiet/springdiautowired/config/applicationcontext.xml");
		
		Student student = (Student) ctx.getBean("student1");
		
		System.out.println(student);
	}
}
