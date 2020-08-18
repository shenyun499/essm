package com.essm.mybatis.dao;

import com.essm.entity.WordDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 单词数据库接口层
 *
 * @author ：HUANG ZHI XUE
 * @date ：Create in 2020-08-18
 */
@Mapper
public interface WordDAO {
    /**
     * 查询单词集合
     *
     * @param wordDO 单词实体类
     * @return 单词集合
     */
    List<WordDO> listWordInfo(WordDO wordDO);
}
