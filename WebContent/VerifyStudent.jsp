<%@page language="java" import="project.*,java.util.*"%>
<%
StudentUI sh = (StudentUI) session.getAttribute("studentH");
 if ((sh==null)||(!sh.isLoggedOn())) {	
     response.sendRedirect("Login.jsp?Error=-4");
     return;
 }
%>