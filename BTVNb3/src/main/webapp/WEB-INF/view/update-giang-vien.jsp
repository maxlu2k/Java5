<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Info</title>
</head>
<body>
<form action="/giang-vien/update" method="POST">
    <p>ID: <input type="text" disabled value="${gv.id}"></p>
    <p>Mã: <input type="text" value="${gv.ma}"></p>
    <p>Tên: <input type="text" value="${gv.ten}"></p>
    <p>Tuổi: <input type="text" value="${gv.tuoi}"></p>
    <p>Giới tính:
        <input type="radio" name="gioiTinh" value="true" ${gv.gioiTinh?'checked':''}/>Nam
        <input type="radio" name="gioiTinh" value="false" ${!gv.gioiTinh?'checked':''}/>Nữ
    </p>
    <p>Địa Chỉ: <input type="text" value="${gv.diaChi}"></p>
        <button>Submit</button>
    </a>
</form>

</body>
</html>
