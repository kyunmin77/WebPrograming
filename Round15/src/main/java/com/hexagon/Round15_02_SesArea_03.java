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

public class Round15_02_SesArea_03 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String data1 = (String)req.getAttribute("data1");
		HttpSession session = req.getSession();
		String data2 = (String)session.getAttribute("data2");
		Calendar data3 = (Calendar)session.getAttribute("data3");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String data4 = format.format(data3.getTime());
		
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("data1 = " + data1 + "<br/>");
		out.println("data2 = " + data2 + "<br/>");
		out.println("data3 = " + data4 + "<br/><br/>");
		
		out.println("</body></html>");
	}
	
}
