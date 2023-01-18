<%@page import="study.data.StudentData"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="elex2.jsp">
<input type="text" name="data"/>
<input type="submit"/>

</form>

<%
     List<Integer> nums = Arrays.asList(12,13,14,15);
     
     pageContext.setAttribute("numbers", nums);

     request.setAttribute("year", 1947);
     session.setAttribute("message","tell about el");
     application.setAttribute("quote", "Let us play");
     
     
     StudentData stud = new StudentData("AA","Mumbai","Maths");
     application.setAttribute("s1", stud);



%>

 ${pageScope.numbers }
 
</body>
</html>