<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2019/5/24
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%
            request.setCharacterEncoding("utf-8");
            String name=request.getParameter("uname");
            String pwd=request.getParameter("upwd");
        %>
        注册成功：
        用户名：<%=name%>
</body>
</html>
