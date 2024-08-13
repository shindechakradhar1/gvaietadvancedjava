package com.gvaiet.springmvccrud.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gvaiet.springmvccrud.entities.Student;

public class StudentDaoImpl implements StudentDao{

	@Override
	public String addStudentRecord(Student student) {
		try(Session session = getSessionFactory().openSession()){
			Transaction transaction = session.getTransaction();
			transaction.begin();
			session.save(student);
			transaction.commit();
		}catch (Exception e) {
			return e.getMessage();
		}
		
		return "Student Record Added Successfully";
	}

	
	private SessionFactory getSessionFactory() {
		return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
}
