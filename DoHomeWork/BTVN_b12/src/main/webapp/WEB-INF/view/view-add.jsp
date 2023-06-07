<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Quản Lý Cơ Sở (add)</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <h1 class="text-center">Quản Lý Cơ Sở</h1>
    <br>
    <br>
    <form:form action="/co-so/add" method="post" modelAttribute="modelList">
        <div class="form-group">
            <label for="ma">Mã cơ sở:</label>
            <form:input path="ma" class="form-control" id="ma"/>
        </div>
        <div class="form-group">
            <label for="taiKhoanNganHang.ma">Mã tài khoản ngân hàng:</label>
            <form:select path="taiKhoanNganHang" class="form-control" id="taiKhoanNganHang.ma">
                <c:forEach items="${danhSachTaiKhoanNganHang}" var="tknh">
                    <form:option value="${tknh.id}">${tknh.ma}</form:option>
                </c:forEach>
            </form:select>
        </div>
        <div class="form-group">
            <label for="soDienThoai">Số điện thoại cơ sở:</label>
            <form:input path="soDienThoai" class="form-control" id="soDienThoai"/>
        </div>
        <div class="form-group">
            <label for="ghiChu">Ghi chú:</label>
            <form:input path="ghiChu" class="form-control" id="ghiChu"/>
        </div>
        <div class="form-group">
            <label>Trạng thái:</label>
            <div class="form-check">
                <form:radiobutton path="trangThai" value="1" class="form-check-input" id="trangThai1"/>
                <label for="trangThai1" class="form-check-label">Hoạt động</label>
            </div>
            <div class="form-check">
                <form:radiobutton path="trangThai" value="0" class="form-check-input" id="trangThai2"/>
                <label for="trangThai2" class="form-check-label">Ngừng hoạt động</label>
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Thêm</button>
        <a href="/co-so/hien-thi-table" class="btn btn-secondary">Hủy</a>
    </form:form>
</div>
</body>
</html>
