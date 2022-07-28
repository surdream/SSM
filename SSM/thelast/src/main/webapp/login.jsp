<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <base href="${pageContext.request.contextPath}/">
    <title>Title</title>
</head>
<body>
<h3>登录界面</h3>
<form action="user/login" method="post">
    <p>userName：<input type="text" name="userName" placeholder="请输入用户名"></p>
    <p>userPwd：<input type="password" name="userPwd" placeholder="请输入密码"></p>
    <p><input type="submit" value="提交"></p>
</form>
<p>${tips}</p>
</body>
</html>
