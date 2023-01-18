<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = 'output.jsp'>
<h1> Num 1</h1>
<br/><input type='number' name = 'Num1'>
<h1> Num 2</h1>
<br/><input type='number' name = 'Num2'>
<br/><h1>Options
<br/><select name='operation' >
     <option value='addition'>+</option>
     <option value='substraction'>-</option>
     <option value='division'>/</option>
     <option value='multiplication'>*</option>
</select></h1>
<input type = 'Submit' value = 'Ok'>
</form>
</body>
</html>