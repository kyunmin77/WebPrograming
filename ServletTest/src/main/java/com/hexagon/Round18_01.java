package com.hexagon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Round18_01 extends HttpServlet {

	public void init() { }
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		String tel = req.getParameter("tel");
		String addr = req.getParameter("addr");
		
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<html><head>");
		out.println("<style type='text/css'>");
		out.println(".n_border {border:none}");
		out.println("</style></hrad><body><div align='center'>");
		out.println("전송된 이름 = ");
		out.println("<input type='text' class='n_border' value ='" + name + "'/><br/>");
		out.println("전송된 전호 = ");
		out.println("<input type='text' class='n_border' value ='" + tel + "'/><br/>");
		out.println("전송된 주소 = ");
		out.println("<input type='text' class='n_border' value ='" + addr + "'/><br/>");
		out.println("</div></body></html>");
	}
	public void destroy() { }
}
