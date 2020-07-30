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
<p>Name: ${param.name}</p>
<p>Name: ${param.age}</p>
<%--getting values from string or from forms--%>
<p> Phone 1: ${paramValues.phone[0]}</p>
<p> Phone 2: ${paramValues.phone[1]}</p>
<%--getting the cookies--%>
<p>From cookie: ${coookie.userName.value}</p>
<p> User-Agent: ${header["User-Agent"]}</p>
<p> Host: ${header.host}</p>
</body>
</html>
