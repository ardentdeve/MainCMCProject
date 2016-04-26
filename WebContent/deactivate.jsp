<%@include file="VerifyAdmin.jsp"%>
<%  
    String student = request.getParameter("Student");
	Student student1 = sh.findByUsername(student);
    ah.deactivateUser(student1);
    response.sendRedirect("Menu.jsp");
%>