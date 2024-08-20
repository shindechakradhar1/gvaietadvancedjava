package com.gvaiet.springemployeecrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gvaiet.springemployeecrud.dao.EmployeeDao;
import com.gvaiet.springemployeecrud.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao; 
	
	@Override
	public String addEmployee(Employee employee) {
		return employeeDao.addEmployee(employee);
	}

	@Override
	public List<Employee> getEmployees() {
		
		return employeeDao.getEmployees();
	}

	@Override
	public String deleteEmployee(int id) {
		return employeeDao.deleteEmployee(id);
	}

	@Override
	public Employee updateEmployee(int id) {
		
		return employeeDao.updateEmployee(id);
	}

}
