<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<table>
    <tr>
        <th>Category ID</th>
        <th>Category code</th>
        <th>Category name</th>
        <th>Action</th>
    </tr>
    <c:forEach var="it" items="${ct}">
    <tr>
        <td>${it.id}</td>
        <td>${it.categoryCode}</td>
        <td>${it.categoryName}</td>
        <td colspan="2">
            <a><button>Edit</button></a>
            <a><button>Remove</button></a>
        </td>
    </tr>
    </c:forEach>
</table>
</body>
</html>