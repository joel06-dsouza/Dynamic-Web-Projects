<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

	// Displays the result on a new page
	int sq = (int) session.getAttribute("sq");
	out.println("Square of addition (result.jsp) = "+sq);
	
%>
</body>
</html>