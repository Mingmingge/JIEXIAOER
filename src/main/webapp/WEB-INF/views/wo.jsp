<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <title>我的主页</title>
    <link rel="stylesheet" href="styles/bootstrap.min.css">
    <link rel="stylesheet" href="css/wo.css">
    <script src="styles/jquery-3.2.1.min.js"></script>
    <script src="styles/bootstrap.min.js"></script>
</head>
<body>
<div class="con" id="con">
    <div class="left" id="left">
        <div class="le_co" id="name_pic">
            <div class="pic" id="pic">
                <img src="images/touxiang.jpeg" class="img-circle" style="width: 100%;height: 100%">
            </div>
            <div class="name" id="name">

 👤 mingmingge          </div>
        </div>
        <div class="le_co" id="to_you">
                我的回复
        </div>
        <div class="le_co" id="score">
            我的积分<br>
            <div style="padding-left: 55px;">
            344
            </div>
        </div>
        <div class="le_co" id="donwload">
            下载
        </div>
        <div class="le_co" id="setting">
            个人设置
        </div>
        <div class="le_co" id="fankui">
            <p onclick="function sun() {$('tome').css('autofocus','autofocus');

            }">信息反馈</p>
        </div>
    </div>
    <div class="le_co" id="right">
        <div class="chat" id="chat">

        </div>
        <div class="to_me" id="to_me">
            <form>
                <input type="text" name="tome" id="tome" style="background-color:rgba(117, 69, 112, 0.32);width: 100%; height:80px;">
                <button class="btn-default btn" value="留言" style="background-color: rgba(117, 69, 112, 0.32);width: 100%; margin-top: 40px;">
                    留&nbsp;言
                </button>

            </form>
        </div>
    </div>
</div>
</body>
</html>
