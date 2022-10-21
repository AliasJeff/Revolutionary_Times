package com.zhexun.service;

import com.zhexun.pojo.Article;
import com.zhexun.pojo.User;

import java.util.List;

public interface ArticleService {
    Article selectById(int id);

    List<Article> selectAll();

    void add(Article article);

    List<Article> selectByCondition(Article article);

    List<Article> searchAllByCondition(String s);

    void deleteById(int id);

    void deleteByIds(int[] ids);
}
