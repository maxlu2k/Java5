<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/giang-vien/search" method="GET" style="border: 1px solid black; max-width: 300px;padding: 10px; margin: 0px">
        Tên: <input name="ten"/>
        <br>
        <button type="submit">Search</button>
    </form>
    <div style="padding: 9px">
        <a href="/giang-vien/view-add"><button>Add</button></a>
        <a href="/giang-vien/giang-vien-nu"><button>Giảng viên nữ</button></a>
    </div>
    <table>
        <tr>
            <th>ID</th>
            <th>Mã</th>
            <th>Tên</th>
            <th>Tuổi</th>
            <th>Giới tính</th>
            <th>Địa chỉ</th>
            <th colspan="2">Action</th>
        </tr>
        <c:forEach var="item" items="${giangViens}" varStatus="loop">
            <tr>
                <td>${item.id}</td>
                <td>${item.ma}</td>
                <td>${item.ten}</td>
                <td>${item.tuoi}</td>
                <td><c:choose>
                    <c:when test="${item.gioiTinh == 'Nam'}">Nữ</c:when>
                    <c:otherwise>Nam</c:otherwise>
                </c:choose></td>
                <td>${item.diaChi}</td>
                <td>
                    <a href="/giang-vien/detail/${item.ma}"><button>Detail</button></a>
                    <a href="/giang-vien/view-update/${item.ma}"><button>Edit</button></a>
                    <a href="/giang-vien/delete/${item.ma}"><button>Remove</button></a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
<style>
    table, th, td {
        border: 1px solid black;
    }
</style>
</html>
