<%--
  Created by IntelliJ IDEA.
  User: ZJX
  Date: 2021/3/8
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="get" action="/index">
    用户名:<input type="text" name="username"><br>
    密码:<input type="password" name="password"><br>
    兴趣爱好:<input type="checkbox" name="hobby" value="cpp">c++<br>
    <input type="checkbox" name="hobby" value="java">java<br>
    <input type="checkbox" name="hobby" value="js">JavaScript<br>
    <button type="submit">提交</button>
  </form>
  </body>
</html>
