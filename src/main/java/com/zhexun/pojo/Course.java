package com.zhexun.pojo;

public class Course {
    private Integer courseid;
    private String cname;
    private Integer uid;
    private String uname;
    private String date;

    public Course() {
    }

    public Course(Integer courseid, String cname, Integer uid, String uname, String date) {
        this.courseid = courseid;
        this.cname = cname;
        this.uid = uid;
        this.uname = uname;
        this.date = date;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
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
        return "Course{" +
                "courseid=" + courseid +
                ", cname='" + cname + '\'' +
                ", uid=" + uid +
                ", uname='" + uname + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
