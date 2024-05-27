package com.hexagon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Round11_servlet
 */
@WebServlet("/second")  // ! url맵핑한 이름이 여기에 표시되어 있음 !  -- web.xml없이 실행됨!!!
public class Round11_servlet extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html;charset=utf-8"); //응답할 컨텐트의 타입을 설정 (text/html; <- MIME: text형식으로 해석하고 html문법을 이용한다.
		// 위에 지정한 타입에따라 해석방법이 결정된다.
		PrintWriter out = res.getWriter();  // res.getWriter(): 브라우저에 써라.
		out.println("<html>");
		out.println("<head><title>서블릿 예시!</head></title>");
		out.println("<body>");
		out.println("안녕서블릿!");
		out.println("</body>");
		out.println("</html>");
	}

}
