package com.springmvc.controller;

import com.springmvc.entity.User;
import com.springmvc.entity.Userma;
import com.springmvc.service.UserService;
import com.springmvc.service.UsermaService;
import com.springmvc.util.ProductRandom;
import com.springmvc.util.SendEmail;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.RequestMappingInfoHandlerMethodMappingNamingStrategy;

import java.util.Random;

/**
 * Created by hulimin on 2017/7/6.
 */
@Controller

public class RegistController {

    static int n=0;

    //static int y=0;

    @Autowired

    private UserService userService;

    private UsermaService usermaService;

    @RequestMapping(value = "/regist/name",method = RequestMethod.POST)

    @ResponseBody

    public JSONObject testForName(@RequestParam("name") String name) {

        JSONObject jsonObject = new JSONObject();

        User user = userService.selectByPrimaryKey(name);

        int len = name.length();

        if (len == 0) {

            jsonObject.put("result","请输入用户名!");

        }

        if (len>0&&len<15) {

            jsonObject.put("result","");

        }
        if (user == null && len > 0 && len < 15) {

            jsonObject.put("result","");

            n=1;

        }

        if (user != null) {

            jsonObject.put("result","用户名已注册！");

        }



        return jsonObject;
    }



    @RequestMapping(value = "/regist/email",method = RequestMethod.POST)

    @ResponseBody

    public JSONObject sendForEmail(@RequestParam("email") String email) {



        JSONObject jsonObject=new JSONObject();

        ProductRandom productRandom = new ProductRandom();

        String str = productRandom.toRandom();

        SendEmail.send(email,"欢迎注册","您的邮箱验证码为："+str+",请尽快输入，30分钟内有效！");

        jsonObject.put("result","邮箱验证码已发送，注意查收！");

        return jsonObject;

    }


    //@RequestMapping(value = "/regist/testma",method = RequestMethod.POST)

    //@ResponseBody

   /* public JSONObject testForEmail(@RequestParam("yanzheng") String yanzheng){

        JSONObject jsonObject=new JSONObject();

        if(str.equals(yanzheng)){

            jsonObject.put("result","");

            y=1;
        }

        if (!(str.equals(yanzheng))){

            jsonObject.put("result","验证码不正确！");

        }

        return jsonObject;
    }*/



    @RequestMapping(value = "/regist/re",method = RequestMethod.POST)


    public String  toRegin(@RequestParam("name") String name, @RequestParam("pwd") String pwd, @RequestParam("email") String email,@RequestParam("yanzheng") String yanzheng,Model model) {

        User user=new User();

        user.setName(name);

        user.setEmail(email);

        user.setPwd(pwd);

        //Userma userma=new Userma();

        //userma.setName(name);

        userService.insert(user);

        //usermaService.insert(userma);

        model.addAttribute("result","<script>alert('注册成功！');location.href='login.jsp';</script>");

        return "regist";

    }



}
