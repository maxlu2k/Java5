<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>LopHoc</title>
</head>
<body>
<form action="/lop-hoc/search" method="GET">
    <p>Tên lớp học: <input type="text" name="ten"></p>
    <p>Địa điểm lớp học: <input type="text" name="diaDiem"></p>
    <button type="submit">Search</button>
</form>
<form:form action="/lop-hoc/add" method="post" modelAttribute="lh">
<p>ID lớp:  <form:input path="id" disabled="true"/></p>
<p>Tên lớp: <form:input path="name"/></p>
<p>Địa điểm lớp học: <form:input path="diaDiemLopHoc"/></p>
<button type="submit">Add</button>
</form:form>
<br>
<br>
<table>
    <tr>
        <th>ID Lớp Hoc</th>
        <th>Tên Lớp Học</th>
        <th>Địa Điểm Lớp Học</th>
        <th>Action</th>
    </tr>
    <c:forEach var="it" items="${lops.content}">
        <tr>
            <td>${it.id}</td>
            <td>${it.name}</td>
            <td>${it.diaDiemLopHoc}</td>
            <td colspan="2">
                <a href="/lop-hoc/update/${it.id}"><button>Edit</button></a>
                <a href="/lop-hoc/remove/${it.id}"><button>Remove</button></a>
            </td>
        </tr>
    </c:forEach>
</table>
<div>
    <c:if test="${lops.number != 0}">
        <a href="/lop-hoc/page?p=${lops.number - 1}"><button>Pre</button></a>
    </c:if>

    <c:if test="${lops.hasNext()}">
        <a href="/lop-hoc/page?p=${lops.number + 1}"><button>Next</button></a>
    </c:if>
</div>
</body>
<style>
    table, th, td {
        border: 1px solid black;
    }
    form {
        border: 1px solid black;
        padding: 5px;
        max-width: 350px;
    }
</style>
</html>