package com.essm.service.impl;

import com.essm.entity.Word;
import com.essm.dao.WordMapper;
import com.essm.service.WordService;
import org.springframework.stereotype.Service;
import sun.misc.Request;

import javax.annotation.Resource;
import java.util.List;

/**
 * 单词表(Word)表服务实现类
 *
 * @author makejava
 * @since 2020-05-23 20:05:07
 */
@Service("wordService")
public class WordServiceImpl implements WordService {
    @Resource
    private WordMapper wordMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Word queryById(Integer id) {
        return this.wordMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Word> queryAllByLimit(int offset, int limit) {
        return this.wordMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param word 实例对象
     * @return 实例对象
     */
    @Override
    public Word insert(Word word) {
        //增加的单词sign=2为未掌握
        word.setSign(2);
        //登录做了再来备用
        this.wordMapper.insert(word);
        return word;
    }

    /**
     * 修改数据
     *
     * @param word 实例对象
     * @return 实例对象
     */
    @Override
    public Word update(Word word) {
        this.wordMapper.update(word);
        return this.queryById(word.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.wordMapper.deleteById(id) > 0;
    }
}