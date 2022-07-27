<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<table width="100%" height="700">
    <tr>
        <td width="200px" style="border-right: deepskyblue 2px solid">
            <ul>
                <li><a href="book_add.jsp" target="mainFrame">添加图书</a></li>
                <li><a href="book_list.jsp" target="mainFrame">图书列表</a></li>
            </ul>
        </td>
        <td>
            <iframe name="mainFrame" width="100%" height="700" src="" frameborder="0"></iframe>
        </td>
    </tr>
</table>
</body>
</html>