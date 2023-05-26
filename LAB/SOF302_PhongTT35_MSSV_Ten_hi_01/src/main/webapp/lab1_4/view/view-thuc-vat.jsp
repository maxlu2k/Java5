<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>QUẢN LÝ THỰC VẬT</h1>
<form action="" method="get">
    <p>Search</p>
    <input type="text" placeholder="Tên hoặc mã">
    <br>
    <input type="text" placeholder="Cân nặng max">
    <br>
    <input type="text" placeholder="Cân nặng min">
    <a><button type="submit">Add</button></a>
</form>
<form:form method="post" modelAttribute="tv1">
    <p>Mã : <form:input path="ma"/></p>
    <form:errors path="ma"/>
    <p>Loại cây : <form:input path="loai"/></p>
    <form:errors path="loai"/>
    <p>Tên : <form:input path="ten"/></p>
    <form:errors path="ten"/>
    <p>Chiều cao: <form:input path="chieuCao"/></p>
    <form:errors path="chieuCao"/>
    <p>Giới tính : <form:radiobutton path="gioiTinh" value="true" checked="true"/> Hoạt động <form:radiobutton path="gioiTinh" value="true" checked="true"/> Ngừng hoạt động</p>
    <form:button>Add</form:button>
</form:form>

<table>
    <tr>
        <th>#</th>
        <th>Mã</th>
        <th>Tên</th>
        <th>Giới tính</th>
        <th>Chiều cao</th>
        <th>Loại cây</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${tv}" var="items" varStatus="loop">
    <tr>
        <td></td>
        <td>${items.ma}</td>
        <td>${items.ten}</td>
        <td>${items.gioiTinh}</td>
        <td>${items.chieuCao}</td>
        <td>${items.loai}</td>
        <td colspan="2">
            <a href="/thuc-vat/view-update/${items.ma}"><button>Update</button></a>
            <a href="/thuc-vat/delete/${items.ma}">Remove</a>
        </td>
    </tr>
    </c:forEach>
</table>

</body>
</html>