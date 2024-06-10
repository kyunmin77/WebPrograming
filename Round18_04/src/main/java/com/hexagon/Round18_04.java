package com.hexagon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Round18_04 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<html><body><div align='center'>");
		out.println("<form method='post'>");
		out.println("<input type='submit' value='Context 값 할당하기'/>");
		out.println("</form>");
		out.println("</div></body></html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ServletContext context = this.getServletContext();
		context.setAttribute("my_name", "신건민");  	//(name, value)
		context.setAttribute("my_name", "건민");		// name이 같으면 내용을 변경 == replaced
		context.removeAttribute("my_name");
		
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<html><body><div align='center'>");
		out.println("Context 값 추가,변경,삭제 성공!");
		out.println("</div></body></html>");
	}

}
