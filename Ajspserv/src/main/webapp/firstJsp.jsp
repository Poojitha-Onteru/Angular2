<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="second.jsp">second jsp page</a>
<%
String n=request.getParameter("uname");
out.print("welcome "+n+"<br>");
session.setAttribute("n",n);

%>

</body>
</html>