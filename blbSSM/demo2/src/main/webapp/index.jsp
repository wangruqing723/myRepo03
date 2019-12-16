<%--
  Created by IntelliJ IDEA.
  User: WY
  Date: 2019/8/28
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
您好${userInfo.userName},欢迎登录<br>
您的信息如下:<br>
用户ID:${userInfo.userId}<br>
用户姓名:${userInfo.userName}<br>
用户性别:${userInfo.userSex}<br>
用户国籍:${userInfo.userGJ}<br>
</body>
</html>
