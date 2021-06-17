<%--
  Created by IntelliJ IDEA.
  User: HANG
  Date: 2021/6/17
  Time: 12:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--内置对象--%>
    <%
        pageContext.setAttribute("name1","yz1"); //保存的数据只在一 个页面中有效
        request.setAttribute("name2","yz2");//保存的数据只在一次请求中有效，请求转发会携带这个数据
        session.setAttribute("name3","yz3");//保存的数据只在一次会话中有效，从打开浏览器到关闭浏览器
        application.setAttribute("name4","yz4");//保存的数据只在服务器中有效，从打开浏览器到关闭浏览器


    %>


<h2>${name1}</h2>
<h2>${name2}</h2>
<h2>${name3}</h2>
<h2>${name4}</h2>

</body>
</html>
