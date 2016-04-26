<%@include file="VerifyStudent.jsp"%>
<%@page language="java" import="project.*"%>
<html>
<head>
<style><head>
<style></style>
<title>savedSchool</title>
</head>
<body>
<table style="text-align: left; width: 100%;" border="1"
cellpadding="2" cellspacing="2">
<tbody>
<tr>
<td colspan="3" align="center"> School </td>
</tr>
<%
ArrayList<University>savedUni= sh.getSavedUniversity();
for (int i = 0;i<savedUni.size();i++){
       University u = savedUni.get(i); %>
<td style="vertical-align: top;">
<form method="post" action="Remove.jsp" name="RemoveForm">
    <input name="RemoveButton" value="Remove" type="submit"><br>
    <input name="University" value="<%=u.getName()%>" type="hidden"><br>
</form>
<br>
<td style="vertical-align: top;"><br><%=u.getName()%>
</td>
<td style="vertical-align: top;">
<form method="post" action="View.jsp" name="View">
    <input name="View" value="View" type="submit"><br>
    <input name="University" value="<%=u.getName()%>" type="hidden">
</form>
<br>
</td>
</tr>
<%}%>
</tbody>
</table>
</body>
</html>
