package com.hexagon;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Round14_06 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		
		String area = req.getParameter("area");
		ServletContext context = this.getServletContext();
		RequestDispatcher dispatcher = null;
		
		if(area == null) {
			res.sendError(512, "라디오버튼 체크 오류!!!");
			return;
		}
		else if(area.equals("서울")) {
			dispatcher = context.getRequestDispatcher("/Servlet06_Seoul");
		}
		else if(area.equals("대구")) {
			dispatcher = context.getRequestDispatcher("/Servlet06_Teagu");
		}
		dispatcher.forward(req, res);
	}

}
