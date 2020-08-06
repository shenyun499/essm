package com.essm;

import com.essm.common.JsonUtils;
import com.essm.common.RedisUtils;
import com.essm.dao.WordMapper;
import com.essm.entity.Word;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;

@RunWith(SpringRunner.class)
@SpringBootTest
class EssmApplicationTests {
    /*@Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
	RedisTemplate redisTemplate;

    @Autowired
    RedisUtils redisUtils;

    @Autowired
    WordMapper wordMapper;*/

    @Autowired
    DataSource dataSource;

	@Test
	void contextLoads() throws Exception {
	    //SpringBoot2.2.6 默认是com.zaxxer.hikari.HikariDataSource使用作为数据源，版本不同不一样；有些低版本用了tomcat
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

	/*@Test
    public void redisTest() {
        Word word = wordMapper.queryById(1);
        String stringWord = JsonUtils.objectToJson(word);
        redisUtils.leftPush("ids", stringWord);
        System.out.println(redisUtils.exists("ids"));
        System.out.println("-----删除key" + redisUtils.delete("ids"));
        System.out.println(redisUtils.exists("ids"));

        System.out.println(JsonUtils.jsonToPojo(redisUtils.leftPeek("1test").toString(), Word.class));
        //System.out.println(JsonUtils.jsonToPojo(redisUtils.leftPeek("1test").toString(), Word.class));
    }*/



}
