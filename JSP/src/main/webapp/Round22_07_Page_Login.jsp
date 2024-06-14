<%@ page language="java" %>
<%@ page info= "Include 테스트" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@ page buffer="none"%>
<%@ page autoFlush="true"%>
<%@ page isThreadSafe="true"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html" charset="UTF-8">
<title>Login Page!</title>
</head>
<body>
	<table width='700' border='1'>
		<tr height='100'>
			<td colspan='2' align="center">
			<%@ include file="Round22_07_Page_Login_Top.jsp" %>
			</td>
		</tr>
		<tr height='300'>
			<td width='230' valign='top'>
			<%@ include file="Round22_07_Page_Login_Left.jsp" %>
			</td>
			<td width='500' valign='top'>
				<div align="center">
					<h3>메인 페이지입니다!</h3>
					<img src='./images/pnts.png' width='480' height='270'/>
				</div>
			</td>
		</tr>
		<tr hright='80'>
			<td colspan='20' align="center" bgcolor="#cccccc">
			<%@ include file="Round22_07_Page_Login_Bottom.jsp" %>
			</td>
		</tr>
	</table>
</body>
</html>