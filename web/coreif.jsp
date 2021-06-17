<%--
  Created by IntelliJ IDEA.
  User: HANG
  Date: 2021/6/17
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>if测试</title>
</head>
<body>
    <h4>if测试</h4>
    <%--el表达式获取表单中的数据--%>
    <form action="coreif.jsp" method="get">
        username：<input name="username" value="${param.username}">
        password：<input name="password" type="password" value="${param.password}">
        <input value="提交" type="submit">
    </form>
    <c:if test="${param.username == 'admin'}" var="isAdmin">
        <c:out value="管理员欢迎您"/>
    </c:if>
    <c:out value="${isAdmin}"/>
</body>
</html>
