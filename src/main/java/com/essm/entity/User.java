package com.essm.entity;

import lombok.Data;

/**
 * @Description
 * 用户实体类
 * @Author xuexue
 * @Date 2020/5/21 22:24
 */
@Data
public class User {
    /**
     * 用户编号
     */
    private Integer id;

    /**
     * 用户名称
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户标识  1：用户，2管理员
     */
    private Integer sign;
}
