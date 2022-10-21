package com.zhexun.mapper;

import com.zhexun.pojo.Article;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ArticleMapper {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from article order by articleid desc")
    List<Article> selectAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @Select("select * from article where articleid = #{id}")
    Article selectById(int id);

    /**
     * 上传文章
     * @param article
     */
    @Insert("insert into article(uname, title, content, date) values(#{uname}, #{title}, #{content}, #{date})")
    void add(Article article);

    /**
     * 根据条件查询
     * @param article
     * @return
     */
    List<Article> selectByCondition(Article article);

    /**
     * 搜索
     * @param s
     * @return
     */
    List<Article> searchAllByCondition(String s);

    /**
     * 删除单个
     * @param articleid
     */
    @Delete("delete from artile where articleid = #{articleid}")
    void deleteById(int articleid);

    /**
     * 批量删除
     * @param articleids
     */
    void deleteByIds(@Param("articleids") int[] articleids);
}
