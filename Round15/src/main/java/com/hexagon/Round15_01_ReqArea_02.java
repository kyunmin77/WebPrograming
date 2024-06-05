package com.hexagon;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Round15_01_ReqArea_02 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String data1 = (String)req.getAttribute("data1");
		ArrayList data2 = (ArrayList)req.getAttribute("data2");	//data1,2에 저장된 값을 추출
		String data3 = req.getParameter("data3");
		String data4 = req.getParameter("data4");	// 질의를 통해 프로토콜로 넘어온 (String)data3,4를 추출
		
		res.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("data1 = " + data1 + "<br/>");
		out.println("data2 = ");
		
		for(int i=0;i<data2.size(); ++i) {
			out.print(data2.get(i) + " ");
		}
		
		out.println("<br/>");
		out.println("data3 = " + data3 + "<br/>");
		out.println("data4 = " + data4 + "<br/>");
		out.println("</body></html>");
	}
	
}
