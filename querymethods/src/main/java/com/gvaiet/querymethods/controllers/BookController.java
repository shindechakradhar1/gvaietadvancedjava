package com.gvaiet.querymethods.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.gvaiet.querymethods.entities.Book;
import com.gvaiet.querymethods.repositories.BookRepo;

@Controller
public class BookController {

	@Autowired
	private BookRepo bookRepo;
	
	@GetMapping("/")
	public String getHome(Model model) {
//		model.addAttribute("msg", "Hello");
//		Book book = new Book(3,"BBC");
		
//		bookRepo.save(book);
//		bookRepo.findById(1);
//		findAll
//		delete
		
//		model.addAttribute("book1", bookRepo.findBybName("ABC"));
		model.addAttribute("bookList", bookRepo.findBybNameStartingWith("B"))
;		return "home";
	}
}
