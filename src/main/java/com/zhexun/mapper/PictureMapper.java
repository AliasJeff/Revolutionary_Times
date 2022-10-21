package com.zhexun.mapper;

import com.zhexun.pojo.Picture;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PictureMapper {
    /**
     * 查询全部
     * @return
     */
    @Select("select * from picture")
    List<Picture> selectAll();

    /**
     * 添加照片
     * @param picture
     */
    @Insert("insert into picture (pname, uid, uname, date) values (#{pname}, #{uid}, #{uname}, #{date})")
    void add(Picture picture);

    /**
     * 删除单个
     * @param id
     */
    @Delete("delete from picture where pictureid = #{id}")
    void deleteById(int id);

    /**
     * 批量删除
     * @param pictureids
     */
    void deleteByIds(@Param("pictureids") int[] pictureids);
}
