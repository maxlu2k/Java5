<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Info</title>
</head>
<body>
<form>
<p>ID: <input type="text" disabled value="${gv.id}"></p>
<p>Mã: <input type="text" value="${gv.ma}"></p>
<p>Tên: <input type="text" value="${gv.ten}"></p>
<p>Tuổi: <input type="text" value="${gv.tuoi}"></p>
<br/>
<%--Giới Tính: <c:choose>--%>
<%--    <c:when test="${item.gioiTinh == 'Nam'}">Nữ</c:when>--%>
<%--    <c:otherwise>Nam</c:otherwise>--%>
<%--</c:choose>--%>
<p>Nam: <input type="radio" value="false"  ${gv.gioiTinh?'checked':''} ></p>
<p>Nữ: <input type="radio" value="true" ${!gv.gioiTinh?'checked':''}></p>
<p>Địa Chỉ: <input type="text" value="${gv.diaChi}"></p>
    <a href=""><button>Submit</button></a>
</form>

</body>
</html>
