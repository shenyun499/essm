package com.essm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.essm.dao")
@SpringBootApplication
public class EssmApplication {

	public static void main(String[] args) {
		SpringApplication.run(EssmApplication.class, args);
	}

}
