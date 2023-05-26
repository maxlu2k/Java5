<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>QUẢN LÝ THỰC VẬT</h1>

<form action="" method="get">
   <input type="text" value="${tvv.ma}" >
   <input type="text" value="${tvv.ten}" >
   <input type="text" value="${tvv.chieuCao}" >
   <input type="text" value="${tvv.loai}" >
    <a><button type="submit">Add</button></a>
</form>


</body>
</html>