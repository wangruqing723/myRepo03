<%--
  Created by IntelliJ IDEA.
  User: WY
  Date: 2019/8/28
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
    用户名:<input type="text" name="username"><br>
    密 码:<input type="password" name="userPwd"><br>
    <input type="submit" value="登录"><br>
    <span style="color: red;">${msg}</span>
</form>

</body>
</html>
