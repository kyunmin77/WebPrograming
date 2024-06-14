<%@ page language="java" %>
<%@ page info= "장바구니 처리" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8"%>
<%@ page import ="java.util.*, round22.base.*"%>
<%@ page session="true"%>

<%
	ArrayList baguni = null;
	Object obj = session.getAttribute("jang");
	if(obj == null) 
		baguni = new ArrayList();
	else
		baguni = (ArrayList)obj;
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv='content-type' content='text/html' charset="UTF-8">
<title>내 장바구니</title>
</head>
<body>
<div align="center">
	<h2>내 장바구니!</h2>
	<table width='600' border='1'>
		<tr height='25'>
			<th width='60'>번호</th>
			<th width='300'>제품명</th>
			<th width='60'>수량</th>
			<th width='80'>가격</th>
			<th width='100'>총가격</th>
		</tr>
		<%
		if(baguni.size() == 0){
			out.println("<tr><td align='center' colspan='5'>");
			out.println("구입하신 물품이 없습니다.");
			out.println("</td></tr>");
		}else{
			int total = 0;
			for(int i =0; i< baguni.size(); ++i){
				Jangbaguni jang = (Jangbaguni)baguni.get(i);
				out.println("<tr><td align='center'>");
				out.println(i + 1 + "</td>");
				out.println("<td align='left'>" + jang.getName() + "</td>");
				out.println("<td align='rigrt'>" + jang.getCnt() + "개</td>");
				out.println("<td align='rigrt'>" + jang.getPrice() + "원</td>");
				out.println("<td align='rigrt'>" + jang.getCnt()*jang.getPrice() + "원</td></tr>");
				
				total += jang.getCnt()*jang.getPrice();
			}	
				out.println("<tr><td align='right' colspan='4'>전체합계</td>");
				out.println("<td align='right'>" + total + "원</td></tr>");
			
		}
		
		%>
	</table>
</div>
</body>
</html>