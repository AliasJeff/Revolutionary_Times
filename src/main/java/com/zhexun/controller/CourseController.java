package com.zhexun.controller;

import com.zhexun.pojo.Course;
import com.zhexun.service.CourseService;
import com.zhexun.service.impl.CourseServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    private final CourseService courseService = new CourseServiceImpl();

    @GetMapping
    public List<Course> selectAll() {
        return courseService.selectAll();
    }
}
