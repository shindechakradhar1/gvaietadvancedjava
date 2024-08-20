package com.gvaiet.springemployeecrud.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gvaiet.springemployeecrud.entities.Employee;
import com.gvaiet.springemployeecrud.services.EmployeeService;
import com.gvaiet.springemployeecrud.services.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	private LocalValidatorFactoryBean validator;
	
	@Autowired
	EmployeeService employeeService; 
	
	@GetMapping("/add")
	public String addEmployee(Model model) {
		model.addAttribute("employee", new Employee());
		return "registration";
	}
	
	@PostMapping("/reg")
	public String registration(@Valid @ModelAttribute("employee") Employee employee, BindingResult result, Model model) {
		System.out.println(employee);
		validator.validate(employee, result);
		if(result.hasErrors()) {
			System.out.println(result);
			return "registration";
		}
		
		
		String msg=employeeService.addEmployee(employee);
		model.addAttribute("msg", msg);
		return "success";
	}
	
	@GetMapping("/employees")
	public String getEmployeeList(Model model) {
		
		List<Employee> employeeList=employeeService.getEmployees();
		model.addAttribute("employeeList", employeeList);
		return "employees";
	}
	
	@GetMapping("/update")
	public String updateEmployee(@RequestParam("id") int id, Model model) {
		Employee employee = employeeService.updateEmployee(id);
		model.addAttribute("employee", employee);
		return "registration";
	}
	
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("id") int id, Model model) {
		String msg=employeeService.deleteEmployee(id);
		model.addAttribute("msg", msg);
		return "success";
	}
	
}
