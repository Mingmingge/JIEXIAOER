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



