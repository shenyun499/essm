package com.essm.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户表(User)实体类
 *
 * @author xuexue
 * @since 2020-05-23 20:08:05
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -68296714906509506L;
    /**
    * 用户编号，主键
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
    * 用户标识位 1：用户 2：管理员
    */
    private Integer sign;

}