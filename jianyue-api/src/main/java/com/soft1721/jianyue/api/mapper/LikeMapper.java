package com.soft1721.jianyue.api.mapper;


import com.soft1721.jianyue.api.entity.Like;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface LikeMapper {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "fromUId", column = "from_uid"),
            @Result(property = "toUId", column = "to_uid")
    })
    @Select("SELECT * FROM t_like WHERE from_uid = #{fromUId} AND to_uid = #{toUId} ")
    Like getLike(@Param("fromUId") int fromUId,@Param("toUId") int toUId);

}
