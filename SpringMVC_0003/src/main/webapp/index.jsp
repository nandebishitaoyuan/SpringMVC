<%--
  Created by IntelliJ IDEA.
  User: Sky
  Date: 2022/11/2
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><a href="${pageContext.request.contextPath}/demo.action">点这里进入二次元</a></h1>

<form action="${pageContext.request.contextPath}/user.action" method="post">
    用户名：<input type="text" name="name">
    密码：<input type="password" name="pwd">
    <input type="submit" value="登录">
</form>
</body>
</html>
