package com.essm.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 单词表(Word)实体类
 *
 * @author xuexue
 * @since 2020-05-23 20:01:42
 */
@Data
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

}