<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Result is</h1>
	<%
		String f = request.getParameter("Num1");
	%>
	<%
		String s = request.getParameter("Num2");
	%>
	<%
		String o = request.getParameter("operation");
	%>

	<%
		int f1 = Integer.parseInt(f);
		int s1 = Integer.parseInt(s);
		int result = 0;
		switch (o) {
		case "addition": {
			result = f1 + s1;
			break;
		}
		
		case "substraction": {
			result = f1 - s1;
			break;
		}
		
		case "division": {
			result = f1 / s1;
			break;
		}
		
		case "multiplication": {
			result = f1 * s1;
			break;
		}
		}
		
		%>
		result = <%=result %>
</body>
</html>