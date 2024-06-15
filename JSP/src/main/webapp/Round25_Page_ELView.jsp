<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>

<%!
 public class Inner {
	private String data;
	public void setData(String data) { this.data = data;}
	public String getData() { return this.data;}
}
%>

<%
	Inner inner = new Inner();
	inner.setData("신건민");
	request.setAttribute("inner", inner);
	
	request.setAttribute("num1", "100");
	request.setAttribute("num2", "30");
	request.setAttribute("bool", "false");
	request.setAttribute("data", "");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL 연산자</title>
</head>
<body>
	<h3>EL 연산 사용!</h3>
	inner.data : ${requestScope.inner.data}<br/>
	inner.["data"] : ${ requestScope.inner["data"] }<br/>
	num1 * (num2 + 3) : ${ requestScope.num1 * (requestScope.num2 + 3) }<br/>
	!bool : ${ !requestScope.bool }<br/>
	not bool : ${ not requestScope.bool }<br/>
	empty(data) : ${ empty(requestScope.data) }<br/>
	num1 / num2 : ${ requestScope.num1 / requestScope.num2 }<br/>
	num1 div num2 : ${ requestScope.num1 div requestScope.num2 }<br/>
	num1 != num2 : ${ requestScope.num1 != requestScope.num2 }<br/>
	num1 ne num2 : ${ requestScope.num1 ne requestScope.num2 }<br/>
	(num1 % 2 == 0) and (num2 mod 4 == 0) : ${ (requestScope.num1 % 2 ==0) and (requestScope.num2 mod 4 ==0)}<br/>
	
</body>
</html>