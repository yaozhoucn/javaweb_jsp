<%--
  Created by IntelliJ IDEA.
  User: HANG
  Date: 2021/6/17
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JavaBean</title>
</head>
<body>
    <jsp:useBean id="people" class="com.yaozhou.pojo.People" scope="page"/>

    <jsp:setProperty name="people" property="name" value="yaozhou"/>
    <jsp:setProperty name="people" property="age" value="10"/>
    <jsp:setProperty name="people" property="address" value="xian"/>

    姓名：<jsp:getProperty name="people" property="name"/>
    年龄：<jsp:getProperty name="people" property="age"/>
    地址：<jsp:getProperty name="people" property="address"/>
</body>
</html>
