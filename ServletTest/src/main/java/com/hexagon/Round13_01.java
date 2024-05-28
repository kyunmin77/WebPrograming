package com.hexagon;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Round13_01 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		PrintWriter out = res.getWriter();
		
		Enumeration names = req.getParameterNames();
		while(names.hasMoreElements()) {
			String name = (String)names.nextElement();
			String value =req.getParameter(name);
			out.println(name + " : " + value + "<br/>");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		
		Enumeration names = req.getParameterNames();
		while(names.hasMoreElements()) {
			String name = (String)names.nextElement();
			String value =req.getParameter(name);
			out.println(name + " : " + value + "<br/>");
		}
	}

}
