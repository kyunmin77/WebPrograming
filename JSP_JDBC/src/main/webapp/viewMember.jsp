<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>

<%
	String memberID = request.getParameter("memberID");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
</head>
<body>
<%
	Class.forName("oracle.jdbc.driver.OracleDriver");

	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	try{
		String jdbcDriver = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbUser = "system";
		String dbPass = "1234";
		
		String query = "select * from MEMBER where MEMBERID = '" + memberID + "'";
	
		conn = DriverManager.getConnection(jdbcDriver,dbUser,dbPass);
		stmt = conn.createStatement();
		rs = stmt.executeQuery(query);
		if(rs.next()){
%>
<table border='1'>
	<tr>
		<td>아이디</td><td><%= memberID %></td>
	</tr>
	<tr>
	<td>암호</td><td><%= rs.getString("PASSWORD") %></td>
	</tr>
	<tr>
	<td>이름</td><td><%= rs.getString("NAME") %></td>
	</tr>
	<tr>
	<td>이메일</td><td><%= rs.getString("EMAIL") %></td>
	</tr>
</table>

<%
		}else{
%>
<%= memberID %>에 해당하는 정보가 존재하지 않습니다.
<%
		}
	}catch(SQLException e){
%>
에러발생: <%= e.getMessage() %>
<%
	}finally{
		if(rs != null) try{ rs.close(); }catch(SQLException e){}
		if(stmt != null) try{ stmt.close(); }catch(SQLException e){}
		if(conn != null) try{ conn.close(); }catch(SQLException e){}
	}
%>
</body>
</html>