<%--
  Created by IntelliJ IDEA.
  User: HANG
  Date: 2021/6/17
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    <jsp:include page="PageContextDemo1.jsp" ></jsp:include>--%>
    <jsp:forward page="jsptag2.jsp">
        <jsp:param name="name" value="yaozhou"/>
        <jsp:param name="age" value="18"/>
    </jsp:forward>
</body>
</html>
