package com.springmvc.controller;

import com.springmvc.entity.User;
import com.springmvc.entity.Userchat;
import com.springmvc.entity.UserchatWithBLOBs;
import com.springmvc.service.UserchatService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by hulimin on 2017/7/7.
 */
@Controller

public class WoController {

    @Autowired
    private UserchatService userchatService;

    @RequestMapping(value = "/wo/sub")

    @ResponseBody


    public JSONObject toMe(@RequestParam("tome") String tome, HttpSession session){

        String str=tome;

        JSONObject jsonObject=new JSONObject();

        Date date=new Date();

        UserchatWithBLOBs userchatWithBLOBs=new UserchatWithBLOBs();

        User user=(User)session.getAttribute("user");

        //Userchat userchat=new Userchat();

        //userchat.setCreatetime(date);

        //userchat.setName(user.getName());

        userchatWithBLOBs.setCreatetime(date);

        userchatWithBLOBs.setTome(tome);

        userchatWithBLOBs.setName(user.getName());

        int a=userchatService.insert(userchatWithBLOBs);

        if(a==1){

            jsonObject.put("result",str);

        }
        else{

            jsonObject.put("result","Error!");
        }

        return jsonObject;
    }
}
