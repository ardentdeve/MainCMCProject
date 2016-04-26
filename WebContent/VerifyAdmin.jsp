<%@page language="java" import="project.*,java.util.*"%>
<%
AdminUI ah = (AdminUI) session.getAttribute("admin");
if ((ah==null)||(!ah.isLoggedOn())) {	
    response.sendRedirect("Login.jsp?Error=-4");
    return;
 }
%>