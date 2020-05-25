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

}