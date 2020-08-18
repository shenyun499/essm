package com.essm.config;

import com.essm.entity.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import java.net.UnknownHostException;

/**
 * @Description
 * 自定义json序列器，这样子存入redis时不需要将对象转为json字符串都可以实现
 * 该类没有使用，已经在RedisUtils中复写了所有系列化器
 *
 * @Author xuexue
 * @Date 2020/6/4 16:13
 *//*

//@Configuration
*/
public class RedisConfig {

    @Autowired
    RedisTemplate redisTemplate;

    //@Bean
    public RedisTemplate<Object, Word> redisTemplate(RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
        RedisTemplate<Object, Word> template = new RedisTemplate();
        template.setConnectionFactory(redisConnectionFactory);
        Jackson2JsonRedisSerializer<Word> wordJackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<>(Word.class);
        redisTemplate.setDefaultSerializer(wordJackson2JsonRedisSerializer);
        return template;
    }


}

