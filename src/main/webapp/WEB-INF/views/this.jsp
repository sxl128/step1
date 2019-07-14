<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/24
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1 align="center"></h1>


<table>
    <tr>
        <td>${msg.id}</td>
    </tr>
    <tr>
        <td>${msg.userName}</td>
    </tr>
    <tr>
        <td>${msg.password}</td>
    </tr>
    <tr>
        <td>${msg.name}</td>
    </tr>
    <tr>
        <td>${msg.age}</td>
    </tr>
    <tr>
        <td>${msg.sex}</td>
    </tr>
    <tr>
        <%--fmt:formatDate :jstl的表达式，可以格式化日期和时间--%>
        <td><fmt:formatDate value="${msg.birthday}" pattern="yyyy年MM月dd日"/></td>
    </tr>
    <tr>
        <td><fmt:formatDate value="${msg.created}" pattern="yyyy年MM月dd日"/></td>
    </tr>
    <tr>
        <td><fmt:formatDate value="${msg.updated}" pattern="yyyy年MM月dd日"/></td>
    </tr>
</table>




</body>
</html>
