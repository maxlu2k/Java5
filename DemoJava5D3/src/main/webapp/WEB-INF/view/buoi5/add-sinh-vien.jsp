<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--<form action="/sinh-vien/add" method="post">--%>
<%--    MSSV: <input type="text" name="mssv"/>--%>
<%--    <br/>--%>
<%--    Tên: <input type="text" name="ten"/>--%>
<%--    <br/>--%>
<%--    Tuổi: <input type="text" name="tuoi"/>--%>
<%--    <br/>--%>
<%--    Địa chỉ: <input type="text" name="diaChi"/>--%>
<%--    <br/>--%>
<%--    Giới tính:--%>
<%--    <input type="radio" name="gioiTinh" checked value="true"/>Nam--%>
<%--    <input type="radio" name="gioiTinh" value="false"/>Nữ--%>
<%--    <br/>--%>
<%--    <button type="submit">Add</button>--%>
<%--</form>--%>
<%--@elvariable id="sv1" type=""--%>
<form:form action="/sinh-vien/add" method="post" modelAttribute="sv1">
    MSSV:
    <form:input path="mssv"/>
    <form:errors path="mssv"/>
    <br>
    Tên:
    <form:input path="ten"/>
    <form:errors path="ten"/>
    <br>
    Tuổi:
    <form:input path="tuoi"/>
    <form:errors path="tuoi"/>
    <br>
    Địa Chỉ:
    <form:input path="diaChi"/>
<%--    <form:errors path="diaChi"/>--%>
    <br>
    Giới Tính:
    <form:radiobutton path="gioiTinh" checked="true" value="true"/> Nam
    <form:radiobutton path="gioiTinh" value="false"/> Nữ
    <br>
    <form:button type="submit">ADD</form:button>
</form:form>
</body>
</html>
