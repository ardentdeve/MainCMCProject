<%@include file="VerifyStudent.jsp"%>
<%@page language="java" import="project.*"%>
<%  
    String firstname = request.getParameter("FirstName");
    String lastname = request.getParameter("LastName");
    String username = request.getParameter("Username");
    String password = request.getParameter("Password");
    char type = (request.getParameter("Type")).charAt(0);
    Student editS = new Student(firstname,lastname,username, password,type);
    sh.editProfile(editS);
    response.sendRedirect("Menu.jsp");      

%>
