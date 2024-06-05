package com.hexagon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Round15_03_Cookie_02 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub

		res.setCharacterEncoding("UTF-8");
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String id_rem = req.getParameter("id_rem");
		
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.println("<html><body><div align='center'><h2>");
		out.println(id + "(" + pw + ")님 로그인 성공!");
		out.println("</h2></div></body></html>");
		
		if(id_rem !=null && id_rem.equals("chk")) {
			Cookie id_cookie = new Cookie("id",java.net.URLEncoder.encode(id, "UTF-8"));
			
			id_cookie.setComment("아이디저장");
			id_cookie.setPath("/");
			id_cookie.setMaxAge(60*60*24*365);
			res.addCookie(id_cookie);
		}
	}
	
}
