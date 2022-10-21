package com.zhexun.controller;

import com.zhexun.pojo.Comment;
import com.zhexun.service.CommentService;
import com.zhexun.service.impl.CommentServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    private final CommentService commentService = new CommentServiceImpl();

    @GetMapping
    public List<Comment> selectAll() {
        return commentService.selectAll();
    }

    @PostMapping
    public List<Comment> selectByArticleid(@Param("articleid") Integer articleid) {
        Comment comment = new Comment();
        comment.setArticleid(articleid);
        return commentService.selectAllByCondition(comment);
    }
}
