<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = "", tel="";
	
	Connection conn = null;
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","1234");
		String query = "SELECT * FROM USER_TB WHERE ID = ? AND PW = ?";
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()){
			name = rs.getString("name");
			tel = rs.getString("tel");
		}else throw new Exception();
		rs.close();
		pstmt.close();
	}catch(Exception e){
		response.sendRedirect("Round21_02_Page_Register.jsp");
		return;
	}finally{
		if(conn != null) conn.close();
		conn= null;
	}
	
	session.setAttribute("name", name);
	session.setAttribute("id", id);
	session.setAttribute("tel", tel);
	pageContext.forward("Round21_02_Page_Main.jsp");
%>
