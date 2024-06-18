<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "util.Cookies" %>

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	if(id.equals(pw)){ // 성공한것으로 판단
		response.addCookie(Cookies.createCookie("AUTH", id, "/", -1));
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
</head>
<body>
	로그인에 성공했습니다.
</body>
</html>
<%
	} else { // 로그인 실패시
%>
<script>
	alert("로그인에 실패하였습니다.");
	history.go(-1);
</script>	
<%
	}
%>
	
	