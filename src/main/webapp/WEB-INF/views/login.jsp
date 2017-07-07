<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">  
<head>  
    <meta charset="UTF-8">  
    <title>Login</title>  
    <link rel="stylesheet" type="text/css" href="/css/Login.css"/>
</head>  
<body>  
    <div id="login">  
        <h1>Sign&nbsp;In</h1>
        <form method="post" action="/login/in">
            <input type="text" required="required" placeholder="用户名" name="name">
            <input type="password" required="required" placeholder="密码" name="pwd">
            <button class="but" type="submit">登录</button>  
        </form>  
    </div>  
</body>  
</html>  
