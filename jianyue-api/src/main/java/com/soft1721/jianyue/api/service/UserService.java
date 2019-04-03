package com.soft1721.jianyue.api.service;

import com.soft1721.jianyue.api.entity.User;
import com.soft1721.jianyue.api.entity.dto.UserDTO;

public interface UserService {

    /**
     * 根据手机号获取用户信息
     *
     * @param mobile
     * @return
     */
    User getUserByMobile(String mobile);

    /**
     * 登录方法
     *
     * @param userDTO
     * @return boolean
     */
    int signIn(UserDTO userDTO);


    /**
     * 根据用户ID获取用户信息
     *
     * @param id
     * @return
     */
    User getUserById(Integer id);


   /* User getUserById(long id);*/

    /**
     * 修改头像方法
     *
     * @param user
     * @return boolean
     */
    void updateUser(User user);
}