package com.essm.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 计划表(Plain)实体类
 *
 * @author makejava
 * @since 2020-06-03 15:19:09
 */
@Data
public class Plain implements Serializable {
    private static final long serialVersionUID = -52347099743701825L;
    /**
    * 计划编号，主键
    */
    private Integer id;
    /**
    * 用户编号，外键
    */
    private Integer pid;
    /**
    * 添加单词个数
    */
    private Integer addWordNum;
    /**
    * 掌握单词个数
    */
    private Integer knowWordNum;
    /**
    * 盲式学习次数
    */
    private Integer studyNum;
    /**
    * 挑战接龙次数
    */
    private Integer gameNum;
    /**
    * 计划标识 1：今日计划 2：明日计划
    */
    private Integer sign;
    /**
    * 计划制定时间
    */
    private Integer createTime;
    
    private Integer addWordNums;
    
    private Integer knowWordNums;
    
    private Integer studyNums;
    
    private Integer gameNums;
}