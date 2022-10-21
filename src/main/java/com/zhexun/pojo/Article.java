package com.zhexun.pojo;

public class Article {
    private Integer articleid;
    private Integer uid;
    private String uname;
    private String title;
    private String content;
    private Integer view;
    private Integer like;
    private Integer collect;
    private String date;
    private String cover;

    public Article() {
    }

    public Article(Integer articleid, Integer uid, String uname, String title, String content, Integer view, Integer like, Integer collect, String date, String cover) {
        this.articleid = articleid;
        this.uid = uid;
        this.uname = uname;
        this.title = title;
        this.content = content;
        this.view = view;
        this.like = like;
        this.collect = collect;
        this.date = date;
        this.cover = cover;
    }

    public Integer getArticleid() {
        return articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public Integer getCollect() {
        return collect;
    }

    public void setCollect(Integer collect) {
        this.collect = collect;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleid=" + articleid +
                ", uid=" + uid +
                ", uname='" + uname + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", view=" + view +
                ", like=" + like +
                ", collect=" + collect +
                ", date='" + date + '\'' +
                ", cover='" + cover + '\'' +
                '}';
    }
}
