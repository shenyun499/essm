package com.essm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger配置
 *
 * @author ：HUANG ZHI XUE
 * @date ：Create in 2020-08-13
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.essm.controller"))
                .paths(PathSelectors.any())
                .build();

    }
    //设置swagger的一些信息
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger2")
                .description("RESTful API接口")
                .version("1.0.1")
                .build();
    }
}

