package com.gvaiet.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		
		resp.setContentType("text/HTML");
		
		PrintWriter out = resp.getWriter();
		
		out.print("Login Servlet");
		
		if(userName.equals("Abc") && password.equals("123")) {
			// profile
			req.setAttribute("userName1", userName);
			req.setAttribute("password1", password);
			RequestDispatcher dispatcher = req.getRequestDispatcher("login/profile.jsp");
			dispatcher.include(req, resp);
			
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("login/error.jsp"); 
			dispatcher.include(req, resp);
		}
		
	}
}
