package com.hexagon;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Round16_01 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String school = req.getParameter("school");
		String filename = req.getParameter("filename");
		
		ServletContext context = this.getServletContext();
		String path = context.getRealPath("/personInfo");
		File dir = new File(path);
		if(!dir.exists()) dir.mkdir();
		File file = new File(dir,filename);
		PrintWriter f_out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		
		f_out.println("name : " + name);
		f_out.println("age : " + age);
		f_out.println("school : " + school);
		f_out.close();
		
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.println("<html><body><center><h3>");
		out.println(path + File.separator + filename + "의 파일에 정보가 저장되었습니다.");
		out.println("</h3></center></body></html>");
	}

}
