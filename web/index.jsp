<%--
  Created by IntelliJ IDEA.
  User: HANG
  Date: 2021/6/17
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>jsp_study</title>
  </head>
  <body>
  hello_jsp<br/>

  <%--jsp表达式作用:用来将程序的输出，输出到客户端--%>
  <%= new java.util.Date()%>
  <hr>
  <%--jsp脚本片段--%>
  <%
    int sum = 0;
    for (int i = 0; i <=100 ; i++) {
      sum +=i;
    }
    out.write("sum="+sum);
    out.println("<h2>sum="+sum+"</h2>");
  %>
  <%--jsp 声明,会被编译到SP生成Java的类中!其他的，就会被生成到jspService方法!--%>
  <%!


  %>
  </body>
</html>
