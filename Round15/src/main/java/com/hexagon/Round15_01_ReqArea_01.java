package com.hexagon;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Round15_01_ReqArea_01 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String data1 = new String("java!");
		ArrayList<String> data2 = new ArrayList<String>();
		data2.add("C");
		data2.add("c++");
		
		req.setAttribute("data1", data1);
		req.setAttribute("data2", data2);
		
		ServletContext context = this.getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher("/Servlet01_02?data3=string&data4=ok");
		dispatcher.forward(req, res);
	}
	
}
