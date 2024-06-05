package com.hexagon;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Round15_03_Cookie_01 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub

		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
	
		out.println("<html>");
		out.println("<head><title>Log In!</title></head>");
		out.println("<body>");
		out.println("<div align='center'>");
		
		out.println("<form method='post' action='Servlet03_02'>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<td align='right' wigth='30%'>아이디 : </td>");
		out.println("<td align='center'><input type='text' name='id' size='10'/></td>");
		out.println("<td align='center' rowspan='2'><input type='submit' value='로그인'/></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td align='right'>비번 : </td>");
		out.println("<td div align='center'><input type='password' name='pw' size='9'/></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td align='left' colspan='3'><input type='checkbox' name ='id_rem' value='chk'>아이디 기억하기</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("</div>");
		out.println("</body></html>");
	}
	
}
