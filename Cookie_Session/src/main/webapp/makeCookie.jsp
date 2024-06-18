<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.net.URLEncoder" %>
<%
	Cookie ck = new Cookie("name", URLEncoder.encode("신건민","utf-8"));
	response.addCookie(ck);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 생성</title>
</head>
<body>
<%=ck.getName() %> 쿠기의 값 = "<%=ck.getValue() %>>"
</body>
</html>