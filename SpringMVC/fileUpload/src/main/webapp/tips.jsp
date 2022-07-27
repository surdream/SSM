<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>tips</h3>
    <p>图书名称：${book.bookName}</p>
    <p>图书作者：${book.bookAuthor}</p>
    <p>图书价格：${book.bookPrice}</p>
    <img src="${book.bookImage}" alt="图片" height="200">
${tips}
</body>
</html>
