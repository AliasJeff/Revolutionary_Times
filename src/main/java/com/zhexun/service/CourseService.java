package com.zhexun.service;

import com.zhexun.pojo.Comment;
import com.zhexun.pojo.Course;

import java.util.List;

public interface CourseService {
    List<Course> selectAll();

    void add(Course course);

    void deleteById(int id);

    void deleteByIds(int[] ids);
}
