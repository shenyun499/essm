package com.essm.dao;

import com.essm.entity.User;

public interface UserMapper {

    /**
     * 根据id查询用户
     * @param id
     * @return用户信息
     */
    User selectById(Integer id);
}
