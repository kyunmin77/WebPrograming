<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.net.URLEncoder" %>

<%
	Cookie[] cks = request.getCookies();
	if(cks != null && cks.length>0){
		for(int i=0;i<cks.length;i++){
			if(cks[i].getName().equals("name")){
				Cookie ck = new Cookie("name",URLEncoder.encode("JSP프로그래밍","utf-8"));
				response.addCookie(ck);
			}
		}
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>값 변경</title>
</head>
<body>
name 쿠키의 값을 변경합니다.
</body>
</html>