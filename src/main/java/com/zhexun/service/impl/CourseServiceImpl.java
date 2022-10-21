package com.zhexun.service.impl;

import com.zhexun.mapper.CommentMapper;
import com.zhexun.mapper.CourseMapper;
import com.zhexun.pojo.Comment;
import com.zhexun.pojo.Course;
import com.zhexun.service.CourseService;
import com.zhexun.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class CourseServiceImpl implements CourseService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<Course> selectAll() {
        SqlSession sqlSession = factory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);

        List<Course> courses = mapper.selectAll();

        sqlSession.close();

        return courses;
    }

    @Override
    public void add(Course course) {
        SqlSession sqlSession = factory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);

        mapper.add(course);

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteById(int id) {
        SqlSession sqlSession = factory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);

        mapper.deleteById(id);

        sqlSession.close();
    }

    @Override
    public void deleteByIds(int[] ids) {
        SqlSession sqlSession = factory.openSession();
        CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);

        mapper.deleteByIds(ids);

        sqlSession.close();
    }
}
