package com.zhexun.mapper;

import com.zhexun.pojo.Comment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CommentMapper{
    /**
     * 查询所有
     * @return
     */
    @Select("select * from comment")
    List<Comment> selectAll();

    /**
     * 根据条件查询
     * @param comment
     * @return
     */
    List<Comment> selectAllByCondition(Comment comment);

    /**
     * 添加评论
     * @param comment
     */
    void add(Comment comment);

    /**
     * 单个删除
     * @param id
     */
    @Delete("delete from comment where commentid = #{id}")
    void deleteById(int id);

    /**
     * 批量删除
     * @param ids
     */
    void deleteByIds(@Param("ids") int[] ids);
}
