package com.hexagon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Round15_04_ServletContext_01 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String intro = "안녕하세요 우시 서버에 오신것을 환영합니다.";
		
		ServletContext context = this.getServletContext();
		context.setAttribute("intro", intro);
		
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
	
		out.println("<html><body>");
		out.println("ServletContext 데이터 생성 완료!");
		out.println("</body></html>");
	}
	
}
