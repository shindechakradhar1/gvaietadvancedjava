package com.gvaiet.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		
		HttpSession session = req.getSession();
		
		
		if(userName.equals("Abc") && password.equals("123")) {
			session.setAttribute("userName", userName);
			req.getRequestDispatcher("profile/profile.jsp").forward(req, resp);
			
		}
			
	}
}
