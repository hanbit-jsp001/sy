package com.hanbit.jsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//resp.getOutputStream().println("Welcome Service");
		resp.getOutputStream().println("Welcome " + req.getMethod());
		resp.flushBuffer();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getOutputStream().println("Welcome Get");
		resp.flushBuffer();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.getOutputStream().println("Welcome Post");
		resp.flushBuffer();
	}
}
