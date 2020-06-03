package com.essm.service;

import com.essm.entity.Word;
import com.github.pagehelper.PageInfo;

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
     * @return 单词列表
     */
    List<Word> queryAllByUserIdAndSign(Integer userId, Integer sign);

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

    /**
     * 根据指定条件分页查询单词
     *
     * @param pageNum 当前页数
     * @param pageSize 每页记录数
     * @param userId 用户id
     * @param sign 单词状态
     * @return 单词列表
     */
    List<Word> findAllWordByPage(Integer pageNum, Integer pageSize, Integer userId, Integer sign);

    /**
     * 查询分页信息
     *
     * @param pageNum 当前页数
     * @param pageSize 每页记录数
     * @param userId 用户id
     * @param sign 单词状态
     * @return 分页列表
     */
    PageInfo<Word> findAllWordByPageS(Integer pageNum, Integer pageSize, Integer userId, Integer sign);


    /**
     * 按照单词搜索单词信息
     *
     * @param pageNum 当前页数
     * @param pageSize 每页记录数
     * @param word 单词信息
     * @return
     */
    PageInfo<Word> searchWordByPageS(Integer pageNum, int pageSize, Word word);
}