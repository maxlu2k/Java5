<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DEMO DAY 2</title>
</head>
<body>
<h1>FPT Polytechnic</h1>
<br>
<form method="POST" action="/ket-qua">
    <input type="text" placeholder="Họ Tên" name="user">
    <input type="password" placeholder="Mật khẩu" name="pass">
    <br>
    <button type="submit">Ok</button>
</form>
<h3>${input}</h3>
<br>
<h3>${user}</h3>
<br>
<h3>${username}</h3>
</body>
</html>