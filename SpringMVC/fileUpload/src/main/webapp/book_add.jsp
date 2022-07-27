<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h4>添加图书信息</h4>
    <form action="book/add" method="post" enctype="multipart/form-data">
        <p>图书名称：<input type="text" name="bookName"></p>
        <p>图书作者：<input type="text" name="bookAuthor"></p>
        <p>图书价格：<input type="text" name="bookPrice"></p>
        <p>图书封面：<input type="file" name="img"></p>
        <p><input type="submit" value="提交"></p>
    </form>
</body>
</html>
