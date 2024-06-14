<%@ page language="java" %>
<%@ page info="쇼핑몰 페이지" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding= "UTF-8" %>
<%@ page session ="true" %>

<%
	String[] img = new String[] {"cpoint","java","jsp","mfc","net",
			"oracle","python","tcpip","xml"};
	String[] name = new String[] {"c포인터","자바","JSP & Servlet","MFC","닷넷",
			"오라클","파이썬","TCP/IP","XML 웹서비스"};
	String[] price = new String[] {"20,000","32,000","29,000","35,000","29,000",
			"25,000","32,000","28,000","30,000"};
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="contentType" content="text/html" charset="UTF-8">
<title>쇼핑몰!</title>

<script language="javascript">	
	function jang(name, price){		// jang 매서드가 실행되면 jangProcess로 이동
		location.href="./Round22_04_Page_JangProcess.jsp?name=" + name + "&price=" + price; 
	}		//url 파라미터에 데이터를 넣어 전송
	
	function move_jang(){			// move_jang 매서드가 실행되면 장바구니로
		location.href = "./Round22_04_Page_Baguni.jsp";
	}
	
</script>
</head>
<body>
	<div align="center">
		<h2>쇼핑몰!</h2>
		<table width='400' border='0'>
			<tr>
				<td align='right' colspan='3'>
					<input type='button' value='내 장바구니' onClick='move_jang()'  style='border:none'/>
				</td>
			</tr>
			<%
			for(int i=0; i<img.length; ++i){				// 상품 수만큼 반복
				if(i %3 == 0) out.println("<tr>");
				out.println("<td><table border='0'>");					// 상품 이미지 출력
				out.println("<tr height ='100'><td align='center'>");
				out.println("<img src='./images/" + img[i] + ".png' ");
				out.println("width='80' height='100'/>");
				out.println("</td></tr>");
				
				out.println("<tr height ='20'><td align='center'>");	// 상품명 출력
				out.println("<B>" + name[i] + "</B></td></tr>");		
				
				out.println("<tr height ='20'><td align='center'>");	// 가격 출력
				out.println("가격 : " + price[i] + "원</td></tr>");
					
				out.println("<tr height ='20'><td align='right'>");		// 담기 버튼 생성 > 누르면 jang 매서드로
				out.println("<input type='button' value='담기' ");
				out.println("onClick='jang(\"" + name[i] + "\",\"" + price[i] + "\")'  style='border:none'/>");
		
				out.println("</td></tr>");
				out.println("</table></td>");
				if(i%3 == 2) out.println("</tr>");

			}
			%>
		</table>
	</div>
</body>
</html>