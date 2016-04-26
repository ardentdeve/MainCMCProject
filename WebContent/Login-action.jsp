<%@page language="java" import="project.*"%>
<%StudentUI sh = new StudentUI();
AdminUI ah = new AdminUI();
String username = request.getParameter("Username");
String password= request.getParameter("Password");
int value = sh.logOn(username, password);	
if(value==-1)
{
        value = ah.logOn(username, password);
        if(value<0)
    	{
        	response.sendRedirect("Login.jsp?Error="+ value);	
    	}
        else
        {
        	session.setAttribute("admin",ah);
        	session.setAttribute("admin",ah);
        	response.sendRedirect("AdminMenu.jsp");
        }
    
}
else 
{
	 if(value<0)
  	{
      	response.sendRedirect("Login.jsp?Error="+ value);	
  	}
      else
      {
      	session.setAttribute("studentH",sh);
      	response.sendRedirect("Menu.jsp");
      }
}

 %>
