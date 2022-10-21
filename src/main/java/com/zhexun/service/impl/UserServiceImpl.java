package com.zhexun.service.impl;

import com.zhexun.mapper.PictureMapper;
import com.zhexun.mapper.UserMapper;
import com.zhexun.pojo.User;
import com.zhexun.service.UserService;
import com.zhexun.util.SqlSessionFactoryUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;
import java.util.Objects;

public class UserServiceImpl implements UserService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    @Override
    public User selectById(int id) {
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.selectById(id);

        sqlSession.close();

        return user;
    }

    @Override
    public List<User> selectAll() {
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = mapper.selectAll();

        sqlSession.close();

        return users;
    }

    @Override
    public User selectByUname(String uname) {
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.selectByUname(uname);

        sqlSession.close();

        return user;
    }

    @Override
    public void add(User user) {
        SqlSession sqlSession = factory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.add(user);

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(User user) {
        SqlSession sqlSession = factory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.update(user);

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void deleteById(int id) {
        SqlSession sqlSession = factory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteById(id);

        sqlSession.close();
    }

    @Override
    public void deleteByIds(int[] ids) {
        SqlSession sqlSession = factory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteByIds(ids);

        sqlSession.close();
    }

    @Override
    public boolean login(User user) {
        SqlSession sqlSession = factory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User u = mapper.selectByUname(user.getUname());

        if(u == null) {
            return false;
        }
        return Objects.equals(u.getUname(), user.getUname()) && Objects.equals(u.getUpassword(), user.getUpassword());
    }

    @Override
    public boolean register(User user) {
        SqlSession sqlSession = factory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        if(isValidAccount(user)) {
            mapper.add(user);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isValidAccount(User account) {
        SqlSession sqlSession = factory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User u = mapper.selectByUname(account.getUname());
        if(u != null) {
            return false;
        }
        return account.getUpassword() != null && !account.getUpassword().equals("");
    }

}
