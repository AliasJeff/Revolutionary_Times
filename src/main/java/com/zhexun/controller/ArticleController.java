package com.zhexun.controller;

import com.zhexun.commen.R;
import com.zhexun.pojo.Article;
import com.zhexun.pojo.User;
import com.zhexun.service.ArticleService;
import com.zhexun.service.UserService;
import com.zhexun.service.impl.ArticleServiceImpl;
import com.zhexun.service.impl.UserServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/articles")
public class ArticleController {
    private final ArticleService articleService = new ArticleServiceImpl();
    private final UserService userService = new UserServiceImpl();

    @GetMapping
    public List<Article> selectAll() {
        return articleService.selectAll();
    }

    @PostMapping
    public Article selectById(@Param("articleid") Integer articleid) {
        return articleService.selectById(articleid);
    }

    @PostMapping("/post")
    public R postArticle(@RequestBody Map map) {
        User user = userService.selectByUname(map.get("uname").toString());
        Article article = new Article();
        article.setUid(user.getUid());
        article.setUname(map.get("uname").toString());
        article.setTitle(map.get("title").toString());
        article.setContent(map.get("content").toString());
        article.setDate(map.get("date").toString());

        articleService.add(article);
        return R.success("发布成功!");
    }

    @PostMapping("/search")
    public List<Article> search(String search) {
        return articleService.searchAllByCondition(search);
    }
}
