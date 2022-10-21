package com.zhexun.service.impl;

import com.zhexun.mapper.ArticleMapper;
import com.zhexun.mapper.CommentMapper;
import com.zhexun.pojo.Comment;
import com.zhexun.service.CommentService;
import com.zhexun.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class CommentServiceImpl implements CommentService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<Comment> selectAll() {
        SqlSession sqlSession = factory.openSession();
        CommentMapper mapper = sqlSession.getMapper(CommentMapper.class);

        List<Comment> comments = mapper.selectAll();

        sqlSession.close();

        return comments;
    }

    @Override
    public List<Comment> selectAllByCondition(Comment comment) {
        SqlSession sqlSession = factory.openSession();
        CommentMapper mapper = sqlSession.getMapper(CommentMapper.class);

        List<Comment> comments = mapper.selectAllByCondition(comment);

        sqlSession.close();

        return comments;
    }

    @Override
    public void add(Comment comment) {
        SqlSession sqlSession = factory.openSession();
        CommentMapper mapper = sqlSession.getMapper(CommentMapper.class);

        mapper.add(comment);

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteById(int id) {
        SqlSession sqlSession = factory.openSession();
        CommentMapper mapper = sqlSession.getMapper(CommentMapper.class);

        mapper.deleteById(id);

        sqlSession.close();
    }

    @Override
    public void deleteByIds(int[] ids) {
        SqlSession sqlSession = factory.openSession();
        CommentMapper mapper = sqlSession.getMapper(CommentMapper.class);

        mapper.deleteByIds(ids);

        sqlSession.close();
    }
}
