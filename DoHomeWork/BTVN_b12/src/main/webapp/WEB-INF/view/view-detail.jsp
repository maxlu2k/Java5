<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Quản Lý Cơ Sở</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <h1 class="text-center">DETAIL</h1>
    <br>
    <br>
    <form>
        <div class="form-group">
            <label>Mã cơ sở:</label>
            ${coSo.ma}
        </div>
        <div class="form-group">
            <label>Mã tài khoản ngân hàng:</label>
            ${coSo.taiKhoanNganHang.ma}
        </div>
        <div class="form-group">
            <label>Mã cơ sở:</label>
            ${coSo.ma}
        </div>
        <div class="form-group">
            <label>Số điện thoại cơ sở:</label>
            ${coSo.soDienThoai}
        </div>
        <div class="form-group">
            <label>Ghi chú:</label>
            ${coSo.ghiChu}
        </div>
        <div class="form-group">
            <label>Trạng thái:</label>
            <td><c:if test="${coSo.trangThai == 1}">
                Hoạt động
            </c:if>
                <c:if test="${coSo.trangThai == 0}">
                    Ngừng hoạt động
                </c:if>
            </td>
        </div>
        <a href="/co-so/hien-thi-table" class="btn btn-secondary">Quay lại</a>
    </form>
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