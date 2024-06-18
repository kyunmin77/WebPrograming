<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "util.Cookies" %>
<%
	Cookies cks = new Cookies(request);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 사용</title>
</head>
<body>
 name 쿠키 = <%= cks.getValue("name") %> <br>
 <% if(cks.exists("id")) { %>
 id 쿠키 = <%= cks.getValue("id") %> <br>
 <% } %>
</body>
</html>