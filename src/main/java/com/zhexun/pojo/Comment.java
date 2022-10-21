package com.zhexun.pojo;

public class Comment {
    private Integer commentid;
    private Integer articleid;
    private String title;
    private Integer uid;
    private String uname;
    private Integer uoid;
    private String uoname;
    private String commentContent;
    private String date;

    public Comment() {
    }

    public Comment(Integer commentid, Integer articleid, String title, Integer uid, String uname, Integer uoid, String uoname, String commentContent, String date) {
        this.commentid = commentid;
        this.articleid = articleid;
        this.title = title;
        this.uid = uid;
        this.uname = uname;
        this.uoid = uoid;
        this.uoname = uoname;
        this.commentContent = commentContent;
        this.date = date;
    }

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public Integer getArticleid() {
        return articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Integer getUoid() {
        return uoid;
    }

    public void setUoid(Integer uoid) {
        this.uoid = uoid;
    }

    public String getUoname() {
        return uoname;
    }

    public void setUoname(String uoname) {
        this.uoname = uoname;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentid=" + commentid +
                ", articleid=" + articleid +
                ", title='" + title + '\'' +
                ", uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uoid=" + uoid +
                ", uoname='" + uoname + '\'' +
                ", commentContent='" + commentContent + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
