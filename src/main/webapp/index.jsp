<%--Directive--%>
<%@ page import="java.util.Date, java.text.*" pageEncoding="UTF-8"%>
<%@ page import="com.dogaion.math.Calculator" %>
<%--<%! int square(int n){--%>
<%-- return n*n;--%>
<%--}--%>
<%--%>--%>
<HTML>
 <HEAD>
  <TITLE>Hello World</TITLE>
 </HEAD>
 <BODY>
  <H1>Hello World via JSP</H1>
  <%= new java.util.Date().toString() %>
<%-- <p><%=square(9) %></p>--%>
     <h2>Square of 3 = <%=new Calculator().square(3)%></h2>
<%--  Scriptlet; java code --%>
  <%
  for(int i = 0; i<=5; i++){
//  out.println("<li>" + square(i) + "<li>");
 }
 %>
<h2>Now: <%=new Date()%></h2>

 </BODY>
</HTML>
