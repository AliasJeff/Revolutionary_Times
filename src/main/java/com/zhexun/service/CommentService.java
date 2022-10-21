package com.zhexun.service;

import com.zhexun.pojo.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> selectAll();

    List<Comment> selectAllByCondition(Comment comment);

    void add(Comment comment);

    void deleteById(int id);

    void deleteByIds(int[] ids);
}
