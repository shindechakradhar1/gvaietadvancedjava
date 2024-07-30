package com.gvaiet.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
		System.out.println();
		
		
		// Response back to Browser(Client)
		PrintWriter out = resp.getWriter();
		
		out.print("Hello Servlet doGet() Method");
		
	}
}
