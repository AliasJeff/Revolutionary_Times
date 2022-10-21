package com.zhexun.test;

import com.zhexun.mapper.UserMapper;
import com.zhexun.pojo.User;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserMapperTest {
    @Test
    public void testSelect() throws IOException {
        // 获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = userMapper.selectById(1);
        List<User> users = userMapper.selectAll();

        System.out.println(user);
        System.out.println(users);

        sqlSession.close();
    }

    @Test
    public void testInsert() throws IOException {
        // 获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = new User();
        user.setUname("zhexun");
        user.setUpassword("123456");
        userMapper.add(user);
        List<User> users = userMapper.selectAll();
        System.out.println(users);

        sqlSession.close();
    }

    @Test
    public void testUpdate() throws IOException {
        // 获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = userMapper.selectById(1);
        user.setUintroduce("管理员");
        userMapper.update(user);

        user = userMapper.selectById(1);
        System.out.println(user);

        sqlSession.close();
    }
}
