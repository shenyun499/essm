package com.essm.remote;

/**
 * 响应通用dto
 *
 * @author ：HUANG ZHI XUE
 * @date ：Create in 2020-08-18
 */
public class WordRspDTO {

    /** 单词编号 */
    private Integer id;

    /** 用户编号 */
    private Integer trl;

    /** 单词中文 */
    private String chinese;

    /** 单词英文 */
    private String english;

    /** 单词状态位 */
    private Integer sign;

    public WordRspDTO() {
    }

    public WordRspDTO(Integer id, Integer trl, String chinese, String english, Integer sign) {
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
