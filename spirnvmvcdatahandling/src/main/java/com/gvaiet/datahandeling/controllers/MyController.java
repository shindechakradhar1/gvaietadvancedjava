package com.gvaiet.datahandeling.controllers;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gvaiet.datahandeling.entities.DemoUser;

@Controller
public class MyController {

	
	@GetMapping("/reg")
	public String getReg() {
		return "register";
	}
	
//	@PostMapping("/registration")
//	public String register(HttpServletRequest req, Model model) {
//		String userName=req.getParameter("userName");
//		System.out.println(userName);
//		model.addAttribute("userName", userName);
//		return "success";
//	}
	
//	@PostMapping("/registration")
//	public String getRegister(@RequestParam("userName") String user, @RequestParam("password") String password, @RequestParam("age") int age) {
//		
//		System.out.println(user + ":" + password + ":" + age);
//		
//		return "success";
//	}
	
	@PostMapping("/registration")
	public ModelAndView getRegister(@ModelAttribute("demoUser") DemoUser user) {
//		System.out.println(user);
		
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml").buildSessionFactory();
		try(Session session=sessionFactory.openSession()){
			Transaction transaction=session.getTransaction();
			
			transaction.begin();
			session.save(user);
			transaction.commit();
		}
		
		
		
		ModelAndView view = new ModelAndView("success");
		view.addObject("msg", "Data Inserted successfully");
		return view;
	}
	
}

