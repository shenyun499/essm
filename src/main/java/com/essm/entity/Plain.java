package com.essm.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 计划表(Plain)实体类
 *
 * @author makejava
 * @since 2020-06-03 15:19:09
 */
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

    public Integer getAddWordNum() {
        return addWordNum;
    }

    public void setAddWordNum(Integer addWordNum) {
        this.addWordNum = addWordNum;
    }

    public Integer getKnowWordNum() {
        return knowWordNum;
    }

    public void setKnowWordNum(Integer knowWordNum) {
        this.knowWordNum = knowWordNum;
    }

    public Integer getStudyNum() {
        return studyNum;
    }

    public void setStudyNum(Integer studyNum) {
        this.studyNum = studyNum;
    }

    public Integer getGameNum() {
        return gameNum;
    }

    public void setGameNum(Integer gameNum) {
        this.gameNum = gameNum;
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getAddWordNums() {
        return addWordNums;
    }

    public void setAddWordNums(Integer addWordNums) {
        this.addWordNums = addWordNums;
    }

    public Integer getKnowWordNums() {
        return knowWordNums;
    }

    public void setKnowWordNums(Integer knowWordNums) {
        this.knowWordNums = knowWordNums;
    }

    public Integer getStudyNums() {
        return studyNums;
    }

    public void setStudyNums(Integer studyNums) {
        this.studyNums = studyNums;
    }

    public Integer getGameNums() {
        return gameNums;
    }

    public void setGameNums(Integer gameNums) {
        this.gameNums = gameNums;
    }
}