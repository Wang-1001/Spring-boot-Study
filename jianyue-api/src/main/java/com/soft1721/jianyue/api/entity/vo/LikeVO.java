package com.soft1721.jianyue.api.entity.vo;

import lombok.Data;

import java.util.Date;

@Data
public class LikeVO {
    private Integer toUId;
    private String nickname;
    private Date createTime;
    private  String title;

}
