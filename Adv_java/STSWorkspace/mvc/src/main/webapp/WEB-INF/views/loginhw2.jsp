<html>
    <body>
    <form action="verify" method="POST">
        <div align="center">
            <h1>Login Page</h1><br/><br/>
            Enter Username    : <input type="text" name="uname" placeholder="Username" /><br/><br/>
            Enter password     : <input type="text" name="pwd" placeholder="Password" /><br/><br/>
            
            <input type="submit" name="login" value="LOGIN" /><br/>
           <% 
           if(request.getAttribute("msg") != null) {%>       
           <h3><%=request.getAttribute("msg")%></h3> <%}%>

        </div>
    </form>
    </body>
</html>