package com.essm.dao;

import com.essm.entity.Word;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 单词表(Word)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-23 20:01:43
 */
public interface WordMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Word queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Word> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param word 实例对象
     * @return 对象列表
     */
    List<Word> queryAll(Word word);

    /**
     * 通过用户id和单词熟练度sign查询所有的word
     *
     * @param userId 用户id
     * @param sign 单词熟练状态 1为掌握 2为不掌握
     * @return
     */
    List<Word> queryAllByUserIdAndSign(Integer userId, Integer sign);

    /**
     * 新增数据
     *
     * @param word 实例对象
     * @return 影响行数
     */
    int insert(Word word);

    /**
     * 修改数据
     *
     * @param word 实例对象
     * @return 影响行数
     */
    int update(Word word);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    /**
     * 将单词置为掌握状态
     *
     * @param id 单词id
     */
    void addWordKnow(Integer id);

    /**
     * 将单词置为未掌握状态
     *
     * @param id 单词id
     */
    void removeWordKnow(Integer id);

    /**
     * 根据掌握单词和非掌握单词数量进行随机查询
     *
     * @param userId 用户编号
     * @param knum 掌握单词数
     * @param uknum 非掌握单词数
     * @return 单词列表
     */
    List<Word> queryByKnumAndUknum(Integer userId, int knum, int uknum);
}