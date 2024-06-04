package com.hexagon;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Round14_05 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String method = req.getMethod(); // 요청매서드를 알아낸다
		if (method.equalsIgnoreCase("get")) { // 요청매서드(method)가 get이면 get파일로.
			res.sendRedirect("Round14_05_GET.html");
			return;
		} else if (method.equalsIgnoreCase("post")) {
			res.sendRedirect("Round14_05_POST.html");
			return;
		}
	}
}
