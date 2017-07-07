package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hulimin on 2017/7/6.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index/login")

    public String toLogin(){

        return "login";
    }



    @RequestMapping(value = "/index/regist")

    public String toRegist(){
        return "regist";
    }



}
