<%@ page language="java" %>
<%@ page info= "Include 테스트" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@ page buffer="none"%>
<%@ page autoFlush="true"%>
<%@ page isThreadSafe="true"%>

<%
	session.removeAttribute("id");
	response.sendRedirect("Round22_07_Page_Login.jsp");
%>