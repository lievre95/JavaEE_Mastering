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
<c:forEach var="user" items="${users}">
    <p>${user}</p>
</c:forEach>
<%--Looping--%>
<ul>
    <c:forEach var="user" items="{users}">
        <li><c:out value="${user}"></li>
    </c:out>
    </c:forEach>
</ul>

<ul>
    <p><c:forEach var="cook" items="${cook.value.name}"/></p>
    <p><c:forEach var="cook" items="${cook.value.value}"/></p>
</ul>
<%--Conditions--%>
<c:if test="${isVisible == true }">
    <p>Visible</p>
</c:if>
<c:if test="${isVisible == false }">
    <p>Invisible</p>
<%--    Choose Tag--%>
    <c:choose>
        <c:when test="${val == 1}">
            <p>Equals to 1</p>
        </c:when>
        <c:when test="${val == 2}">
            <p>Equals to 2</p>
        </c:when>
        <c:otherwise>
            <p>Undefined</p>
        </c:otherwise>
    </c:choose>
<%--    Url tag--%>
    <a href='<c:url value="/edit" />'> <c:url value="/edit" /></a>

<%--    Redirect--%>
    <c:if test="${val==null}">
        <c:redirect url="/notfound.jsp"/>
    </c:if>
</c:if>
</body>
</html>
