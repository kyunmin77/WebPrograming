<%@ page language="java" %>
<%@ page info= "Include 테스트" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@ page buffer="none"%>
<%@ page autoFlush="true"%>
<%@ page isThreadSafe="true"%>

<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	session.setAttribute("id", id);
	
	Cookie ck = new Cookie("id",id);
	ck.setMaxAge(60*60*24*365);
	response.addCookie(ck);
	
	response.sendRedirect("Round22_07_Page_Login.jsp");
%>