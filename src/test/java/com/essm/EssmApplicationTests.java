package com.essm;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
class EssmApplicationTests {

    @Autowired
    DataSource dataSource;

	@Test
	void contextLoads() throws Exception {
    }
}
