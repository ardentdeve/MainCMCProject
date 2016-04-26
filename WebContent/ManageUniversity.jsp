<%@include file="VerifyAdmin.jsp"%>

<html>
<head>
<title></title>
</head>
<body>
	<br>
	<br>

	<table style="text-align: left; width: 100%;" border="1"
		cellpadding="2" cellspacing="2">
		<tbody>
			<tr align="center">

				<td colspan="17" rowspan="1" style="vertical-align: top;"><a
					href="AddUniversity.jsp">ADD A NEW UNIVERSITY</a><br></td>
			</tr>
			<tr>
				<td style="vertical-align: top; text-align: center;">School<br>
				</td>
				<td style="vertical-align: top; text-align: center;">State<br>
				</td>
				<td style="vertical-align: top; text-align: center;">Location<br>
				</td>
				<td style="vertical-align: top; text-align: center;">Control<br>
				</td>
				<td style="vertical-align: top; text-align: center;"># of
					Students<br>
				</td>
				<td style="vertical-align: top; text-align: center;">% Female<br>
				</td>
				<td style="vertical-align: top; text-align: center;">SAT VERBAL<br>
				</td>
				<td style="vertical-align: top; text-align: center;">SAT Math<br>
				</td>
				<td style="vertical-align: top; text-align: center;">Expenses<br>
				</td>
				<td style="vertical-align: top; text-align: center;">% with
					Financial Aid<br>
				</td>
				<td style="vertical-align: top; text-align: center;"># of
					Applicants<br>
				</td>
				<td style="vertical-align: top; text-align: center;">% Admitted
					<br>
				</td>
				<td style="vertical-align: top; text-align: center;">% Enrolled<br>
				</td>
				<td style="vertical-align: top; text-align: center;">%
					AcademicScale(1-5)<br>
				</td>
				<td style="vertical-align: top; text-align: center;">%
					SocialScale(1-5)<br>
				</td>
				<td style="vertical-align: top; text-align: center;">%
					QualityOfLifeScale(1-5)<br>
				</td>
				<td style="vertical-align: top;"><br></td>
			</tr>
			<%
				ArrayList<University> allUni = ah.getUniversities();
				for (int i = 0; i < allUni.size(); i++) {
					University u = allUni.get(i);
			%>
			<tr>
				<td style="vertical-align: top;"><br><%=u.getName()%></td>
				<td style="vertical-align: top;"><br><%=u.getState()%></td>
				<td style="vertical-align: top;"><br><%=u.getLocation()%>
				</td>
				<td style="vertical-align: top;"><br><%=u.getControl()%></td>
				<td style="vertical-align: top;"><br><%=u.getNumberStudents()%>
				</td>
				<td style="vertical-align: top;"><br><%=u.getPctFemale()%>
				</td>
				<td style="vertical-align: top;"><br><%=u.getSatVerbal()%>
				</td>
				<td style="vertical-align: top;"><br><%=u.getSatMath()%></td>
				<td style="vertical-align: top;"><br><%=u.getExpenses()%>
				</td>
				<td style="vertical-align: top;"><br><%=u.getPctFinancialAid()%>
				</td>
				<td style="vertical-align: top;"><br><%=u.getNumberOfApplicants()%>
				</td>
				<td style="vertical-align: top;"><br><%=u.getPctAdmitted()%>
				</td>
				<td style="vertical-align: top;"><br><%=u.getPctEnrolled()%>
				</td>
				<td style="vertical-align: top;"><br><%=u.getAcademicScale()%>
				</td>
				<td style="vertical-align: top;"><br><%=u.getSocialScale()%>
				</td>
				<td style="vertical-align: top;"><br><%=u.getQualityOfLifeScale()%>
				</td>
				<td style="vertical-align: top;">
					<form method="post" action="EditUniversity.jsp" name="Edit">
						<input name="Edit" value="Edit" type="submit"><br> <input
							name="University" value="<%=u.getName()%>" type="hidden">
					</form> <br>
				</td>
			</tr>
			<%}%>
		</tbody>
	</table>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
</body>
</html>

