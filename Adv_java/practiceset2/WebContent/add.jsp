<%@page import="study.dao.DAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>record inserted...</h1>

<% DAO dao = new DAO();
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String age = request.getParameter("age");
		int _age= Integer.parseInt(age);
		if(_age<=18)
		{
		dao.addKid(fname, lname, _age);
		}
		else
		{
			dao.addAdult(fname, lname, _age);
		}
		%>
		
</body>
</html>