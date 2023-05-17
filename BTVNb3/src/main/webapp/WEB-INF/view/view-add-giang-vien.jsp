<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/giang-vien/add" method="post">
    MSSV: <input type="text" name="ma"/>
    <span style="color: red">${errStatus}</span>
    <br/>
    Tên: <input type="text" name="ten"/>
    <span style="color: red">${errStatus}</span>
    <br/>
    Tuổi: <input type="text" name="tuoi"/>
    <span style="color: red">${errStatus} ${errStatusTuoi}</span>
    <br/>
    Địa chỉ: <input type="text" name="diaChi"/>
    <span style="color: red">${errStatus}</span>
    <br/>
    Giới tính:
    <input type="radio" name="gioiTinh" checked value="true"/>Nam
    <input type="radio" name="gioiTinh" value="false"/>Nữ
    <br/>
    <button type="submit">Add</button>
</form>
</body>
</html>
