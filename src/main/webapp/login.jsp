<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<form action="/auth/login" method="post">
    <label >
        Username: <input type="text" name="username">
    </label>
    <br>
    <br>
    <label >
        Password: <input type="password" name="password">
    </label>
    <br>
    <br>
    <button type="submit">Login</button>
</form>
</body>
</html>
