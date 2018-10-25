<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/25/2018
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.codegym.Model.Sandwich" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Sanwiches</title>
  </head>
  <body>
<h1> Pick your ingredients </h1>
<form:form method="post" modelAttribute="Sandwich">
  <form:checkboxes path="ingredientName" items="${sandwiches}"/>
  <input type="submit" value="Submit">
</form:form>
  </body>
</html>
