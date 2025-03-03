<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%out.print("the current time="+java.util.Calendar.getInstance().getTime()); %>

<%
String name=request.getParameter("uname");
out.print("Hello "+name+"<br>");%>

<%! int x=100; %>
<%= "Welcome to JSP decleration tag"+x+"<br>" %>

<%
response.sendRedirect("https://www.tpointtech.com/config-implicit-object"+"<br>");%>


</body>
</html>