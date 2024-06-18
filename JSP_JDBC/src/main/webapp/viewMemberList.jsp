<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록</title>
</head>
<body>

Member 테이블의 내용
<table width="100%" border='1'>
<tr>
	<td>이름</td><td>아이디</td><td>이메일</td>
</tr>
<%
// JDBC 드라이버 로딩
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	try{
		String jdbcDriver = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbUser = "system";
		String dbPass = "1234";
		
		String query = "select * from MEMBER order by MEMBERID";
	
		conn = DriverManager.getConnection(jdbcDriver,dbUser,dbPass);
		stmt = conn.createStatement();
		rs = stmt.executeQuery(query);
		
		while(rs.next()) {
 %>
			<tr>
				<td><%= rs.getString("NAME") %></td>
				<td><%= rs.getString("MEMBERID") %></td>
				<td><%= rs.getString("EMAIL") %></td>
			</tr>

<%
		}
	}catch(SQLException e) {
		out.print(e.getMessage());
		e.printStackTrace();
	}finally {
		if(rs != null) try { rs.close();}catch(SQLException e) {}
		if(stmt != null) try { stmt.close();}catch(SQLException e) {}
		if(conn != null) try { conn.close();}catch(SQLException e) {}
	}
%>

</table>

</body>
</html>