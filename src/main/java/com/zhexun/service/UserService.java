package com.zhexun.service;

import com.zhexun.pojo.User;

import java.util.List;

public interface UserService {
    User selectById(int id);

    List<User> selectAll();

    User selectByUname(String uname);

    void add(User user);

    void update(User user);

    void deleteById(int id);

    void deleteByIds(int[] ids);

    boolean login(User user);

    boolean register(User user);

    boolean isValidAccount(User user);
}
