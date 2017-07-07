package com.springmvc.entity;

import java.util.Date;

public class User {
    private String name;

    private String pwd;

    private String email;

    private Integer sex;

    private Date birthday;

    private String tel;

    private Date createtime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", email='" + email + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", tel='" + tel + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}