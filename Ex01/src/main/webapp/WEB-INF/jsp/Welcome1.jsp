<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
  String str=(String) request.getAttribute("key");
  out.println(str);
%>
<body>
<h1>Hello all welcome to my jsp page </h1>

</body>
</html>