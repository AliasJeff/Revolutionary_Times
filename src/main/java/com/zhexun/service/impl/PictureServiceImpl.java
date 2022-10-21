package com.zhexun.service.impl;

import com.zhexun.mapper.CourseMapper;
import com.zhexun.mapper.PictureMapper;
import com.zhexun.pojo.Picture;
import com.zhexun.service.PictureService;
import com.zhexun.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class PictureServiceImpl implements PictureService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public List<Picture> selectAll() {
        SqlSession sqlSession = factory.openSession();
        PictureMapper mapper = sqlSession.getMapper(PictureMapper.class);

        List<Picture> pictures = mapper.selectAll();

        sqlSession.close();

        return pictures;
    }

    @Override
    public void add(Picture picture) {
        SqlSession sqlSession = factory.openSession();
        PictureMapper mapper = sqlSession.getMapper(PictureMapper.class);

        mapper.add(picture);

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteById(int id) {
        SqlSession sqlSession = factory.openSession();
        PictureMapper mapper = sqlSession.getMapper(PictureMapper.class);

        mapper.deleteById(id);

        sqlSession.close();
    }

    @Override
    public void deleteByIds(int[] ids) {
        SqlSession sqlSession = factory.openSession();
        PictureMapper mapper = sqlSession.getMapper(PictureMapper.class);

        mapper.deleteByIds(ids);

        sqlSession.close();
    }
}
