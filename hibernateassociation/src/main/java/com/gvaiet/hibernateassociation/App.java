package com.gvaiet.hibernateassociation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gvaiet.hibernateassociation.entities.Address;
import com.gvaiet.hibernateassociation.entities.Student;
import com.gvaiet.hibernateassociation.entities.Subject;
import com.gvaiet.hibernateassociation.entities.Teacher;

public class App {
    public static void main( String[] args ){
    	// for hibernate configuration
    	Configuration config = new Configuration();
    	// for xml base configuration
        config.configure("hibernate.cfg.xml");
        
        Address address1 = new Address();
        address1.setAddressId(1);
        address1.setArea("Shelu");
        address1.setLandMark("GVAIET");
        address1.setCity("Karjat");
        address1.setPinCode(410101);
        
        Teacher teacher1 = new Teacher();
        teacher1.setTeacherId(101);
        teacher1.setTeacherName("Rahul");
        Teacher teacher2 = new Teacher();
        teacher2.setTeacherId(102);
        teacher2.setTeacherName("Jatin");
        
        List<Teacher> teacherList = new ArrayList<>();
        
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        
        List<Subject> subjectList = new ArrayList<>();        		
        
        subjectList.add(new Subject(1,"AI", teacherList));
        subjectList.add(new Subject(2,"SMA",teacherList));
        subjectList.add(new Subject(3,"DLCA",teacherList));
        
        
        
        
        Student student1 = new Student(1,"ABC", address1, subjectList);
        
        address1.setStudent(student1);
        
        SessionFactory sFactory = config.buildSessionFactory();
        Session session = sFactory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
//        session.save(teacher1);
//        session.save(teacher2);
        session.save(student1);
        
//        session.save(address1);
        
        Student student2=session.get(Student.class, 1);
        
//        System.out.println(student2);
        
        System.out.println("Name: " + student2.getStudentName());
        System.out.println("Address: ");
        System.out.println(" area:"+ student2.getAddress().getArea());
        System.out.println(" landmark:"+ student2.getAddress().getLandMark());
        System.out.println(" city:"+ student2.getAddress().getCity());
        System.out.println(" pincode:"+ student2.getAddress().getPinCode());
        System.out.println("Subjects : ");
//      fetch type: Lazy / Eager
//        for(Subject subject:student2.getSubjectList())
//        	System.out.println(subject.getSubjectName());
        System.out.println(student2.getSubjectList().size());
        transaction.commit();
        session.close();
        sFactory.close();
    }
}
