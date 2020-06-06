package com.essm.service;

import com.essm.entity.Plain;

import java.util.List;

/**
 * 计划表(Plain)表服务接口
 *
 * @author makejava
 * @since 2020-06-03 10:28:34
 */
public interface PlainService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Plain queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Plain> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param plain 实例对象
     * @return 实例对象
     */
    Plain insert(Plain plain);

    /**
     * 修改数据--制定计划
     *
     * @param plain 实例对象
     * @return 实例对象
     */
    Plain update(Plain plain);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);


    /**
     * 查询计划状态
     *
     * @param plain 计划查询信息 sign=1/2&pid=当前用户&create_time=now
     * @return
     */
    Plain queryByDate(Plain plain);

    /**
     * 计划字段，单词数量自增1
     *
     * @param userId 用户编号
     */
    void updateAddWord(Integer userId);

    /**
     * 计划字段，接龙数量自增1
     *
     * @param userId 用户编号
     */
    void updateAddGame(Integer userId);
}