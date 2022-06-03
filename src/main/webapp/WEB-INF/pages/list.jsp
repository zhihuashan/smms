<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: youda
  Date: 2022/5/22
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>list</title>
</head>
<body>
<h3>查询用户信息全部结果</h3>
<c:forEach items="${accountList}" var="a">
    <tr>
        <td>${a.id}</td>
        <td>${a.name}</td>
        <td>${a.money}</td>
    </tr>
</c:forEach>
</body>
</html>
