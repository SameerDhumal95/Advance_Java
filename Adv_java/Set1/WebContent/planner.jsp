
<%@page import="java.util.Date"%>
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

<% DAO dao = new DAO();
		String date = request.getParameter("date");
		 
		String task_info = request.getParameter("task_info");
		dao.addTask(date,task_info);%>
		<h1>Record Successfully added...</h1>
</body>
</html>