package com.essm.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 单词表(Word)实体类
 *
 * @author xuexue
 * @since 2020-05-23 20:01:42
 */
public class Word implements Serializable {
    private static final long serialVersionUID = 990276661871368400L;
    /**
    * 单词编号，主键
    */
    private Integer id;
    /**
    * 用户编号，外键，关联essm_user表的id
    */
    private Integer pid;
    /**
    * 单词中文
    */
    private String chinese;
    /**
    * 单词英文
    */
    private String english;
    /**
    * 单词状态位 1：已掌握 2：未掌握
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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }
}