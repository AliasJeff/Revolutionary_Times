package com.zhexun.service.impl;

import com.zhexun.mapper.ArticleMapper;
import com.zhexun.mapper.UserMapper;
import com.zhexun.pojo.Article;
import com.zhexun.service.ArticleService;
import com.zhexun.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class ArticleServiceImpl implements ArticleService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public Article selectById(int id) {
        SqlSession sqlSession = factory.openSession();
        ArticleMapper mapper = sqlSession.getMapper(ArticleMapper.class);

        Article article = mapper.selectById(id);

        sqlSession.close();

        return article;
    }

    @Override
    public List<Article> selectAll() {
        SqlSession sqlSession = factory.openSession();
        ArticleMapper mapper = sqlSession.getMapper(ArticleMapper.class);

        List<Article> articles = mapper.selectAll();

        sqlSession.close();

        return articles;
    }

    @Override
    public void add(Article article) {
        SqlSession sqlSession = factory.openSession();
        ArticleMapper mapper = sqlSession.getMapper(ArticleMapper.class);

        mapper.add(article);

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public List<Article> selectByCondition(Article article) {
        SqlSession sqlSession = factory.openSession();
        ArticleMapper mapper = sqlSession.getMapper(ArticleMapper.class);

        List<Article> articles = mapper.selectByCondition(article);

        sqlSession.close();

        return articles;
    }

    @Override
    public List<Article> searchAllByCondition(String s) {
        SqlSession sqlSession = factory.openSession();
        ArticleMapper mapper = sqlSession.getMapper(ArticleMapper.class);

        List<Article> articles = mapper.searchAllByCondition(s);

        sqlSession.close();

        return articles;
    }

    @Override
    public void deleteById(int id) {
        SqlSession sqlSession = factory.openSession();
        ArticleMapper mapper = sqlSession.getMapper(ArticleMapper.class);

        mapper.deleteById(id);

        sqlSession.close();
    }

    @Override
    public void deleteByIds(int[] ids) {
        SqlSession sqlSession = factory.openSession();
        ArticleMapper mapper = sqlSession.getMapper(ArticleMapper.class);

        mapper.deleteByIds(ids);

        sqlSession.close();
    }
}
