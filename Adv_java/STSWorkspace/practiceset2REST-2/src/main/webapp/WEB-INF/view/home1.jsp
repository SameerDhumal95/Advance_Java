<%@page import="java.util.List"%>
<%@page import="study.hw1.entity.BookEntity"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="/output" method="post">
    <% List<BookEntity> list =(List<BookEntity>)request.getAttribute("list"); %>
    Book Name: 
    <select name="bname"> 
    <% for(BookEntity b : list)
    {
        %>
    

        <option value= <%=b.getBname() %> >
              <%=b.getBname() %>
        </option>
        <% } %>

    </select> 

    <input type="submit" value="remove">
</form>
</body>
</html>