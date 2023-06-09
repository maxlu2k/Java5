<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thực Vật</title>
</head>
<body>
<form action="/thuc-vat/tim-kiem" method="get" style="width: 300px;border: 1px solid black;padding: 10px">
    <p>Tên: <input type="text" name="ten1"></p>
    <p>Số tuổi Min: <input type="text" name="min"></p>
    <p>Số tuổi Max: <input type="text" name="max"></p>
    <a href="">
        <button type="submit">Search</button>
    </a>
</form>
<form:form action="/thuc-vat/add" method="post" modelAttribute="tv1">
    <p>ID: <form:input path="id"/></p>
    <p>Loại cây: <form:input path="loaiCay"/></p>
    <span><form:errors path="loaiCay"/> </span>
    <p>Tên: <form:input path="ten"/></p>
    <span><form:errors path="ten"/> </span>
    <p>Tuổi: <form:input path="tuoi"/></p>
    <span><form:errors path="tuoi"/> </span>
    <p>Giới tính: <form:radiobutton path="gioiTinh" value="true" checked="true"/> Nam | <form:radiobutton
            path="gioiTinh" value="false"/> Nữ</p>
    <p>Khu vực: <form:input path="khuVuc"/></p>
    <span><form:errors path="khuVuc"/> </span>
    <form:button>Add</form:button>
</form:form>
<br>
<table style="border: 1px solid black;text-align: center">
    <tr>
        <th>STT</th>
        <th>Tên</th>
        <th>Loại</th>
        <th>Số tuổi</th>
        <th>Khu vực</th>
        <th>Giới tính</th>
        <th>Action</th>
    </tr>
    <c:forEach var="items" items="${tv}">
        <tr>
            <td>${items.id}</td>
            <td>${items.ten}</td>
            <td>${items.loaiCay}</td>
            <td>${items.tuoi}</td>
            <td>${items.khuVuc}</td>
            <td>${items.gioiTinh}</td>
            <td colspan="2">
                <a href="/thuc-vat/update/">
                    <button>Update</button>
                </a>
                <a href="/thuc-vat/delete/${items.id}">
                    <button>Remove</button>
                </a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>