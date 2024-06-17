<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- 열혈강의 서블렛 JSP 930.p -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>InC Tag Library</title>
</head>
<body>
	<!-- 간단한 에러 발생시키고 출력 -->
	<c:catch var="ex">
		<% Integer.parseInt("abcd"); %>
	</c:catch>
	exception: <c:out value="${ex}"/><br/><br/>
	
	<!-- 조건으로 분기 실행시키고 에러가 있으면 에러를 출력 -->
	<c:set var="x" value="ab" scope="request"/>
	
	<c:catch var="ex2">
	<c:choose>
		<c:when test="${requestScope.x % 2 == 0}">
			<c:out value="짝수입니다."/><br/><br/>
		</c:when>
		<c:when test="${requestScope.x % 2 == 1}">
			<c:out value="홀수입니다."/><br/><br/>
		</c:when>
		<c:otherwise>
			<c:out value="수가 아닙니다.[이부분은 실행안되고 에러]"/><br/><br/>
		</c:otherwise>
	</c:choose>
	</c:catch>
	<c:if test="${ not empty(ex2) }">
		exception2: <c:out value="${ ex2 }"/><br/><br/>
	</c:if>
	
	<!-- 구구단 9단 출력 -->
	<c:forEach var="i" begin="1" end="9" step="1">
	9* <c:out value="${ i }"/> = <c:out value = "${ 9*i }"/><br/>
	</c:forEach><br/>
	
	<!--  -->
	<%
		java.util.ArrayList<String> list = new java.util.ArrayList<String>();
		list.add("aaa"); list.add("bbb"); list.add("ccc"); list.add("ddd");
		session.setAttribute("list", list);
	%>
	 <c:forEach var="obj" items="${ sessionScope.list }" begin="2" end="3" step="1" varStatus="pos">
	 	<c:out value="${ pos.count }"/> : <c:out value="${ obj }"/><br/>
	 </c:forEach><br/>
	 
	 <!--  -->
	 <c:set var="delim_str" value="신건민,오시안,양소령,김지혜" scope="request"/>
	 <c:forTokens var="obj" items="${ delim_str }" delims=","  varStatus="pos">
	 	<c:out value="${ pos.count }"/> : <c:out value="${ obj }"/><br/>
	 </c:forTokens><br/>
	 
	<!--  -->
	<c:url value="http://localhost:8282/JSP/Round25_Page_ELView.jsp"/><br/>
	<c:url value="/Round25_Page_ELView.jsp" context="/JSP"/><br/>
	<c:url value="http://localhost:8282/JSP/Round25_Page_ELView.jsp" var="elurl" scope="request"/>
	
	<c:import url="${ requestScope.elurl }"/><br/><br/>
	<hr/>
	
	<!--  -->
	<c:import url="http://localhost:8282/JSP/Round25_Page_ELView.jsp"/>
	<c:import url="http://localhost:8282/JSP/Round25_Page_ELView.jsp" var="elview" scope="request"/>
	<c:import url="/Round25_Page_ELView.jsp" context="/JSP" varReader="in">
		<jsp:useBean id="dataout" class="round25.out.DataOut">
			<c:set target="${ dataout }" property="in" value="${ in }"/>
		</jsp:useBean>
	</c:import> <br/><hr/>
	
	<c:out value="<h2>JAVA</h2>" escapeXml = "true"/><br/>
	<c:out value="<h2>JAVA</h2>" escapeXml = "false"/><br/>
	&lt;XML&gt;java&lt;XML&gt;[escapeXml:true] = <c:out value="A : <XML>java</XML>" escapeXml="true"/><br/>
	&lt;XML&gt;java&lt;XML&gt;[escapeXml:false] = <c:out value="B : <XML>java</XML>" escapeXml="false"/><br/>
	<hr/>
	
	<c:out value="${ requestScope.elview }" default="객체가 존재하지 않습니다." escapeXml="false"/>
	
	<%--
		<c:redirect url="http//localhost:8282/JSP/Round25_Page_Input.jsp"/>
	--%>
	
	
</body>
</html>