<html>
 <body>
    <form action="savehw1" method="POST">
        <div align="center"> 
    <h2>Name : </h2><br/>
    <input type="text" name="name" />
    <h2>Surname : </h2><br/>
    <input type="text" name="surname" />
    <h2>Date of Birth : </h2><br/>
    <input type="date" name="dob"/><br/>

    <input type="submit" value="save" />
    <br/><br/>
            <% if(request.getAttribute("id") != null) {%>
                <h2> Last Input ID : <%= request.getAttribute("id") %></h2>
                <% } %>
            </div>
</form>
 
 </body>

</html>