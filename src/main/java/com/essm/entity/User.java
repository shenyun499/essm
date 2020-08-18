package com.essm.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户表(User)实体类
 *
 * @author xuexue
 * @since 2020-05-23 20:08:05
 */
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }
}