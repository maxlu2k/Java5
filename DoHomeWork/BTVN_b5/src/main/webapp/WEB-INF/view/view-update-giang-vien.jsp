<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/giang-vien/update" method="post" style="border: 1px solid black; padding: 10px; max-width: 400px">
    <div class="grid-container">
        <div class="grid-item">
            MSSV: <input type="text" value="${gvv.maGV}"/>
            <%--    <form:errors path="maGV"/>--%></div>
        <div class="grid-item">
            Tên: <input type="text" value="${gvv.ten}"/>
            <%--    <form:errors path="ten"/>--%></div>
        <div class="grid-item">
            Tuổi: <input type="text" value="${gvv.tuoi}"/>
            <%--    <form:errors path="tuoi"/>--%></div>
        <div class="grid-item">
            Quê Quán: <input type="text" value="${gvv.queQuan}"/>
            <%--    <form:errors path="queQuan"/>--%></div>
    </div>
    <br>
    <button type="submit">ADD</button>
</form>
<form:form action="/giang-vien/update" method="post" modelAttribute="gv1" style="border: 1px solid black; padding: 10px; max-width: 400px">
    <div class="grid-container">
        <div class="grid-item">
            Mã-GV: <form:input path="maGV" value="${gvv.maGV}"/>
                <%--    <form:errors path="maGV"/>--%></div>
        <div class="grid-item">
            Tên: <form:input path="ten" value="${gvv.ten}"/>
                <%--    <form:errors path="ten"/>--%></div>
        <div class="grid-item">
            Tuổi: <form:input path="tuoi" value="${gvv.tuoi}"/>
                <%--    <form:errors path="tuoi"/>--%></div>
        <div class="grid-item">
            Quê Quán: <form:input path="queQuan" value="${gvv.queQuan}"/>
                <%--    <form:errors path="queQuan"/>--%></div>
    </div>
    <br>
    <form:button type="submit">ADD</form:button>
</form:form>
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
