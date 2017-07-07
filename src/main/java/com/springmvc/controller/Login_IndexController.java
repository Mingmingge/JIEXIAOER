package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by hulimin on 2017/7/7.
 */
@Controller

public class Login_IndexController {


    @RequestMapping(value = "/loginindex/signout")

    public String toSignOut(){

        return "index";

    }

    @RequestMapping(value = "loginindex/wo")

    public String toWo(HttpSession session){

        return "wo";

    }
}
