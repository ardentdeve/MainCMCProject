<%@include file="VerifyStudent.jsp"%>
<%@page language="java" import="project.*"%>
<title></title>
</head>
<body>
<%
    String university = request.getParameter("University");
    University u = sh.getUniInfo(university);
    ArrayList<String>Emphases = u.getEmphases();
 
%>
<table style="text-align: left; width: 815px; height: 480px;" border="1"
cellpadding="2" cellspacing="2">
<tbody>
<tr>
<td style="vertical-align: top;">SCHOOL<br>
</td>
<td style="vertical-align: top;"><br><%=u.getName()%>
</td>
</tr>
<tr>
<td style="vertical-align: top;">STATE<br>
</td>
<td style="vertical-align: top;"><br><%=u.getState()%>
</td>
</tr>
<tr>
<td style="vertical-align: top;">LOCATION<br>
</td>
<td style="vertical-align: top;"><br><%=u.getLocation()%>
</td>
</tr>
<tr>
<td style="vertical-align: top;">CONTROL<br>
</td>
<td style="vertical-align: top;"><br><%=u.getControl()%>
</td>
</tr>
<tr>
<td style="vertical-align: top;">NUMBER OF STUDENTS<br>
</td>
<td style="vertical-align: top;"><br><%=u.getNumberStudents()%>
</td>
</tr>
<tr>
<td style="vertical-align: top;">%FEMALE<br>
</td>
<td style="vertical-align: top;"><br><%=u.getPctFemale()%>
</td>
</tr>
<tr>
<td style="vertical-align: top;">SAT VERBAL<br>
</td>
<td style="vertical-align: top;"><br><%=u.getSatVerbal()%>
</td>
</tr>
<tr>
<td style="vertical-align: top;">SAT MATH<br>
</td>
<td style="vertical-align: top;"><br><%=u.getSatMath()%>
</td>
</tr>
<tr>
<td style="vertical-align: top;">EXPENSES<br>
</td>
<td style="vertical-align: top;"><br><%=u.getExpenses()%>
</td>
</tr>
<tr>
<td style="vertical-align: top;">%FINANCIAL AID <br>
</td>
<td style="vertical-align: top;"><br><%=u.getPctFinancialAid()%>
</td>
</tr>
<tr>
<td style="vertical-align: top;">NUMBER OF APPLICANTS <br>
</td>
<td style="vertical-align: top;"><br><%=u.getNumberOfApplicants()%>
</td>
</tr>
<tr>
<td style="vertical-align: top;">%ADMITTED<br>
</td>
<td style="vertical-align: top;"><br><%=u.getPctAdmitted()%>
</td>
</tr>
<tr>
<td style="vertical-align: top;">%ENROLLED<br>
</td>
<td style="vertical-align: top;"><br><%=u.getPctEnrolled()%>
</td>
</tr>
<tr>
<td style="vertical-align: top;">ACADEMIC SCALE(1-5)<br>
</td>
<td style="vertical-align: top;"><br><%=u.getAcademicScale()%>
</td>
</tr>
<tr>
<td style="vertical-align: top;">SOCIAL SCALE(1-5)<br>
</td>
<td style="vertical-align: top;"><br><%=u.getSocialScale()%>
</td>
</tr>
<tr>
<td style="vertical-align: top;">QUALITY OF LIFE SCALE(1-5)<br>
</td>
<td style="vertical-align: top;"><br><%=u.getQualityOfLifeScale()%>
</td>
</tr>
<tr>

<td colspan="1" rowspan="7" style="vertical-align: top;">EMPHASES<br>
</td>
<% 
 for(int i =0;i<Emphases.size(); i++)
    {   
       String emphases1 = Emphases.get(i);
   %> 
<td style="vertical-align: top;"><br><%=emphases1%>
</td>
</tr>
<%}%>
<tr>
<td style="vertical-align: top;">
<form action="SavedSchool.jsp" name="ReturnForm"><input name="Return"
value="Return to Saved School " type="submit"><br>
</form>
<br>
</td>
<td style="vertical-align: top;">
<form action="Menu.jsp" name="Return"><input name="Return"
value="Return to Menu" type="submit"><br>
</form>
<br>
</td>
</tr>
</tbody>
</table>
<br>
</body>
</html>
