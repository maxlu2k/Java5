<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<table>
    <tr>
        <th>Product id</th>
        <th>Product name</th>
        <th>Product code</th>
        <th>Product price</th>
        <th>Category code</th>
        <th>Category name</th>
        <th colspan="2">Action</th>
    </tr>
    <c:forEach var="p" items="${listProduct}">
        <tr>
            <td>${p.id}</td>
            <td>${p.productName}</td>
            <td>${p.productCode}</td>
            <td>${p.price}</td>
            <td>${p.category.categoryCode}</td>
            <td>${p.category.categoryName}</td>
            <td></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>