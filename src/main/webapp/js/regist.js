//TEST FOR NAME
    $(function () {
        $("input[name = 'name']").blur(function () {
            $.ajax({
                url:"/regist/name",
                data:{
                    name:$(this).val()
                },
                type:"POST",
                dataType:"json",
                success:function (data) {
                    $("#tishi_name").html(data.result)
                },
                error:function (data) {
                    $("#tishi_name").html(data.result)
                }


            })
        })
    })

//TEST FOR PASSWORD
$(function () {
    $("input[name='pwd']").blur(function () {
        $.ajax({
            url:"/regist/password",
            data:{
                password:$(this).val()
            },
            type:"POST",
            dataType:"json",
            success:function (data) {
                $("#tishi_pwd").html(data.result)
            },
            error:function (data) {
                $("#tishi_pwd").html(data.result)
            }
        })
    })
})
//TEST FOR password_2
$(function () {
    $("input[name='p']").blur(function () {
        $.ajax({
            url:"/regist/password_2",
            data:{
                password:$("input[name='pwd']").val(),
                password_2:$(this).val()
            },
            type:"POST",
            dataType:"json",
            success:function (data) {
                var str = data.result;
                if (str != "") {
                    $("input[name='pwd']").html("");
                    $("input[name='p']").html("");
                }

                $("#tishi_que").html(data.result)
            },
            error:function (data) {
                $("#tishi_que").html(data.result)
            }
        })
    })
})

//TEST FOR EMAIL and SENDEMAIL
$(function () {
    $("input[name='email']").blur(function () {
        $.ajax({
            url:"/regist/email",
            data:{
                email:$(this).val()
            },
            type:"POST",
            dataType:"json",
            success:function (data) {
                var str = data.result;
                var len = str.length;
                if (len == 0) {
                    $("#tishi_you").html(data.result);
                    alert("验证码已发送，请注意查收！");

                } else {
                    $("#tishi_you").html(data.result);
                }

            },
            error:function (data) {

            }
        })
    })
})
//TEST FOR TESTNUMBER
$(function () {
    $("input[name='yanzheng']").blur(function () {
        $.ajax({
            url:"/regist/testma",
            data:{
                yanzheng:$(this).val()
            },
            type:"POST",
            dataType:"json",
            success:function (data) {
                $("#yan").html(data.result)
            },
            error:function (data) {

            }
        })
    })
})



