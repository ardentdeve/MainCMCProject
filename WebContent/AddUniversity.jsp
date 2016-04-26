<%@include file="VerifyAdmin.jsp"%>

<html>
<head>
<title>Add University Form</title>
</head>
<body>
<form method="post" action="AddUniversity_action.jsp" name="addUniversity">
<table style="text-align: left; width: 804px; height: 783px;"
border="1" cellpadding="2" cellspacing="2">
<tbody>
<tr>
<td style="vertical-align: top;">SCHOOL<br>
</td>
<td style="vertical-align: top;"><input name="schoolName"><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">STATE<br>
</td>
<td style="vertical-align: top;"><input name="state"> </td>
</tr>
<tr>
<td style="vertical-align: top;">LOCATION<br>
</td>
<td style="vertical-align: top;"><input name="location"> </td>
</tr>
<tr>
<td style="vertical-align: top;">CONTROL<br>
</td>
<td style="vertical-align: top;"><input name="control"> </td>
</tr>
<tr>
<td style="vertical-align: top;">NUMBER STUDENTS<br>
</td>
<td style="vertical-align: top;"><input name="NoStudents"> </td>
</tr>
<tr>
<td style="vertical-align: top;">%FEMALE<br>
</td>
<td style="vertical-align: top;"><input name="PctFemale"></td>
</tr>
<tr>
<td style="vertical-align: top;">SAT VERBAL<br>
</td>
<td style="vertical-align: top;"><input name="SatVerbal"></td>
</tr>
<tr>
<td style="vertical-align: top;">SAT MATH<br>
</td>
<td style="vertical-align: top;"><input name="SatMath"></td>
</tr>
<tr>
<td style="vertical-align: top;">EXPENSES<br>
</td>
<td style="vertical-align: top;"><input name="Expenses"></td>
</tr>
<tr>
<td style="vertical-align: top;">%FINANCIAL AID<br>
</td>
<td style="vertical-align: top;"><input name="FinancialAid"></td>
</tr>
<tr>
<td style="vertical-align: top;">NUMEBR APPLICANTS<br>
</td>
<td style="vertical-align: top;"><input name="NoApplicants"></td>
</tr>
<tr>
<td style="vertical-align: top;">%ADMITTED<br>
</td>
<td style="vertical-align: top;"><input name="PctAdmitted"></td>
</tr>
<tr>
<td style="vertical-align: top;">%ENROLLED<br>
</td>
<td style="vertical-align: top;"><input name="PctEnrolled"></td>
</tr>
<tr>
<td style="vertical-align: top;">ACADEMIC SCALE(1-5)<br>
</td>
<td style="vertical-align: top;"><input name="PctAcademicScale"></td>
</tr>
<tr>
<td style="vertical-align: top;">SOCIAL SCALE(1-5)<br>
</td>
<td style="vertical-align: top;"><input name="SocialScale"></td>
</tr>
<tr>
<td style="vertical-align: top;">QUALITY OF LIFE SCALE(1-5)<br>
</td>
<td style="vertical-align: top;"><input name="QualityOfLifeScale"></td>
</tr>
<tr>
<td colspan="1" rowspan="6" style="vertical-align: top;">EMPHASES<br>
</td></tr>
<tr>
<td style="vertical-align: top;"><input name="emphases1"></td>
</tr>
<tr>
<td style="vertical-align: top;"><input name="emphases2"></td>
</tr>
<tr>
<td style="vertical-align: top;"><input name="emphases3"></td>
</tr>
<tr>
<td style="vertical-align: top;"><input name="emphases4"></td>
</tr>
<tr>
<td style="vertical-align: top;"><input name="emphases5"></td>
</tr>
<tr>
<td style="vertical-align: top;"><input value="Add School"
name="Add" type="submit"></td>
<td style="vertical-align: top;"><input value="Cancel Changes"
name="Reset" type="reset"></td>
</tr>>
</tbody>
</table>
<br>
</form>
<br>
</body>
</html>

