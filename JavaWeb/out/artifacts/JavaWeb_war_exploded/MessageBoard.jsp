<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2019/5/24
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>留言板</title>
</head>
<body>
    <form action="#" method="post">
    <table border="1" align="center" width="400">
        <tr>
            <td><label for="messager">留言人</label></td>
            <td><input type="text" name="messager" placeholder="请输入名字" id="messager"></td>
        </tr><br />
        <tr>
            <td>留言主题</td>
            <td><input type="text" name="title"></td>
        </tr>

        <tr>
            <td><label for="content">内容</label></td>
            <td><textarea cols="40" rows="8" placeholder="请输入内容" id="content"></textarea> </td>
        </tr><br />

        <tr>
            <td><input type="submit" value="留言"></td>
        </tr>
    </table>

    </form>
</body>
</html>
