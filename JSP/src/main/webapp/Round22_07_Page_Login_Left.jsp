<%@ page language="java"%>
<%@ page info="Include 테스트"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@ page buffer="none"%>
<%@ page autoFlush="true"%>
<%@ page isThreadSafe="true"%>

<%
String u_id = (String) session.getAttribute("id");

if (u_id == null || u_id.trim().length() == 0) {
	Cookie[] cks = request.getCookies();
	String id = "";
	if (cks != null) {
		for (int i = 0; i < cks.length; ++i) {
			String name = cks[i].getName();
			if (name.equals("id")) {
				id = cks[i].getValue();
				break;
			}
		}
	}
%>

<div align="center">
	<form method='post' action='Round22_07_Page_Login_Process.jsp'>
		<table width='230' border='1'>
			<tr>
				<td width='60' align='center'>아이디
				</td>
				<td width='70' align='left'><input type='text' name='id'
					size='10' value='<%=id%>' />
				</td>
				<td rowspan='2' align="center"><input type='submit'
					value='Login' />
				</td>
			</tr>
			<tr>
				<td width='50' align="center">비번
				</td>
				<td width='60' align="left"><input type='password' name='pw'
					size='10' />
				</td>
			</tr>
		</table>
	</form>
</div>

<%
} else {
%>

<B><%=u_id%></B>님!<br />
&nbsp;&nbsp; 방문을 환영합니다.<br />
&nbsp;&nbsp;
<a href='Round22_07_Page_Logout.jsp'>Logout</a>
<%
}
%>

