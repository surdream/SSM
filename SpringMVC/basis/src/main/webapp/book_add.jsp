<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<h2>添加图书</h2>
<form action="test/add" method="post">
    <p>
        <label for="name">图书名称：</label>
        <input type="text" id="name" name="bookName">
    </p>
    <p>
        <label for="author">图书作者：</label>
        <input type="text" id="author" name="bookAuthor">
    </p>
    <p>
        <label for="price">图书价格：</label>
        <input type="text" id="price" name="bookPrice">
    </p>
    <p>
        <label for="publish">出版时间：</label>
        <input type="text" id="publish" name="publishTime">
    </p>
    <input type="submit" value="提交">

</form>
<h3>超链接提交</h3>
<a href="/book/add">超链接提交</a>

<h3>ajax提交</h3>
<input type="submit" value="提交" id="btn">
</body>
<script type="text/javascript" src="js/jquery-3.6.0.js"></script>
<script type="text/javascript">
    $("#btn").click(function (){
        console.log("ok");
        let obj = {
            bookId:10001,
            bookName:"java",
            bookAuthor:"张三",
            bookPrice:36.99
        };
        $.ajax({
            url:"book/body",
            type:"post",
            contentType:"application/json",
            data:JSON.stringify(obj),
            // dataTypes:"json",
            success:function (res){
                console.log(res);
            }
        })
    });
</script>
</html>
