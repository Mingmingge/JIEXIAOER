<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width:device-width initial-scale:1.0">
    <title>注册</title>
    <link rel="stylesheet" type="text/css" href="/css/regist.css"/>
    <script type="text/javascript" src="/styles/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="/js/regist.js"></script>
</head>
<body>
<div id="login">
    <h1>Sign&nbsp;Up</h1>
    <form action="/regist/re" method="post">
        <table>
            <tr>

                <td>
                    <input type="text"placeholder="用户名" required="required" name="name" autofocus="autofocus" id="name">
                </td>
            </tr>
            <tr>
                <td class="tishi" >
                    <p id="tishi_name"></p>
                </td>
            </tr>
            <tr>

                <td>
                    <input type="password" required="required" placeholder="密码" name="pwd" id="pwd">
                </td>
            </tr>
            <tr>
                <td class="tishi">
                    <p id="tishi_pwd"></p>
                </td>
            </tr>
            <tr>

                <td>
                    <input type="password" required="required" placeholder="确认密码" name="p">
                </td>
            </tr>
            <tr>
                <td class="tishi">
                    <p id="tishi_que"></p>
                </td>
            </tr>
            <tr>

                <td>
                    <input type="text" placeholder="邮箱" name="email" id="email">
                </td>

            </tr>
            <tr>
                <td class="tishi">
                <p id="tishi_you"></p>
                </td>
            </tr>
            <tr>

                <td>
                    <input type="text" placeholder="邮箱验证码" name="yanzheng" id="yanzheng">
                </td>
            </tr>
            <tr>
                <td class="tishi">
                 <p id="yan">${result}</p>
                </td>
            </tr>
        </table>
        <button class="but" type="submit">注册</button>
    </form>
</div>
</body>
</html>
