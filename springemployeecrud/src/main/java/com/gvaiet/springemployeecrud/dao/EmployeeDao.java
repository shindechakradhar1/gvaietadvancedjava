package com.gvaiet.springemployeecrud.dao;

import java.util.List;

import com.gvaiet.springemployeecrud.entities.Employee;

public interface EmployeeDao {

	String addEmployee(Employee employee);
	
	List<Employee> getEmployees();
	
	String deleteEmployee(int id);
	
	Employee updateEmployee(int id);
	
}
