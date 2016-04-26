<%@include file="VerifyStudent.jsp"%>
<%  
    String university = request.getParameter("University");
    sh.removeUniversity(university);
    response.sendRedirect("Menu.jsp");      
%>