package com.springmvc.controller;

import com.springmvc.entity.User;
import com.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.mail.Session;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * Created by hulimin on 2017/7/7.
 */
@Controller

public class LoginController {

    @Autowired

    private UserService userService;

    @RequestMapping(value = "/login/in",method = RequestMethod.POST)

    public String testLogin(@ModelAttribute User user,Model model,HttpSession session) {

        User user1 = new User();

        ArrayList<User> list = userService.selectSelective(user);

        user1 = userService.selectByPrimaryKey(user.getName());

        if (list.size() == 0) {

            model.addAttribute("result", "<script type='text/javascript'>$(function(){alert('用户名未注册！');})</script>");

            return "login";
        }
        else if (user.getName().equals(user1.getName())) {

            session.setAttribute("user", user);

            return "login_index";

        }
        else{

            model.addAttribute("result", "<script type='text/javascript'>$(function(){alert('密码错误！');})");

            return "login";
        }



    }
}
