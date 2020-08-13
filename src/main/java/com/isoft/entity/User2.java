package com.isoft.entity;

import java.io.Serializable;
import java.util.Date;

public class User2 implements Serializable {
    private Integer uid;
    private String uname,upass;
    private String mobile ;
    private Date birthday ;
    private Date reg ;

    public User2(){

    }

    public User2(Integer uid, String uname, String upass, String mobile, Date birthday, Date reg) {
        this.uid = uid;
        this.uname = uname;
        this.upass = upass;
        this.mobile = mobile;
        this.birthday = birthday;
        this.reg = reg;
    }

    @Override
    public String toString() {
        return "User2{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upass='" + upass + '\'' +
                ", mobile='" + mobile + '\'' +
                ", birthday=" + birthday +
                ", reg=" + reg +
                '}';
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getReg() {
        return reg;
    }

    public void setReg(Date reg) {
        this.reg = reg;
    }
}
