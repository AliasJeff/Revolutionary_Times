package com.zhexun.pojo;

public class User {
    private Integer uid;
    private String uname;
    private String upassword;
    private String uintroduce;
    private String avatar;
    private String email;
    private String birthday;
    private Integer collectarticleid;
    private String access;
    private String accessStr;

    public User() {
    }

    public User(Integer uid, String uname, String upassword, String uintroduce, String avatar, String email, String birthday, Integer collectarticleid, String access) {
        this.uid = uid;
        this.uname = uname;
        this.upassword = upassword;
        this.uintroduce = uintroduce;
        this.avatar = avatar;
        this.email = email;
        this.birthday = birthday;
        this.collectarticleid = collectarticleid;
        this.access = access;
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

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUintroduce() {
        return uintroduce;
    }

    public void setUintroduce(String uintroduce) {
        this.uintroduce = uintroduce;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getCollectarticleid() {
        return collectarticleid;
    }

    public void setCollectarticleid(Integer collectarticleid) {
        this.collectarticleid = collectarticleid;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public String getAccessStr() {
        if(this.access.equals("0"))
            return "普通用户";
        else {
            return "管理员";
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upassword='" + upassword + '\'' +
                ", uintroduce='" + uintroduce + '\'' +
                ", avatar='" + avatar + '\'' +
                ", email='" + email + '\'' +
                ", birthday='" + birthday + '\'' +
                ", collectarticleid=" + collectarticleid +
                ", access='" + access + '\'' +
                '}';
    }
}
