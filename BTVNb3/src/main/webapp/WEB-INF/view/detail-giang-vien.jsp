<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Info</title>
</head>
<body>
ID: ${gv.id}
<br>
Mã: ${gv.ma}
<br/>
Tên: ${gv.ten}
<br/>
Tuổi: ${gv.tuoi}
<br/>
Giới Tính: <c:choose>
    <c:when test="${item.gioiTinh == 'Nam'}">Nữ</c:when>
    <c:otherwise>Nam</c:otherwise>
</c:choose>
<br/>
Địa Chỉ: ${gv.diaChi}
</body>
</html>
