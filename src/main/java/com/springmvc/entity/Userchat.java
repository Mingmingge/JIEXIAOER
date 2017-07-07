package com.springmvc.entity;

import java.util.Date;

public class Userchat {
    private Date createtime;

    private String name;

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}