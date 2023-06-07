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
    <h1 class="text-center">Quản Lý Cơ Sở</h1>
    <br>
    <br>
    <a class="text-decoration-none" href="/co-so/hien-thi-table">
        <button class="btn btn-primary">Hiển thị</button>
    </a>
    <a class="text-decoration-none" href="/co-so/view-add">
        <button class="btn btn-success">Add</button>
    </a>
    <br>
    <br>
    <c:if test="${show == true}">
        <table class="table text-center">
            <tr>
                <th>#</th>
                <th>Mã cơ sở</th>
                <th>Mã tài khoản ngân hàng</th>
                <th>SĐT cơ sở</th>
                <th>Ghi chú</th>
                <th>Trạng thái</th>
                <th>Action</th>
            </tr>
            <c:forEach var="cs" items="${listCs.content}" varStatus="loop">
                <tr>
                    <td>${loop.index + 1}</td>
                    <td>${cs.ma}</td>
                    <td>${cs.taiKhoanNganHang.ma}</td>
                    <td>${cs.soDienThoai}</td>
                    <td>${cs.ghiChu}</td>
                    <td><c:if test="${cs.trangThai == 1}">
                        Hoạt động
                    </c:if>
                        <c:if test="${cs.trangThai == 0}">
                            Ngừng hoạt động
                        </c:if>
                    </td>
                    <td colspan="2">
                        <a class="text-decoration-none" href="/co-so/remove/${cs.id}">
                            <button class="btn btn-danger">Remove</button>
                        </a>
                        <a class="text-decoration-none" href="/co-so/view-update/${cs.id}">
                            <button class="btn btn-warning">Update</button>
                        </a>
                        <a class="text-decoration-none" href="/co-so/view-detail/${cs.id}">
                            <button class="btn btn-info">Detail</button>
                        </a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
    <nav aria-label="Page navigation example">
        <ul class="pagination">
            <li class="page-item d-flex">
                <c:forEach begin="0" end="${listCs.totalPages -1}" varStatus="loop">
                    <a class="page-link" href="/co-so/hien-thi-table?pageNo=${loop.begin + loop.count -1}">
                        ${loop.begin + loop.count}
                    </a>
                </c:forEach>

            </li>
        </ul>
    </nav>
    <div>
        <c:if test="${listCs.number != 0}">
            <a href="/co-so/hien-thi-table?pageNo=${listCs.number - 1}">
                <button>Pre</button>
            </a>
        </c:if>
        <c:if test="${listCs.hasNext()}">
            <a href="/co-so/hien-thi-table?pageNo=${listCs.number + 1}">
                <button>Next</button>
            </a>
        </c:if>
    </div>
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