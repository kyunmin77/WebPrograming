package com.hexagon;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class Round16_06 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String subject = req.getParameter("subject");
		String author = req.getParameter("author");
		String contents = req.getParameter("contents");
	
		res.setContentType("text/html;charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<html><body><center><h3>");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		String query = "insert into Round16_Table_02 values(Round16_seq.nextval,?,?,?)";
		try {
			Context context = new InitialContext();
			DataSource source = (DataSource)context.lookup("java:comp/env/jdbc/myconn");
			con = source.getConnection();
		}catch(Exception e) {}
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, subject);
			pstmt.setString(2, author);
			pstmt.setString(3, contents);
			int resp = pstmt.executeUpdate();

			if (resp > 0)
				out.println("Success save!");
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			out.println("SQL Process Error : " + e.getMessage());
		}
		out.println("</h3></center></body</html>");
	}

}
