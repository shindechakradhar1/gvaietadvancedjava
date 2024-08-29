package com.gvaiet.springbootcrud.controllers;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.gvaiet.springbootcrud.entities.Address;
import com.gvaiet.springbootcrud.entities.Employee;
import com.gvaiet.springbootcrud.repositories.EmployeeRepository;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/")
	public String getHome() {
		
		Address address = new Address();
		address.setId(1);
		address.setArea("Shelu");
		address.setPincode("410101");
		
		Employee employee = new Employee(1,"ABC",LocalDate.parse("2010-08-29"), address);
		
//		address.setEmployee(employee);
		// create
//		employeeRepository.save(employee);
		
		// read
//		System.out.println(employeeRepository.getReferenceById(2));
//		Optional<Employee> employeeOpt=employeeRepository.findById(2);
//		if(employeeOpt.isPresent())
//			System.out.println(employeeOpt.get());
//		else
//			System.out.println("Record Not found..");
		
		// update
		
//		employee = employeeRepository.getReferenceById(1);
//		employee.getAddress();
//		
//		
//		employeeRepository.save(employee);
		
		// delete
		
//		employeeRepository.deleteById(1);
		
		return "home";
	}
}
