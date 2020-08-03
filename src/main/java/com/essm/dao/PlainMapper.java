package com.essm.dao;

import com.essm.entity.Plain;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 计划表(Plain)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-03 10:28:34
 */
public interface PlainMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Plain queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Plain> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param plain 实例对象
     * @return 对象
     */
    Plain queryByDate(Plain plain);

    /**
     * 新增数据
     *
     * @param plain 实例对象
     * @return 影响行数
     */
    int insert(Plain plain);

    /**
     * 修改数据
     *
     * @param plain 实例对象
     * @return 影响行数
     */
    int update(Plain plain);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);


    /**
     * 计划字段，单词数量自增1
     *
     * @param time 时间
     * @param userId 用户编号
     */
    void updateAddWord(Integer userId, Integer time);

    /**
     * 计划字段，接龙数量自增1
     *
     * @param time 时间
     * @param userId 用户编号
     */
    void updateAddGame(Integer userId, Integer time);

    /**
     * 计划字段，掌握单词数量自增1
     *
     * @param time 时间
     * @param userId 用户编号
     */
    void updateAddKnowWord(Integer userId, Integer time);

    /**
     * 计划字段，盲式学习数量自增1
     *
     * @param time 时间
     * @param userId 用户编号
     */
    void updateAddStudy(Integer userId, Integer time);
}