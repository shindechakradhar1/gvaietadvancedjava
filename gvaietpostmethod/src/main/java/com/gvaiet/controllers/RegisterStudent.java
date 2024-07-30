package com.gvaiet.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/student/reg")
public class RegisterStudent extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		int rollNo = Integer.parseInt(req.getParameter("rollNo"));
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		
		out.print("<h1>hello</h1>");
		out.print("<h1>Roll No: "+rollNo+"</h1>");
		out.print("<h1>Name: "+name+"</h1>");
		out.print("<h1>age: "+age+"</h1>");
	}
}
