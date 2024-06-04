package com.hexagon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Round14_06_Seoul extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		
		String name = req.getParameter("name");
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String area = req.getParameter("area");
		
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("그러므로 당신의 이름이 " + name);
		out.println("이라는 말이고,<br/>");
		out.println("당신이 사용하려는 아이디가 " + id);
		out.println("라는 말인가?");
		out.println("</body></html>");
	}

}
