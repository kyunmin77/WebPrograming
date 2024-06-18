<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.net.URLDecoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 목록</title>
</head>
<body>
쿠키목록<br>
<%
	Cookie[] cks = request.getCookies();
	if(cks != null && cks.length > 0){
		for(int i=0;i<cks.length;i++){
%>
	<%= cks[i].getName() %> = <%= URLDecoder.decode(cks[i].getValue(),"utf-8") %><br>
<%
		}
	}else {
%>
쿠키가 존재하지 않습니다.
<%
	}
%>
</body>
</html>