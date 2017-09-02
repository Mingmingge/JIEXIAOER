package com.springmvc.controller;

import com.springmvc.entity.User;
import com.springmvc.entity.Userma;
import com.springmvc.service.UserService;
import com.springmvc.service.UsermaService;
import com.springmvc.util.ProductRandom;
import com.springmvc.util.SendEmail;
import com.springmvc.util.TestForEmail;
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


    static String testnumber;


    @Autowired

    private UserService userService;

    private UsermaService usermaService;

    @RequestMapping(value = "/regist/name",method = RequestMethod.POST)

    @ResponseBody

    public JSONObject testForName (@RequestParam ("name") String name) {

        JSONObject jsonObject = new JSONObject();

        User user = userService.selectByPrimaryKey(name);

        int len = name.length();

        if (len == 0) {

            jsonObject.put("result","请输入用户名!");

        }

        if (len > 0 && len < 15) {

            jsonObject.put("result","");

        }
        if (user == null && len > 0 && len < 15) {

            jsonObject.put("result","");


        }

        if (user != null) {

            jsonObject.put("result","用户名已注册！");

        }



        return jsonObject;
    }

    @RequestMapping (value = "/regist/password",method = RequestMethod.POST)

    @ResponseBody

    public JSONObject testForPassword(@RequestParam("password") String password) {
        JSONObject jsonObject = new JSONObject();
        int length = password.length();
        if (length == 0) {
            jsonObject.put("result","请输入密码！");
        } else if (length > 15 || length < 0){
            jsonObject.put("result","密码长度0～15！");
        } else if (length > 0 && length < 15) {
            jsonObject.put("result","");
        }
        return jsonObject;
        }
    @RequestMapping (value = "/regist/password_2",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject testForpasswor_2 (@RequestParam ("password") String password,@RequestParam ("password_2") String password_2) {

        JSONObject jsonObject = new JSONObject();
        if (password.equals(password_2)) {
            jsonObject.put("result","");
        } else {
            jsonObject.put("result","两次密码不一致，重新输入");
        }

        return jsonObject;
    }


    @RequestMapping(value = "/regist/email",method = RequestMethod.POST)

    @ResponseBody

    public JSONObject sendForEmail(@RequestParam("email") String email) {

        JSONObject jsonObject=new JSONObject();

        TestForEmail testForEmail = new TestForEmail();

       int test = testForEmail.testForEmail(email);

       if (test == 1) {

            ProductRandom productRandom = new ProductRandom();

            String str = productRandom.toRandom();

            SendEmail.send(email, "欢迎注册", "您的邮箱验证码为：" + str + ",请尽快输入，30分钟内有效！");

            jsonObject.put("result", "");

            testnumber = str;

        } else {

            jsonObject.put("result","邮箱格式不正确！");
        }

        return jsonObject;

    }


    @RequestMapping(value = "/regist/testma",method = RequestMethod.POST)

    @ResponseBody

   public JSONObject testForEmail(@RequestParam("yanzheng") String yanzheng){

        JSONObject jsonObject=new JSONObject();

        if (testnumber.equals(yanzheng)) {
            jsonObject.put("result","");
        } else {
            jsonObject.put("result","验证码不正确！");
        }

        return jsonObject;
    }



    @RequestMapping(value = "/regist/re")


    public String  toRegin(@RequestParam(value = "name",required = false) String name, @RequestParam("pwd") String pwd, @RequestParam("email") String email,Model model) {

        User user=new User();

        user.setName(name);

        user.setEmail(email);

        user.setPwd(pwd);

        int userend = userService.insert(user);

        if (userend == 1) {
            model.addAttribute("result",1);
        } else {
            model.addAttribute("result",0);
        }


        return "regist";

    }



}
