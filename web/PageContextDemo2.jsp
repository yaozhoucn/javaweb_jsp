<%--
  Created by IntelliJ IDEA.
  User: HANG
  Date: 2021/6/17
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name1 = (String) pageContext.getAttribute("name1");
    String name2 = (String) request.getAttribute("name2");
    String name3 = (String) session.getAttribute("name3");
    String name4 = (String) application.getAttribute("name4");
%>
    <h2>${name1}</h2>
    <h2>${name2}</h2>
    <h2>${name3}</h2>
    <h2>${name4}</h2>

</body>
</html>
