<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>

<!-- 에러가 나면 해당 페이지로 이동한다! -->
<%@ page errorPage="Round21_04_Error.jsp" %>



<%
	String nums = request.getParameter("nums");
	StringTokenizer tk = new StringTokenizer(nums,",");
	int[] num = new int[tk.countTokens()];
	int pos = 0;
	
	while(tk.hasMoreElements()){
		num[pos++] = Integer.parseInt(tk.nextToken().trim());
	}
	
	for(int i=0; i<num.length; i++){
		for(int j = i; j<num.length; ++j){
			if(num[i] > num[j]){
				int temp = num[i];
				num[i] = num[j];
				num[j] = temp;
			}
		}
	}
	
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="content-type" content="text/html" charset="UTF-8">
<title>수 나열 결과</title>
</head>
<body>
<div>
	<h2>수 나열 결과!</h2>
	<%
		for(int i =0; i<num.length; ++i){
			out.println(num[i]);
			if(i != num.length-1)
				out.println(" <= ");
		}
	%>
</div>
</body>
</html>