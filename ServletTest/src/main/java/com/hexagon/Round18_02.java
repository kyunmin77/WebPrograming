package com.hexagon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Round18_02 extends HttpServlet {

	public void init() { }
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = req.getParameter("ID");
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<html><body><div align='center'>");
		out.println(id + "님 반갑습니다.");
		out.println("</div></body></html>");
	}



	public void destroy() { }
}
