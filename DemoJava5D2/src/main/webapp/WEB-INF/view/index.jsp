<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DEMO DAY 2</title>
</head>
<body>
<h1>Login</h1>
<form method="POST" action="/ket-qua">
    <p>Username: <input type="text" placeholder="Họ Tên" name="user"></p>
    <p>Password: <input type="password" placeholder="Mật khẩu" name="pass"></p>
    <br>
    <button type="submit">Submit</button>
</form>
<h3>${input}</h3>
<br>
<h3>${user}</h3>
<br>
<h3>${username}</h3>
</body>
</html>