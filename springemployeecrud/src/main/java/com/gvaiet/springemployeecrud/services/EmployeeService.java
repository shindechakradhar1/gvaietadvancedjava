package com.gvaiet.springemployeecrud.services;

import java.util.List;

import com.gvaiet.springemployeecrud.entities.Employee;

public interface EmployeeService {

	String addEmployee(Employee employee);
	
	List<Employee> getEmployees();
	
	String deleteEmployee(int id);
	
	Employee updateEmployee(int id);
}
