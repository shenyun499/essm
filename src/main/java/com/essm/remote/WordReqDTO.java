package com.essm.remote;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * 请求通用dto
 *
 * @author ：HUANG ZHI XUE
 * @date ：Create in 2020-08-18
 */
public class WordReqDTO {

    /** 单词编号 */
    @ApiModelProperty(name = "id", value = "单词编号", required = true)
    @NotNull(message = "单词编号不能为空")
    private Integer id;

    /** 用户编号 */
    private Integer trl;

    /** 单词中文 */
    private String chinese;

    /** 单词英文 */
    private String english;

    /** 单词状态位 */
    private Integer sign;

    public WordReqDTO() {
    }

    public WordReqDTO(Integer id, Integer trl, String chinese, String english, Integer sign) {
        this.id = id;
        this.trl = trl;
        this.chinese = chinese;
        this.english = english;
        this.sign = sign;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTrl() {
        return trl;
    }

    public void setTrl(Integer trl) {
        this.trl = trl;
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

    @Override
    public String toString() {
        return "WordDO{" +
                "id=" + id +
                ", trl=" + trl +
                ", chinese='" + chinese + '\'' +
                ", english='" + english + '\'' +
                ", sign=" + sign +
                '}';
    }
}
