package com.hexagon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Round14_06_Teagu extends HttpServlet {

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
		out.println("그카니깐 니 이름이 " + name);
		out.println("이라는 말이고,<br/>");
		out.println("당신이 사용할라 카는 아이디가 " + id);
		out.println("라는 말이재?");
		out.println("</body></html>");
	}

}
