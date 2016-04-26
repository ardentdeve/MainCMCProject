<%@include file="VerifyStudent.jsp"%>
<%@page language="java" import="project.*"%>
<table style="text-align: left; width: 939px; height: 872px;" border="1"
cellpadding="2" cellspacing="2">
<tbody>
<tr>
<td style="vertical-align: top;">by School Name<br>
</td>
<td style="vertical-align: top;">contains <input
name="schoolName"><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;">by State<br>
</td>
<td style="vertical-align: top;">contains <input name="state"></td>
</tr>
<tr>
<td style="vertical-align: top;">by Location<br>
</td>
<td style="vertical-align: top;"><input name="location"> (SUBURBAN, URBAN, SMALLCITY or -1 for UNKNOWN)</td>
</tr>
<tr>
<td style="vertical-align: top;">by Control<br>
</td>
<td style="vertical-align: top;"><input name="control">(PRIVATE,STATE, CITY or -1 for UNKNOWN)</td>
</tr>
<tr>
<td style="vertical-align: top;">by Number Of Students<br>
</td>
<td style="vertical-align: top;">between <input
name="numberOfStudentsMin"> and <input name="numberOfStudentsMax"></td>
</tr>
<tr>
<td style="vertical-align: top;">by % Female<br>
</td>
<td style="vertical-align: top;">between <input
name="PctFemaleMin"> and <input name="PctFemaleMax"></td>
</tr>
<tr>
<td style="vertical-align: top;">by SAT Verbal<br>
</td>
<td style="vertical-align: top;">between <input
name="SatVerbalMin"> and <input name="SatVerbalMax"></td>
</tr>
<tr>
<td style="vertical-align: top;">by SAT MATH<br>
</td>
<td style="vertical-align: top;">between <input name="SatMathMin">
and <input name="SatMathMax"></td>
</tr>
<tr>
<td style="vertical-align: top;">by Expenses<br>
</td>
<td style="vertical-align: top;">between <input
name="ExpensesMin"> and <input name="ExpensesMax"></td>
</tr>
<tr>
<td style="vertical-align: top;">by % Financial Aid<br>
</td>
<td style="vertical-align: top;">between <input name="PctAidMin">
and <input name="PctAidMax"></td>
</tr>
<tr>
<td style="vertical-align: top;">by Number Of Applicants<br>
</td>
<td style="vertical-align: top;">between <input
name="ApplicantsMin"> and <input name="ApplicantsMax"></td>
</tr>
<tr>
<td style="vertical-align: top;">by % Admitted<br>
</td>
<td style="vertical-align: top;">between <input
name="PctAdmittedMin"> and <input name="PctAdmittedMax"></td>
</tr>
<tr>
<td style="vertical-align: top;">by % Enrolled<br>
</td>
<td style="vertical-align: top;">between <input
name="EnrolledMin"> and <input name="EnrolledMax"></td>
</tr>
<tr>
<td style="vertical-align: top;">by Academic Scale(1-5)<br>
</td>
<td style="vertical-align: top;">between <input
name="AcademicScaleMin"> and <input name="AcademicScaleMax"></td>
</tr>
<tr>
<td style="vertical-align: top;">by Social Scale(1-5)<br>
</td>
<td style="vertical-align: top;">between <input
name="socialScaleMin"> and <input name="socialScaleMax"></td>
</tr>
<tr>
<td style="vertical-align: top;">by Quality Of Scale(1-5)<br>
</td>
<td style="vertical-align: top;">between <input
name="qualityOfLifeScaleMin"> and <input name="qualityOfLifeScaleMax"></td>
</tr>
<tr>
<td style="vertical-align: top;">by Emphases<br>
</td>
<td style="vertical-align: top;"><input name="emphases1"><br>
<input name="emphases2"><br>
<input name="emphases3"><br>
<input name="emphases4"><br>
<input name="emphases5"></td>
</tr>
<tr>
<td style="vertical-align: top;">
<form method="post" action="searchAction.jsp" name="SearchAction"><input
name="search" value="Search For Schools" type="submit"><br>
</form>
<br>
</td>
<td style="vertical-align: top;"><input name="Reset" value="Reset"
type="reset"><br>
</td>
</tr>
</tbody>
</table>
<br>
<br>
</body>
</html>