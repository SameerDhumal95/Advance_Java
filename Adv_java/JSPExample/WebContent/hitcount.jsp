<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="Logo.jsp" %>
<%! int count=0; %>

<%
    count++;
    int ucount=0;
    if(session.isNew() || session.getAttribute("userwise_count")==null)
    {
    	ucount=1;
    	session.setAttribute("userwise_count", ucount);
    	
    }
    else
    {
    	ucount = (Integer)session.getAttribute("userwise_count");
    	ucount++;
    	session.setAttribute("userwise_count", ucount);
    }

%>

<p>The total hit count is <%=count  %></p>
<p>The user wise count is <%=ucount %></p>

</body>
</html>