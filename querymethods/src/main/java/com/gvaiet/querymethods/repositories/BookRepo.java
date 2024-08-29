package com.gvaiet.querymethods.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gvaiet.querymethods.entities.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

	Book findBybName(String name);
	
	List<Book> findBybNameStartingWith(String name);
}
