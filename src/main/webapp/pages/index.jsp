<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: olga
  Date: 15.06.19
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/saveUser" method="post">
    <input type="text" name="username" placeholder="username">
    <input type="submit" value="save">
    <select name="productId" >
        <c:forEach items="${products}" var="product">
        <option value="${product.productId}"> ${product.title} </option>
        </c:forEach>
    </select>

</form>

<form action="/saveProduct" method="post">

    <input type="text" name="title" placeholder="title">
    <input type="submit" value="save">

</form>

</body>
</html>
