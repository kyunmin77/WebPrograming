package com.hexagon;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Round16_05 extends HttpServlet {

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
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
		} catch (Exception e) {
		}
		Connection con = null;
		PreparedStatement pstmt = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "system";
		String pw = "1234";

		String query = "insert into Round16_Table_02 values(Round16_seq.nextval,?,?,?)";
		try {
			con = DriverManager.getConnection(url, id, pw);
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
