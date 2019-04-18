package com.soft1721.jianyue.api.mapper;

import com.soft1721.jianyue.api.entity.Article;
import com.soft1721.jianyue.api.entity.vo.ArticleVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ArticleMapper {
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "u_id",property = "uId"),
            @Result(column = "title",property = "title"),
            @Result(column = "content",property = "content"),
            @Result(column = "create_time",property = "createTime"),
            @Result(column = "nickname",property = "nickname"),
            @Result(column = "avatar",property = "avatar")
    })
    @Select("SELECT a.*,b.id ,b.nickname,b.avatar FROM t_article a LEFT JOIN t_user b ON a.u_id=b.id ORDER By b.id DESC ")
    List<ArticleVO> selectAll();

    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "u_id",property = "uId"),
            @Result(column = "title",property = "title"),
            @Result(column = "content",property = "content"),
            @Result(column = "create_time",property = "createTime"),
            @Result(column = "nickname",property = "nickname"),
            @Result(column = "avatar",property = "avatar")
    })
    @Select("SELECT a.*,b.id,b.nickname,b.avatar FROM t_article a LEFT JOIN t_user b ON a.u_id=b.id WHERE a.id = #{id} ")
    ArticleVO getArticleById(int aId);



    /*ArticleMapper，新增文章方法，增加@Options注解，返回自增主键*/
    @Insert("INSERT INTO t_article (u_id,title,content,create_time) VALUES (#{uId},#{title},#{content},#{createTime}) ")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void insertArticle(Article article);

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "uId", column = "u_id"),
            @Result(property = "title", column = "title"),
            @Result(property = "content", column = "content"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "nickname", column = "nickname"),
            @Result(property = "avatar", column = "avatar")
    })
    @Select(" SELECT * FROM t_article WHERE u_id=#{uId}")
    List<ArticleVO> getArticleByUId(int uId);


}

