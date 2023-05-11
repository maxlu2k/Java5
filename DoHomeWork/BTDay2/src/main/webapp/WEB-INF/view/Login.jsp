<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h2>Login</h2>
<form method="POST" action="/home">
   <p>Username: <input type="text" placeholder="Tên đăng nhập" name="user"></p>
    <p>Password: <input type="password" placeholder="Mật khẩu" name="pass" value="" id="myInput"></p>
    <input type="checkbox" onclick="myFunction()">Show Password
    <br>
    <button type="submit">Submit</button>
</form>
<p style="color: red">${statusLogin}</p>
</body>
<script>
    function myFunction() {
        var x = document.getElementById("myInput");
        if (x.type === "password") {
            x.type = "text";
        } else {
            x.type = "password";
        }
    }
</script>
</html>