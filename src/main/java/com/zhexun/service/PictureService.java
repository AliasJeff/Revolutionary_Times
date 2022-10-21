package com.zhexun.service;

import com.zhexun.pojo.Picture;

import java.util.List;

public interface PictureService {
    List<Picture> selectAll();

    void add(Picture picture);

    void deleteById(int id);

    void deleteByIds(int[] ids);
}
