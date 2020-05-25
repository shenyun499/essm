package com.essm.service.impl;

import com.essm.entity.User;
import com.essm.dao.UserMapper;
import com.essm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表(User)表服务实现类
 *
 * @author makejava
 * @since 2020-05-25 09:23:52
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer id) {
        return this.userMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<User> queryAllByLimit(int offset, int limit) {
        return this.userMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        this.userMapper.insert(user);
        return user;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userMapper.update(user);
        return this.queryById(user.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userMapper.deleteById(id) > 0;
    }

    /**
     *通过user去判断对象是否存在，然后返回对象
     *
     * @param user 对象实例
     */
    @Override
    public User queryByUser(User user) {
        return userMapper.queryByUser(user);
    }

    @Override
    public List<User> queryAll(User user) {
        return userMapper.queryAll(user);
    }
}