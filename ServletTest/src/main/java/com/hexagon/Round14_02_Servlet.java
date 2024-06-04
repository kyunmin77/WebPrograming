package com.hexagon;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Round14_02_Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		String[] skils = req.getParameterValues("skil");
		
		Enumeration enu = req.getHeaderNames();
		Vector names = new Vector();
		Vector values = new Vector();
		while(enu.hasMoreElements()) {
			String header_name = (String)enu.nextElement();
			String header_value = req.getHeader(header_name);
			
			names.add(header_name);
			values.add(header_value);
		}
		
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("name : " + name + "<br/>");
		out.println("skil : ");
		for(int i =0; i<skils.length;i++) {
			out.print(skils[i] + " ");
		}
		out.println("<br/><br/><br/><br/>");
		out.println("@ 전달받은 헤더 정보들 @ <br/>");
		
		for(int i =0; i<names.size();i++) {
			String header_name = (String)(names.elementAt(i));
			String header_value = (String)(values.elementAt(i));
			out.println(header_name + " ");
			out.println(header_value + " ");
		}
		
		out.println("</body></html>");
		out.close();
	}

}
