<%--
  Created by IntelliJ IDEA.
  User: susu
  Date: 13/12/2021
  Time: 5:00 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/trans" method="post">
    <input type="text" name="word">
    <button>Translate</button>
</form>
<h3>Result : ${transResult}</h3>
</body>
</html>
