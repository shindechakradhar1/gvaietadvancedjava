package com.gvaiet.springmvccrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.gvaiet.springmvccrud.entities.Student;
import com.gvaiet.springmvccrud.services.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/add")
	public String gotoStudent() {
		return "addstudent";
	}
	
	@PostMapping("/addstudent")
	public String addStudent(@ModelAttribute("student") Student student, Model model) {
//		System.out.println(student);
//		String msg=
//		System.out.println(msg);
		model.addAttribute("message", studentService.addStudent(student));
		return "success";
	}
	
}
