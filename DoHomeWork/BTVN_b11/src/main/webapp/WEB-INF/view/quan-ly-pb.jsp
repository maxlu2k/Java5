<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>PhongBan</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</head>
<body>
<%--<form action="/lop-hoc/search" method="GET">--%>
<%--    <p>Tên lớp học: <input type="text" name="ten"></p>--%>
<%--    <p>Địa điểm lớp học: <input type="text" name="diaDiem"></p>--%>
<%--    <button type="submit">Search</button>--%>
<%--</form>--%>
<%--<form:form action="/lop-hoc/add" method="post" modelAttribute="lh">--%>
<%--    <p>ID lớp:  <form:input path="id" disabled="true"/></p>--%>
<%--    <p>Tên lớp: <form:input path="name"/></p>--%>
<%--    <p>Địa điểm lớp học: <form:input path="diaDiemLopHoc"/></p>--%>
<%--    <button type="submit">Add</button>--%>
<%--</form:form>--%>
<div class="container">

    <h2>QUẢN LÝ PHÒNG BAN</h2>
    <%--    <form>--%>
    <%--        <div class="mb-3">--%>
    <%--            <label for="maPB" class="form-label">Mã phòng ban</label>--%>
    <%--            <input type="text" class="form-control" id="maPB" aria-describedby="emailHelp">--%>
    <%--            <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>--%>
    <%--        </div>--%>
    <%--        <div class="mb-3">--%>
    <%--            <label for="tenPB" class="form-label">Tên phòng ban</label>--%>
    <%--            <input type="text" class="form-control" id="tenPB">--%>
    <%--        </div>--%>
    <%--        <div class="mb-3">--%>
    <%--            <label for="soLuong" class="form-label">Số lượng phòng ban</label>--%>
    <%--            <input type="text" class="form-control" id="soLuong">--%>
    <%--        </div>--%>
    <%--        <div class="mb-3">--%>
    <%--            <label for="nhanVien" class="form-label">Số lượng nhân viên</label>--%>
    <%--            <input type="text" class="form-control" id="nhanvien">--%>
    <%--        </div>--%>
    <%--        <div class="mb-3">--%>
    <%--            <label class="form-label">Trang thái</label>--%>
    <%--            <div class="form-check">--%>
    <%--                <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1">--%>
    <%--                <label class="form-check-label" for="flexRadioDefault1">--%>
    <%--                    Hoạt động--%>
    <%--                </label>--%>
    <%--            </div>--%>
    <%--            <div class="form-check">--%>
    <%--                <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2" checked>--%>
    <%--                <label class="form-check-label" for="flexRadioDefault2">--%>
    <%--                    Ngừng hoạt động--%>
    <%--                </label>--%>
    <%--            </div>--%>
    <%--        </div>--%>
    <%--        <div class="mb-3">--%>
    <%--            <label class="form-label">Mã loại phòng ban</label>--%>
    <%--            <select class="form-select" aria-label="Default select example">--%>
    <%--                <option selected>Open this select menu</option>--%>
    <%--                <option value="1">One</option>--%>
    <%--                <option value="2">Two</option>--%>
    <%--                <option value="3">Three</option>--%>

    <%--            </select>--%>
    <%--        </div>--%>
    <%--        <button type="submit" class="btn btn-success">Add</button>--%>
    <%--        <button type="submit" class="btn btn-primary">Hiển thị</button>--%>
    <%--    </form>--%>
    <form:form modelAttribute="pb">
        <p>Mã phòng ban
            <form:input path="ma"/></p>
        <p>Tên
            <form:input path="ten"/></p>
        <p>Số lượng phòng ban
        <form:input path="soLuongPhongBan"/></p>
        <p>Số lượng nhân viên
        <form:input path="soLuongNhanVien"/></p>
        <p>Trạng thái
        <form:radiobutton path="trangThai" check="true"/>
        <form:radiobutton path="trangThai"/></p>
        <p>Mã loại phòng ban
            <form:select path="loaiPhongBan">
                <form:options items="${loaiPBList}" itemValue="ma" itemLabel="ten" />
            </form:select>
    </form:form>

    <table class="text-center">
        <tr>
            <th>#</th>
            <th>Mã</th>
            <th>Phòng ban</th>
            <th>Số lượng phòng ban</th>
            <th>Số lượng nhân viên</th>
            <th>Trang thái</th>
            <th>Tên loại phòng ban</th>
            <th>Action</th>
        </tr>
        <c:forEach var="it" items="${listPB.content}" varStatus="loop">
            <tr>
                <td>${loop.index}</td>
                <td>${it.ma}</td>
                <td>${it.ten}</td>
                <td>${it.soLuongPhongBan}</td>
                <td>${it.soLuongNhanVien}</td>
                <td>${it.trangThai}</td>
                <td>${it.loaiPhongBan.ten}</td>
                <td colspan="2">
                    <a class="text-decoration-none" href="/lop-hoc/update/${it.ma}">
                        <button class="btn btn-primary">Edit</button>
                    </a>
                    <a class="text-decoration-none" href="/lop-hoc/remove/${it.ma}">
                        <button class="btn btn-danger">Remove</button>
                    </a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div>
        <c:if test="${listPB.number != 0}">
            <a href="/phong-ban/hien-thi-p?p=${listPB.number - 1}">
                <button>Pre</button>
            </a>
        </c:if>

        <c:if test="${listPB.hasNext()}">
            <a href="/phong-ban/hien-thi-p?p=${listPB.number + 1}">
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

    /*form {*/
    /*    border: 1px solid black;*/
    /*    padding: 5px;*/
    /*    max-width: 350px;*/
    /*}*/

    .actionRe {
        background-color: red;
        color: white;
        border-bottom-color: white;
    }

    .actionEd {
        background-color: dodgerblue;
        color: white;
        border-bottom-color: white;
    }
</style>
</html>