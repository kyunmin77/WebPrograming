package com.hexagon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Round15_04_ServletContext_02 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ServletContext context = this.getServletContext();
		String intro = (String)context.getAttribute("intro");
		
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
	
		out.println("<html><body>");
		out.println("서버의 인사말 = " + intro);
		out.println("</body></html>");
	}
	
}
