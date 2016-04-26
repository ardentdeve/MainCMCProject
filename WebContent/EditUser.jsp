<%@include file="VerifyAdmin.jsp"%>

<html>
<head>
<title>Add User Form</title>
<%
	String username = request.getParameter("Username");
	if(ah.isAdmin(username)){
		Admin user = ah.getSpecificAdmin(username);
	}
	else{
		Student user = ah.getSpecificStudent(username);
	}
%>
</head>
<body>
	<form method="post" action="EditUser_action.jsp" name="EditUser">
		<table style="text-align: left; width: 500px; height: 117px;"
			border="1" cellpadding="2" cellspacing="2">
			<tbody>
				<tr>
					<td style="vertical-align: top;">First Name<br>
					</td>
					<td style="vertical-align: top;"><input name="firstName" value ="<%=user.getfirstName()%>"><br>
						, value=><br></td>
				</tr>
				<tr>
					<td style="vertical-align: top;">Last Name<br>
					</td>
					<td style="vertical-align: top;"><input name="lastName">
					</td>
				</tr>
				<tr>
					<td style="vertical-align: top;">Username<br>
					</td>
					<td style="vertical-align: top;"><input readonly="readonly">
					</td>
				</tr>
				<tr>
					<td style="vertical-align: top;">Password<br>
					</td>
					<td style="vertical-align: top;"><input name="password">
					</td>
				</tr>
				<tr>
					<td style="vertical-align: top;">Type<br>
					</td>
					<td style="vertical-align: top;"><input name="type"></td>
				</tr>
				<tr>
					<td style="vertical-align: top;">Status<br>
					</td>
					<td style="vertical-align: top;"><input name="status"></td>
				</tr>
				<tr>
					<td style="vertical-align: top;"><input value="Edit User"
						name="Edit" type="submit"></td>
					<td style="vertical-align: top;"><input value="Cancel Changes"
						name="Reset" type="reset"></td>
				</tr>
			</tbody>
		</table>
		<br>
	</form>
	<br>
</body>
</html>

