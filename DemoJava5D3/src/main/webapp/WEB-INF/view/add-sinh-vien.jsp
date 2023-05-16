<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/sinh-vien/add" method="post">
    MSSV: <input type="text" name="mssv"/>
    <br/>
    Tên: <input type="text" name="ten"/>
    <br/>
    Tuổi: <input type="text" name="tuoi"/>
    <br/>
    Địa chỉ: <input type="text" name="diaChi"/>
    <br/>
    Giới tính:
    <input type="radio" name="gioiTinh" checked value="true"/>Nam
    <input type="radio" name="gioiTinh" value="false"/>Nữ
    <br/>
    <button type="submit">Add</button>
</form>
</body>
</html>
