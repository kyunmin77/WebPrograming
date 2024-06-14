<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>

<%@ page isErrorPage = "true" %>
<!-- 현재 페이지는 에러를 출력하는 페이지
true일 경우 exception 디폴트객체가 생겨남 -->

<%
	PrintWriter out2 = response.getWriter();
	out2.println("<div align='center'>");
	out2.println("<h2>에러페이지!</h2>");
	out2.println("<hr width='80%'/>");
	out2.println("Error Message : " + exception.getMessage());
	out2.println("<hr width='80%'/>");
	out2.println("</div><br/>");
	
	exception.printStackTrace(out2);
%>