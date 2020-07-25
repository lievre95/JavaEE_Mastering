<%
    String message = pageContext.getException().getMessage();
    String exception = pageContext.getException().getClass().toString();
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Exception</title>
</head>
<body>
<h2>Exception occured while processing the request</h2>
<p>Type: <%= exception %>
</p>
<p>Type: <%= message %>
</p>
</body>
</html>