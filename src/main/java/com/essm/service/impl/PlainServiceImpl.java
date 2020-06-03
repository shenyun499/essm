package com.essm.service.impl;

import com.essm.common.DateUtils;
import com.essm.dao.PlainMapper;
import com.essm.entity.Plain;
import com.essm.service.PlainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.List;

/**
 * 计划表(Plain)表服务实现类
 *
 * @author makejava
 * @since 2020-06-03 10:28:34
 */
@Service("plainService")
public class PlainServiceImpl implements PlainService {
    @Resource
    private PlainMapper plainMapper;

    @Autowired
    private DateUtils dateUtils;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Plain queryById(Integer id) {
        return this.plainMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Plain> queryAllByLimit(int offset, int limit) {
        return this.plainMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param plain 实例对象
     * @return 实例对象
     */
    @Override
    public Plain insert(Plain plain) {
        this.plainMapper.insert(plain);
        return plain;
    }

    /**
     * 修改数据--制定计划
     *
     * @param plain 实例对象
     * @return 实例对象
     */
    @Override
    public Plain update(Plain plain) {
        //如果sign=1则是制定今日计划，时间不用改变
        if (plain.getSign() == 1) {
            plain.setCreateTime(dateUtils.getNowDate());
        } else {
            //制定明日计划，时间需要加1
            //得到现在的时间，转换为Integer类型进行数据库查询
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.DATE, 1);
            String nowTime = calendar.get(Calendar.YEAR) + "" + (calendar.get(Calendar.MONDAY) + 1) + calendar.get(Calendar.DATE);
            plain.setCreateTime(Integer.parseInt(nowTime));
        }
        this.plainMapper.update(plain);
        return this.queryById(plain.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.plainMapper.deleteById(id) > 0;
    }

    /**
     * 查询计划状态
     *
     * @param plain 计划查询信息 sign=1/2&pid=当前用户&create_time=now
     * @return
     */
    @Override
    public Plain queryByDate(Plain plain) {
        //得到现在的时间，转换为Integer类型进行数据库查询
        plain.setCreateTime(dateUtils.getNowDate());
        //查询数据库并返回
        return plainMapper.queryByDate(plain);
    }

    /**
     * 计划字段，单词数量自增1
     *
     * @param userId 用户编号
     */
    @Override
    public void updateAddWord(Integer userId) {
        plainMapper.updateAddWord(userId, dateUtils.getNowDate());
    }
}