package com.zhexun.mapper;

import com.zhexun.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from user")
    List<User> selectAll();

    /**
     * 根据id查询
     * @param uid
     * @return
     */
    @Select("select * from user where uid = #{uid}")
    User selectById(int uid);

    /**
     * 根据姓名查询
     * @param uname
     * @return
     */
    @Select("select * from user where uname = #{uname}")
    User selectByUname(String uname);

    /**
     * 添加用户
     * @param user
     */
    @Insert("insert into user (uname, upassword) values (#{uname}, #{upassword})")
    void add(User user);

    /**
     * 更新用户信息
     * @param user
     */
    void update(User user);

    /**
     * 删除单个
     * @param uid
     */
    @Delete("delete from user where uid=#{uid}")
    void deleteById(int uid);

    /**
     * 批量删除
     * @param ids
     */
    void deleteByIds(@Param("ids") int[] ids);
}
