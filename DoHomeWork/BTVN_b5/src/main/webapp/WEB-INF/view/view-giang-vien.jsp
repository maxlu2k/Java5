<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/giang-vien/search" style="border: 1px solid black; padding: 10px; max-width: 300px">
        <p>Tên: <input name="ten"/></p>
        <p>Tuổi</p>
        <p>Min: <input name="min"></p>
        <p>Max: <input name="max"></p>
        <button type="submit">Search</button>
    </form>
<%--    <form action="" method="post" style="border: 1px solid black; padding: 10px; max-width: 400px">--%>
<%--        <div class="grid-container">--%>
<%--            <div class="grid-item">--%>
<%--                MSSV: <input type="text" value="${gvv.maGV}"/>--%>
<%--                    &lt;%&ndash;    <form:errors path="maGV"/>&ndash;%&gt;</div>--%>
<%--            <div class="grid-item">--%>
<%--                Tên: <input type="text" value="${gvv.ten}"/>--%>
<%--                    &lt;%&ndash;    <form:errors path="ten"/>&ndash;%&gt;</div>--%>
<%--            <div class="grid-item">--%>
<%--                Tuổi: <input type="text" value="${gvv.tuoi}"/>--%>
<%--                    &lt;%&ndash;    <form:errors path="tuoi"/>&ndash;%&gt;</div>--%>
<%--            <div class="grid-item">--%>
<%--                Quê Quán: <input type="text" value="${gvv.queQuan}"/>--%>
<%--                    &lt;%&ndash;    <form:errors path="queQuan"/>&ndash;%&gt;</div>--%>
<%--        </div>--%>
<%--        <br>--%>
<%--        <button type="submit">ADD</button>--%>
<%--    </form>--%>
    <form:form action="/giang-vien/add" method="post" modelAttribute="gv1" style="border: 1px solid black; padding: 10px; max-width: 400px">
        <div class="grid-container">
            <div class="grid-item">
                Mã-GV: <form:input path="maGV" value="${gvv.maGV}"/>
                        <form:errors path="maGV"/>
            </div>
            <div class="grid-item">
                Tên: <form:input path="ten" value="${gvv.ten}"/>
                        <form:errors path="ten"/>
            </div>
            <div class="grid-item">
                Tuổi: <form:input path="tuoi" value="${gvv.tuoi}"/>
                        <form:errors path="tuoi"/>
            </div>
            <div class="grid-item">
                Quê Quán: <form:input path="queQuan" value="${gvv.queQuan}"/>
                        <span><form:errors path="queQuan"/></span>
            </div>
        </div>
        <br>
        <form:button type="submit">ADD</form:button>
    </form:form>
<table>
    <tr>
        <th>MãGV</th>
        <th>Họ tên</th>
        <th>Tuổi</th>
        <th>Quê quán</th>
        <th colspan="3">Action</th>
    </tr>
    <c:forEach var="item" items="${gv}" varStatus="loop">
        <tr>
            <td>${item.maGV}</td>
            <td>${item.ten}</td>
            <td>${item.tuoi}</td>
            <td>${item.queQuan}</td>
            <td>
                <a href="/giang-vien/detail/${item.maGV}">
                    <button>Detail</button>
                </a>
                <a href="/giang-vien/view-update/${item.maGV}">
                    <button>Update</button>
                </a>
                <a href="/giang-vien/delete/${item.maGV}">
                    <button>Delete</button>
                </a>
            </td>
        </tr>
    </c:forEach>
</table>
    <p style="color: green">${status}</p>
    <p>Mã GV: ${gvMoi.maGV}</p>
    <p>Họ Tên: ${gvMoi.ten}</p>
    <p>Tuổi: ${gvMoi.tuoi}</p>
    <p>Quê Quán: ${gvMoi.queQuan}</p>
</body>
<style>
    table, th, td {
        border: 1px solid black;
        text-align: center;
    }
    .grid-container {
        display: grid;
        grid-template-columns: auto auto;
        padding: 5px;
        max-width: 500px;
    }
    .grid-item {
        padding: 5px;
    }
    a{
        text-decoration: none;
    }
    span{
        color: red;
    }
</style>
</html>
<%--<form:form action="" method="post" modelAttribute="gv1" style="border: 1px solid black; padding: 10px; max-width: 400px">--%>
<%--    <div class="grid-container">--%>
<%--        <div class="grid-item">--%>
<%--            MSSV: <form:input path="maGV"/>--%>
<%--                &lt;%&ndash;    <form:errors path="maGV"/>&ndash;%&gt;</div>--%>
<%--        <div class="grid-item">--%>
<%--            Tên: <form:input path="ten" value="${gv.ten}"/>--%>
<%--                &lt;%&ndash;    <form:errors path="ten"/>&ndash;%&gt;</div>--%>
<%--        <div class="grid-item">--%>
<%--            Tuổi: <form:input path="tuoi"/>--%>
<%--                &lt;%&ndash;    <form:errors path="tuoi"/>&ndash;%&gt;</div>--%>
<%--        <div class="grid-item">--%>
<%--            Quê Quán: <form:input path="queQuan"/>--%>
<%--                &lt;%&ndash;    <form:errors path="queQuan"/>&ndash;%&gt;</div>--%>
<%--    </div>--%>
<%--    <br>--%>
<%--    <form:button type="submit">ADD</form:button>--%>
<%--</form:form>--%>
