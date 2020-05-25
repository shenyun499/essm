package com.essm.service;

import com.essm.entity.Word;
import java.util.List;

/**
 * 单词表(Word)表服务接口
 *
 * @author makejava
 * @since 2020-05-23 20:05:06
 */
public interface WordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Word queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Word> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param word 实例对象
     * @return 实例对象
     */
    Word insert(Word word);

    /**
     * 修改数据
     *
     * @param word 实例对象
     * @return 实例对象
     */
    Word update(Word word);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}