<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <title>借小二</title>
    <link href="assets/css/bootstrap-responsive.css" rel="stylesheet">
    <link rel="stylesheet" href="styles/bootstrap.min.css">
    <link rel="stylesheet" href="css/index.css">
    <script src="styles/jquery-3.2.1.min.js"></script>
    <script src="styles/bootstrap.min.js"></script>
</head>
<body style="width: 100%; margin-top: 10px;">
<div>
<nav class="navbar navbar-default" role="navigation" style="width: 100%;">
            <a href="/index/login">
                <button type="button" class="btn btn-default navbar-btn" style="float:left;margin-top:10px; margin-left: 10px;">
                    登录
                </button>
            </a>
            <!--<button type="button" class="btn btn-default navbar-btn" style="float:left;margin-top:10px; margin-left: 10px;">
                注册
            </button>-->
         <a href="/index/regist">
            <button type="button" class="btn btn-default navbar-btn" style="float:left;margin-top:10px; margin-left: 10px;">
                注册
            </button>
         </a>



        <div style="float: right; display: inline;">
            <form class="navbar-form navbar-left" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Search" value="搜我所想...">
                </div>
                <button type="submit" class="btn btn-default">搜索</button>
            </form>
        </div>
</nav>
</div>
<!--<div id="mypic" class="carousel slide" style="width: 100%;height: 400px;">-->
    <!-- 轮播（Carousel）指标 -->
    <!--<ol class="carousel-indicators">
        <li data-target="#mypic" data-slide-to="0" class="active"></li>
        <li data-target="#mypic" data-slide-to="1"></li>
        <li data-target="#mypic" data-slide-to="2"></li>
    </ol>-->
    <!-- 轮播（Carousel）项目 -->
    <!--<div class="carousel-inner">
        <div class="item active">
            <a href="index.html"> <img src="20160125122421785034.jpg" alt="" class="img-responsive" style="width: 100%;height: 400px;"></a>
        </div>
        <div class="item">
            <a href="index.html"> <img src="20160109092950335551.jpg" alt="" class="img-responsive" style="width: 100%;height: 400px;"></a>
        </div>
        <div class="item">
            <a href="index.html"> <img src="20160109094147390608.jpg" alt="" class="img-responsive" style="width: 100%;height: 400px;"></a>
        </div>
    </div>-->
    <!-- 轮播（Carousel）导航 -->
    <!--<a class="carousel-control left" href="#mypic"
       data-slide="prev">&lsaquo;</a>
    <a class="carousel-control right" href="#mypic"
       data-slide="next">&rsaquo;</a>
</div>-->
<div style="margin-left: 20%;width: 54%;height:1500px;background-color:rgba(188,155,86,0.37);padding-left: 9%;padding-top: 2%;">
    <div class="first_display" id="first_display_1">
        <div class="pic" id="pic_first_display_1">
            <a href="/index/login"><img src="images/zhanshi.jpg" style="width: 60%;height: 60%;"></a>
        </div>
        <div class="pic_intro" >
            对产品的介绍...
        </div>
    </div>
    <div class="first_display" id="first_display_2">
        <div class="pic" id="pic_first_display_2">
            <a href="/index/login"><img src="images/zhanshi.jpg" style="width: 60%;height: 60%;"></a>
        </div>
        <div class="pic_intro" >
            对产品的介绍...
        </div>
    </div>
    <div class="first_display" id="first_display_3">
        <div class="pic" id="pic_first_display_3">
            <a href="/index/login"><img src="images/zhanshi.jpg" style="width: 60%;height: 60%;"></a>
        </div>
        <div class="pic_intro" >
            对产品的介绍...
        </div>
    </div>
    <div class="first_display" id="second_display_1">
        <div class="pic" id="pic_second_display_1">
            <a href="/index/login"><img src="images/zhanshi.jpg" style="width: 60%;height: 60%;"></a>
        </div>
        <div class="pic_intro" >
            对产品的介绍...
        </div>
    </div>
    <div class="first_display" id="second_display_2">
        <div class="pic" id="pic_second_display_2">
            <a href="/index/login"><img src="images/zhanshi.jpg" style="width: 60%;height: 60%;"></a>
        </div>
        <div class="pic_intro" >
            对产品的介绍...
        </div>
    </div>
    <div class="first_display" id="second_display_3">
        <div class="pic" id="pic_second_display_3">
            <a href="/index/login"><img src="images/zhanshi.jpg" style="width: 60%;height: 60%;"></a>
        </div>
        <div class="pic_intro" >
            对产品的介绍...
        </div>
    </div>
    <div class="first_display" id="third_display_1">
        <div class="pic" id="pic_third_display_1">
            <a href="/index/login"><img src="images/zhanshi.jpg" style="width: 60%;height: 60%;"></a>
        </div>
        <div class="pic_intro" >
            对产品的介绍...
        </div>
    </div>
    <div class="first_display" id="third_display_2">
        <div class="pic" id="pic_third_display_2">
            <a href="/index/login"><img src="images/zhanshi.jpg" style="width: 60%;height: 60%;"></a>
        </div>
        <div class="pic_intro" >
            对产品的介绍...
        </div>
    </div>
    <div class="first_display" id="third_display_3">
        <div class="pic" id="pic_third_display_3">
            <a href="/index/login"><img src="images/zhanshi.jpg" style="width: 60%;height: 60%;"></a>
        </div>
        <div class="pic_intro" >
            对产品的介绍...
        </div>
    </div>
        <div class="first_display" id="fourth_display_1">
            <div class="pic" id="pic_fourth_display_1">
                <a href="/index/login"><img src="images/zhanshi.jpg" style="width: 60%;height: 60%;"></a>
            </div>
            <div class="pic_intro" >
                对产品的介绍...
            </div>
        </div>
        <div class="first_display" id="fourth_display_2">
            <div class="pic" id="pic_fourth_display_2">
                <a href="/index/login"><img src="images/zhanshi.jpg" style="width: 60%;height: 60%;"></a>
            </div>
            <div class="pic_intro" >
                对产品的介绍...
            </div>
        </div>
        <div class="first_display" id="fourth_display_3">
            <div class="pic" id="pic_fourth_display_3">
                <a href="/index/login"><img src="images/zhanshi.jpg" style="width: 60%;height: 60%;"></a>
            </div>
            <div class="pic_intro" >
                对产品的介绍...
            </div>
        </div>
    <div class="first_display" id="fifth_display_1">
        <div class="pic" id="pic_fifth_display_1">
            <a href="/index/login"><img src="images/zhanshi.jpg" style="width: 60%;height: 60%;"></a>
        </div>
        <div class="pic_intro" >
            对产品的介绍...
        </div>
    </div>
    <div class="first_display" id="fifth_display_2">
        <div class="pic" id="pic_fifith_display_2">
            <a href="/index/login"><img src="images/zhanshi.jpg" style="width: 60%;height: 60%;"></a>
        </div>
        <div class="pic_intro" >
            对产品的介绍...
        </div>
    </div>
    <div class="first_display" id="fifth_display_3">
        <div class="pic" id="pic_fifth_display_3">
            <a href="/index/login"><img src="images/zhanshi.jpg" style="width: 60%;height: 60%;"></a>
        </div>
        <div class="pic_intro" >
            对产品的介绍...
        </div>
    </div>

</div>

</body>
<script type="text/javascript">

    $(function () {
        $("img").hover(function () {
            $(this)
        })
    })
</script>
</html>