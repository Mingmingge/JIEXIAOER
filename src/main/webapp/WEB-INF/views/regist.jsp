<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width:device-width initial-scale:1.0">
    <title>注册</title>
    <link rel="stylesheet" type="text/css" href="/css/regist.css"/>
    <script type="text/javascript" src="/styles/jquery-3.2.1.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("input[name='pwd']").blur(function () {
                var pwd=$(this).val();
                var l=pwd.length;
                if(l>8&&l<15){$("#tishi_pwd").html("");}
                else{$("#tishi_pwd").html("密码在8～15位!");}
            })
        })
        $(function () {
            $("input[name='p']").blur(function () {
                var q=$(this).val();
                var pwd=$("input[name='pwd']").val();
                if(q==pwd){$("#tishi_que").html("");}
                if(!(q==pwd)){$("#tishi_que").html("两次密码不一致!");}
            })
        })
        //邮箱验证
        $(function () {
            $("input[name='email']").blur(function () {
                var email=$(this).val();
                var a=email.indexOf("@");
                var b=email.indexOf(".com");
                if(a>0&&b>0){
                    $("input[name='email']").html(" ");
                    $.ajax({
                        url:"/regist/email",
                        data:{
                          email:$(this).val()
                        },
                        type:"POST",
                        dataType:"json",
                        success:function (data) {

                            alert(data.result);

                        },
                        error:function (er) {

                        }
                    })
                }
                if(!(a>0&&b>0)){
                    $("#tishi_you").html("邮箱格式不正确!");
                }
            })
        })
        //test for name
        $(function () {
            $("input[name='name']").blur(function () {
                $.ajax({
                    url:"/regist/name",
                    data:{
                        name:$(this).val()
                    },
                    type:"POST",
                    dataType:"json",
                    success:function (data) {
                        $("#tishi_name").html(data.result);
                        //alert(data.result);
                    },
                    error:function (er) {

                    }
                })

            })
        })
        //邮箱验证码验证
    </script>

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
