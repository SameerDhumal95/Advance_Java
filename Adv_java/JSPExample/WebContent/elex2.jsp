<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- instead of getParameter we use param -->
     <p>Welcome ${param.data }</p>
     <p>Welcome <%=request.getParameter("data") %></p>

<!-- El short hand notation -->
<p>page level data = ${sessionScope.numbers }</p>
<p> request data = ${requestScope.year }</p>
<p> session data = ${sessionScope.message }</p>
<p> application data = ${applicationScope.quote }</p>
<p> student data = ${applicationScope.s1.getSubject() }</p>


</body>
</html>