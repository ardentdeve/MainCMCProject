<%@include file="VerifyAdmin.jsp"%>
<%  
	  String school = request.getParameter("schoolName");
	  String state = request.getParameter("state");
	  String location = request.getParameter("location");
	  String control = request.getParameter("control");
	  int numberOfStudents = Integer.parseInt(request.getParameter("NoStudents"));
	  double PctFemale= Double.parseDouble(request.getParameter("PctFemale"));
	  double satVerbal = Double.parseDouble(request.getParameter("SatVerbal"));
	  double satMath = Double.parseDouble(request.getParameter("SatMath"));
		double Expenses= Double.parseDouble(request.getParameter("Expenses"));
		double PctAid= Double.parseDouble(request.getParameter("FinancialAid"));
		int Applicants= Integer.parseInt(request.getParameter("NoApplicants"));
		double PctAdmitted= Double.parseDouble(request.getParameter("PctAdmitted"));
		double PctEnrolled= Double.parseDouble(request.getParameter("PctEnrolled"));
		int AcademicScale= Integer.parseInt(request.getParameter("PctAcademicScale"));
		int socialScale= Integer.parseInt(request.getParameter("SocialScale"));
	  int qualityOfLifeScale= Integer.parseInt(request.getParameter("QualityOfLifeScale"));
	  String emphases1 = request.getParameter("emphases1");
	  String emphases2 = request.getParameter("emphases2");
	  String emphases3 = request.getParameter("emphases3");
	  String emphases4 = request.getParameter("emphases4");
	  String emphases5 = request.getParameter("emphases5");
	  ArrayList<String>emphasesList = new ArrayList<String>();
	  emphasesList.add(emphases1);
	  emphasesList.add(emphases2);
	  emphasesList.add(emphases3);
	  emphasesList.add(emphases4);
	  emphasesList.add(emphases5);
	 University u = new University(school,state,location,control,numberOfStudents,PctFemale,satVerbal,satMath,Expenses,PctAid,Applicants,PctAdmitted,PctEnrolled,AcademicScale,socialScale,qualityOfLifeScale,emphasesList);
	  ah.addUniversity(u);
	  response.sendRedirect("AdminMenu.jsp");     
	%>