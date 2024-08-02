package com.gvaiet.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gvaiet.beans.Student;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/gvaiet/config/appctx.xml");
		
//		Student student1 = new Student();
		
		Student student4= (Student)context.getBean("student4");
		Student std1= (Student)context.getBean("student1");
		
		System.out.println(student4);
		System.out.println(std1);
	}
}
