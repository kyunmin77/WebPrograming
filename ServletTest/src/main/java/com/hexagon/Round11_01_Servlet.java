package com.hexagon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Round11_01_Servlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// service() 요청을 받을때 실행됨
		res.setContentType("text/html;charset=utf-8"); // 응답할 컨텐트의 타입을 설정 (text/html; <- MIME: text형식으로 해석하고 html문법을
														// 이용한다.
		// 위에 지정한 타입에따라 해석방법이 결정된다.
		PrintWriter out = res.getWriter(); // res.getWriter(): 브라우저에 써라.
		out.println("<html>");
		out.println("<head><title>서블릿 예시!</head></title>");
		out.println("<body>");
		out.println("안녕서블릿!");
		out.println("</body>");
		out.println("</html>");
	}

}
