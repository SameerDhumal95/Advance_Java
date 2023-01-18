<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="add.jsp" method="post">
	<h2>First Name:</h2>
	<input type="text" name="fname" />
	<br />
	<h2>Last Name:</h2>
	<input type="text" name="lname" />
	<br />
	<h2>Age:</h2>
	<select name="age">
		<% for(int i=1;i<=100;i++)
			{
			%>
		<option value=<%=i %>> <%=i %> </option>
		<%} %>

	</select>
	<br />
	<input type="submit" value="add-info">
</form>
</body>
</html>