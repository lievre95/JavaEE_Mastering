<%
pageContext.setAttribute("name", "Tom");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JSP Application</title>
</head>
<body>
<p>Name ${name}</p>
<%--pageScope, requestScope, sessionScope, applicationScope.name--%>

</body>
</html>