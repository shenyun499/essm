package com.essm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan(basePackages = "com.essm")
@SpringBootApplication
public class EssmApplication {

	public static void main(String[] args) {
		SpringApplication.run(EssmApplication.class, args);
	}

}
