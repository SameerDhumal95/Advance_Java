<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <h1>Tables showing square and cube</h1>
     <table border='1'>
     <tr>
     <th>Number</th>
     <th>Square</th>
     <th>Cube</th>
     </tr>
     <% for(int i=1;i<=100;i++) {%>
      <tr>
             <td><%=i %></td>
             <td><%=i*i %></td>
             <td><%=i*i*i %></td>
           </tr>  
      <% } %>
 
     </table>
     
</body>
</html>