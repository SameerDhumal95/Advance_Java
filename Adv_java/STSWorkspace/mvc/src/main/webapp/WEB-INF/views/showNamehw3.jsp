<%@page import="java.util.*" %>
<%@page import="study.mvc.*"%>
<html>
    <body>
    <form >
        <div align="center">
            <h1>Birthday Tracker Page</h1><br/><br/>
            <ul>
           <%List<BdayTrackerDO> list = (List<BdayTrackerDO>)request.getAttribute("list"); 
            for(BdayTrackerDO bt : list)
            {%>
               <li> <%= bt%></li>
               <%}%>
            </ul>
        </div>
    </form>
    </body>
</html>