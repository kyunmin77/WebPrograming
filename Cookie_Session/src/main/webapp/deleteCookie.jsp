<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.net.URLEncoder" %>

<%
	Cookie[] cks = request.getCookies();
	if(cks != null && cks.length>0){
		for (int i=0;i<cks.length;i++){
			if(cks[i].getName().equals("name")){
				Cookie ck = new Cookie("name",""); // 이름이 같은 쿠키를 만들어 내용을 공백으로 덮어쓰기
				ck.setMaxAge(0);
				response.addCookie(ck);
			}
		}
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 삭제</title>
</head>
<body>
name 쿠키를 삭제합니다.
</body>
</html>