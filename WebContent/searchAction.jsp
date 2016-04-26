<%@include file="VerifyStudent.jsp"%>
<%@page language="java" import="project.*"%>
<html>
<head>
<title></title>
</head>
<body>
<br>
<br>

<table style="text-align: left; width: 100%;" border="1" cellpadding="2"
cellspacing="2">
<tbody>
<%  
    String school = request.getParameter("schoolName");
    String state = request.getParameter("state");
    String location = request.getParameter("location");
    String control = request.getParameter("control");
    int numberOfStudentsMin = -1;
    int numberOfStudentsMax = -1;
    double PctFemaleMin = -1;
    double PctFemaleMax = -1;
    double satVerbalMin = -1;
    double satVerbalMax = -1;
    double satMathMin = -1;
    double satMathMax = -1;
    double ExpensesMin = -1;
    double ExpensesMax = -1;
    double PctAidMin= -1;
    double PctAidMax = -1;
    int  ApplicantsMin = -1;
    int ApplicantsMax = -1;
    double PctAdmittedMin = -1;
    double PctAdmittedMax = -1;
    double EnrolledMin = -1;
    double EnrolledMax = -1;
    int  AcademicScaleMin= -1;
    int AcademicScaleMax= -1;
    int  socialScaleMin=  -1;
    int socialScaleMax = -1;
    int  qualityOfLifeScaleMin = -1;
    int qualityOfLifeScaleMax = -1;
    
    if(request.getParameter("numberOfStudentsMin")!=null)
    {
    	numberOfStudentsMin= Integer.parseInt(request.getParameter("numberOfStudentsMin"));
    }
    if(request.getParameter("numberOfStudentsMax")!=null)
    {
    	numberOfStudentsMax = Integer.parseInt(request.getParameter("numberOfStudentsMax"));
    }
    if(request.getParameter("PctFemaleMin")!=null)
    {
    	PctFemaleMin = Double.parseDouble(request.getParameter("PctFemaleMin"));
    } 
    if(request.getParameter("PctFemaleMax")!=null)
    {
    	PctFemaleMax = Double.parseDouble(request.getParameter("PctFemaleMax"));
    }
    if(request.getParameter("SatVerbalMin")!=null)
    {
    	 satVerbalMin = Double.parseDouble(request.getParameter("SatVerbalMin"));
    }
    if(request.getParameter("SatVerbalMax")!=null)
    {
    	 satVerbalMax = Double.parseDouble(request.getParameter("SatVerbalMax"));
    }
    if(request.getParameter("SatMathMin")!=null)
    {
    	 satMathMin= Double.parseDouble(request.getParameter("SatMathMin"));
    }
    if(request.getParameter("SatMathMax")!=null)
    {
    	 satMathMax = Double.parseDouble(request.getParameter("SatMathMax"));
    }
    if(request.getParameter("ExpensesMin")!=null)
    {
    	ExpensesMin= Double.parseDouble(request.getParameter("ExpensesMin"));
    }
    if(request.getParameter("ExpensesMax")!=null)
    {
    	ExpensesMax = Double.parseDouble(request.getParameter("ExpensesMax"));
    }
    if(request.getParameter("PctAidMin")!=null)
    {
    	PctAidMin= Double.parseDouble(request.getParameter("PctAidMin"));
    }
    if(request.getParameter("PctAidMax")!=null)
    {
    	PctAidMax = Double.parseDouble(request.getParameter("PctAidMax"));
    }
    if(request.getParameter("ApplicantsMin")!=null)
    {
    	ApplicantsMin= Integer.parseInt(request.getParameter("ApplicantsMin"));
    }
    if(request.getParameter("ApplicantsMax")!=null)
    {
    	ApplicantsMax = Integer.parseInt(request.getParameter("ApplicantsMax"));
    }
    if(request.getParameter("PctAdmittedMin")!=null)
    {
    	PctAdmittedMin= Double.parseDouble(request.getParameter("PctAdmittedMin"));
    }
    if(request.getParameter("PctAdmittedMax")!=null)
    {
    	PctAdmittedMax= Double.parseDouble(request.getParameter("PctAdmittedMax"));
    }
    if(request.getParameter("EnrolledMin")!=null)
    {
    	EnrolledMin= Double.parseDouble(request.getParameter("EnrolledMin"));
    }
    if(request.getParameter("EnrolledMax")!=null)
    {
    	EnrolledMax= Double.parseDouble(request.getParameter("EnrolledMax"));
    }
    if(request.getParameter("AcademicScaleMin")!=null)
    {
    	AcademicScaleMin= Integer.parseInt(request.getParameter("AcademicScaleMin"));
    }
    if(request.getParameter("AcademicScaleMax")!=null)
    {
    	AcademicScaleMax= Integer.parseInt(request.getParameter("AcademicScaleMax"));
    }
    if(request.getParameter("socialScaleMin")!=null)
    {
    	socialScaleMin= Integer.parseInt(request.getParameter("socialScaleMin"));
    }
    if(request.getParameter("socialScaleMax")!=null)
    {
    	socialScaleMax= Integer.parseInt(request.getParameter("socialScaleMax"));
    }
    if(request.getParameter("qualityOfLifeScaleMin")!=null)
    {
    	qualityOfLifeScaleMin= Integer.parseInt(request.getParameter("qualityOfLifeScaleMin"));
    }
    if(request.getParameter("qualityOfLifeScaleMax")!=null)
    {
    	qualityOfLifeScaleMax= Integer.parseInt(request.getParameter("qualityOfLifeScaleMax"));
    }
 
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
    ArrayList<University> search= sh.searchUni(school,state,location,control,numberOfStudentsMin,numberOfStudentsMax,PctFemaleMin,PctFemaleMax,satVerbalMin,satVerbalMax,satMathMin,satMathMax,ExpensesMin,ExpensesMax,PctAidMin,PctAidMax,ApplicantsMin,ApplicantsMax,PctAdmittedMin,PctAdmittedMax,EnrolledMin,EnrolledMax,AcademicScaleMin,AcademicScaleMax,socialScaleMin,socialScaleMax,qualityOfLifeScaleMin,qualityOfLifeScaleMax,emphasesList);
     for (int i = 0;i<search.size();i++){
       University u = search.get(i);  %>        
<tr>
<td style="vertical-align: top;">
<form method="post" action="save.jsp" name="Save">
    <input name="Save" value="Edit" type="submit"><br>
    <input name="University" value="<%=u.getName()%>" type="hidden">
</form>
<br>
<td style="vertical-align: top;"><br><%=u.getName()%>
</td>
<td style="vertical-align: top;">
<form method="post" action="view.jsp" name="View">
    <input name="View" value="View" type="submit"><br>
    <input name="University" value="<%=u.getName()%>" type="hidden">
    </form>
<br>
</tr>
  <%}%>
</tbody>
</table>
<br>
</body>
</html>