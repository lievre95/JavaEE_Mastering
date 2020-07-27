<%--
  Created by IntelliJ IDEA.
  User: Ivan
  Date: 27.07.2020
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Info</title>
    </head>
<body>
<p>Name: <%= request.getParameter("name")%></p>
<p>Age: <%= request.getParameter("age")%></p>
<p>Gender: <%= request.getParameter("gender")%></p>
<p>Gender: <%= request.getParameter("username")%></p>
<h4>Selected Courses</h4>
<ul>
    <% String[] courses = request.getParameterValues("courses");
    for(String course: courses){
        out.println("<li>" +course +"</li>");

    }
    %>
</ul>


</body>
</html>
