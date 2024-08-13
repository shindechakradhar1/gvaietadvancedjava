package com.gvaiet.springmvccrud.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.gvaiet.springmvccrud.dao.StudentDao;
import com.gvaiet.springmvccrud.entities.Student;

public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentdao;
	
	@Override
	public String addStudent(Student student) {
		// calling dao layer
		return studentdao.addStudentRecord(student);
	}

	
}
