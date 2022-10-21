package com.zhexun.pojo;

public class Picture {
    private String pictureid;
    private String pname;
    private Integer uid;
    private String uname;
    private String date;

    public Picture() {
    }

    public Picture(String pictureid, String pname, Integer uid, String uname, String date) {
        this.pictureid = pictureid;
        this.pname = pname;
        this.uid = uid;
        this.uname = uname;
        this.date = date;
    }

    public String getPictureid() {
        return pictureid;
    }

    public void setPictureid(String pictureid) {
        this.pictureid = pictureid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "picture{" +
                "pictureid='" + pictureid + '\'' +
                ", pname='" + pname + '\'' +
                ", uid=" + uid +
                ", uname='" + uname + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
