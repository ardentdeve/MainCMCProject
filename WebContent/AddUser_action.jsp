<%@include file="VerifyAdmin.jsp"%>
<%@page language="java" import="project.*"%>
<%  
    String firstName = request.getParameter("FirstName");
    String lastname = request.getParameter("LastName");
    String username = request.getParameter("Username");
    String Password = request.getParameter("Password");
    char type = (request.getParameter("Type")).charAt(0);
    if(type=='u')
    {
    	Student s = new Student(firstName,lastname,username,Password,'Y');
    	ah.addStudent(s);
    }
    else if(type =='a')
    {
    	Admin a = new Admin(firstName,lastname,username,Password,'Y');
    	ah.addAdmin(a);
    	  response.sendRedirect("Menu.jsp");  
    }
  
  
%>

