package com.essm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description
 * 扩展SpringMVC功能
 * 1、固定页面跳转
 * 2、拦截器
 * @Author xuexue
 * @Date 2020/5/19 19:52
 */
@Configuration
public class EssmMvcConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/essm.html").setViewName("index");
        registry.addViewController("/essm").setViewName("index");
        registry.addViewController("/schedule.html").setViewName("schedule");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/header.html").setViewName("header");
    }
}
