package com.gvaiet.StudentJDBC;

import java.util.List;

import com.gvaiet.StudentJDBC.entities.Student;
import com.gvaiet.StudentJDBC.services.StudentService;

public class App 
{
    public static void main( String[] args )
    {
        StudentService service = new StudentService();
//        Address address = new Address("Birla College", "Kalyan West", "431110", "Kalyan");
//        Student student = new Student(3,"Taha","CSE",address);
        
//        System.out.println(
//        		service.insertStudent(student)
//        		);
//        Student studentRecord=service.selectStudent(2);
//        if(studentRecord==null)
//        	System.out.println("Record Not Found..");
//        else
//        	System.out.println(studentRecord);
        
//        List<Student> studentList=service.selectAllStudent();
//        studentList.forEach(System.out::println);
        System.out.println(service.deleteStudent(2));
    }
}
