package com.zhexun.mapper;

import com.zhexun.pojo.Course;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CourseMapper {
    /**
     * 查询全部
     * @return
     */
    @Select("select * from course")
    List<Course> selectAll();

    /**
     * 添加课程
     * @param course
     */
    @Insert("insert into course (cname, uid, uname, date) values (#{cname}, #{uid}, #{uname}, #{date})")
    void add(Course course);

    /**
     * 删除单个
     * @param id
     */
    @Delete("delete from course where courseid = #{id}")
    void deleteById(int id);

    /**
     * 批量删除
     * @param courseids
     */
    void deleteByIds(@Param("courseids") int[] courseids);
}
