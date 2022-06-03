<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>index</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/account/findAll">测试查询</a>
<form action="${pageContext.request.contextPath}/account/save" method="post">
    姓名:<input type="text" name="name"/><br/>
    金额:<input type="text" name="money"/><br/>
    <input type="submit" value="保存"/> <br/>
</form>
</body>
</html>