<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <form action="">
        Tên: <input name="ten"/>
        <button type="submit">Search</button>
    </form>
    <br/>
    <button><a href="/sinh-vien/view-add">Add Student</a></button>
    <tr>
        <th>STT</th>
        <th>MSSV</th>
        <th>Tên</th>
        <th>Tuổi</th>
        <th>Địa chỉ</th>
        <th>Giới tính</th>
        <th colspan="2">Action</th>
    </tr>
    <c:forEach var="item" items="${sinhViens}" varStatus="loop">
        <tr>
            <td>${loop.index}</td>
            <td>${item.mssv}</td>
            <td>${item.ten}</td>
            <td>${item.tuoi}</td>
            <td>${item.diaChi}</td>
            <td>${item.gioiTinh}</td>
            <td>
                <a href="/sinh-vien/delete/${item.mssv}">Delete</a>
                <a href="/sinh-vien/detail/${item.mssv}">Detail</a>
                <a href="/sinh-vien/view-update/${mssv.mssv}">Update</a>
            </td>
        </tr>
    </c:forEach>
    </thead>
    <tbody>
    </tbody>
</table>
</body>
</html>
