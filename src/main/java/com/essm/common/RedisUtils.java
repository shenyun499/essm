package com.essm.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @Description
 * 封装了redis的简单功能
 * @Author xuexue
 * @Date 2020/6/415:40
 */
@Configuration
public class RedisUtils {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 单个元素进入队列
     *
     * @param key
     * @param value 一个值
     * @return
     */
    public Long leftPush(Object key, Object value) {
        return redisTemplate.opsForList().leftPush(key, value);
    }

    /**
     * 多个元素进入队列
     *
     * @param key
     * @param value 可以是多个值，或者list等
     * @return
     */
    public Long leftPushAll(Object key, Object value) {
        return redisTemplate.opsForList().leftPushAll(key, value);
    }

    /**
     * 获取队列单个值，从左边弹出移除
     * @param key
     * @return
     */
    public Object leftPop(Object key) {
        return redisTemplate.opsForList().leftPop(key);
    }

    /**
     * 得到队列第一个值，不移除
     *
     * @param key
     * @return
     */
    public Object leftPeek(Object key) {
        return redisTemplate.opsForList().index(key, 0);
    }

    /**
     * 获取队列长度
     *
     * @param key
     * @return
     */
    public Long size(Object key) {
        return redisTemplate.opsForList().size(key);
    }

    /**
     * 重写系列化器，防止乱码
     *
     */
    @Bean
    public void setRedisTemplate() {
        RedisSerializer stringSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringSerializer);
        redisTemplate.setValueSerializer(stringSerializer);
        redisTemplate.setHashKeySerializer(stringSerializer);
        redisTemplate.setHashValueSerializer(stringSerializer);
    }
}
