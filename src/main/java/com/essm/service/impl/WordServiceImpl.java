package com.essm.service.impl;

import com.essm.common.JsonUtils;
import com.essm.common.RedisUtils;
import com.essm.dao.WordMapper;
import com.essm.entity.Word;
import com.essm.service.WordService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 单词表(Word)表服务实现类
 *
 * @author xuexue
 * @since 2020-05-23 20:05:07
 */
@Service("wordService")
public class WordServiceImpl implements WordService {
    @Resource
    private WordMapper wordMapper;

    @Autowired
    private RedisUtils redisUtils;

    private static final Log log = LogFactory.getLog(WordServiceImpl.class);


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
     * 通过实体作为筛选条件查询
     *
     * @param word 实例对象
     * @return 对象列表
     */
    @Override
    public List<Word> queryAll(Word word) {
        return this.wordMapper.queryAll(word);
    }

    /**
     * 通过用户id和单词熟练度sign查询所有的word
     *
     * @param userId 用户id
     * @param sign   单词熟练状态 1为掌握 2为不掌握
     * @return 单词列表
     */
    @Override
    public List<Word> queryAllByUserIdAndSign(Integer userId, Integer sign) {
        return this.queryAllByUserIdAndSign(userId, sign);
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

    /**
     * 根据指定条件分页查询单词
     *
     * @param pageNum  当前页数
     * @param pageSize 每页记录数
     * @param userId   用户id
     * @param sign     单词状态
     * @return 单词列表
     */
    @Override
    public List<Word> findAllWordByPage(Integer pageNum, Integer pageSize, Integer userId, Integer sign) {
        PageHelper.startPage(pageNum, pageSize);
        List<Word> words = this.wordMapper.queryAllByUserIdAndSign(userId, sign);
        return words;
    }

    /**
     * 查询分页信息
     *
     * @param pageNum  当前页数
     * @param pageSize 每页记录数
     * @param userId   用户id
     * @param sign     单词状态
     * @return 分页列表
     */
    @Override
    public PageInfo<Word> findAllWordByPageS(Integer pageNum, Integer pageSize, Integer userId, Integer sign) {
        PageHelper.startPage(pageNum, pageSize);
        List<Word> words = this.wordMapper.queryAllByUserIdAndSign(userId, sign);
        PageInfo<Word> pageInfo = new PageInfo<>(words);
        return pageInfo;
    }

    /**
     * 按照单词搜索单词信息
     *
     * @param pageNum  当前页数
     * @param pageSize 每页记录数
     * @param word     单词信息
     * @return
     */
    @Override
    public PageInfo<Word> searchWordByPageS(Integer pageNum, int pageSize, Word word) {
        PageHelper.startPage(pageNum, pageSize);
        List<Word> words = this.wordMapper.queryAll(word);
        PageInfo<Word> pageInfo = new PageInfo<>(words);
        return pageInfo;
    }

    /**
     * 初始化单词放入redis中--盲式英文学习、挑战接龙、测测实力
     *
     * @param userId 用户编号
     * @param knum   掌握单词数
     * @param uknum  非掌握单词数
     * @param key   redis的key
     */
    @Override
    public void studyModule(Integer userId, int knum, int uknum, String key) {
        //判断redis是否存在key
        if (redisUtils.exists(key)) {
            //存在则判断redis长度是否为knum+uknum
            if (redisUtils.size(key) == (knum + uknum)) {
                //相等则结束方法
                log.info("缓存可以再次利用！");
                return;
            }
            //否则删除redis数据，从数据库查询数据，放入redis中
            redisUtils.delete(key);
            List<Word> list = wordMapper.queryByKnumAndUknum(userId, knum, uknum);
            for (Word word : list) {
                redisUtils.leftPush(key, JsonUtils.objectToJson(word));
            }
            return;
        }
        //redis不存在key，从数据库查询数据放入redis中
        List<Word> list = wordMapper.queryByKnumAndUknum(userId, knum, uknum);
        for (Word word : list) {
            redisUtils.leftPush(key, JsonUtils.objectToJson(word));
        }

    }

}