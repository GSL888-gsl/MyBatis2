package com.isoft.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable {
    private Integer id;
    private String name ;
    private String pass ;
    private String mobile ;
    private Date birthday ;
    private Date regDatetime ;
    List<News> newsList;
    public User() {
    }

    public User(Integer id, String name, String pass, String mobile, Date birthday, Date regDatetime) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.mobile = mobile;
        this.birthday = birthday;
        this.regDatetime = regDatetime;
    }

//    public User(String name, String pass, String mobile, Date birthday, Date regDatetime) {
//        this.name = name;
//        this.pass = pass;
//        this.mobile = mobile;
//        this.birthday = birthday;
//        this.regDatetime = regDatetime;
//    }
//
//    public User(String pass, String mobile, int id) {
//        this.id = id;
//        this.pass = pass;
//        this.mobile = mobile;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getRegDatetime() {
        return regDatetime;
    }

    public void setRegDatetime(Date regDatetime) {
        this.regDatetime = regDatetime;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", mobile='" + mobile + '\'' +
                ", birthday=" + birthday +
                ", regDatetime=" + regDatetime +
                ", newsList=" + newsList +
                '}';
    }
}
