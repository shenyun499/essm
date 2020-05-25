package com.essm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
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

        /*引入页面跳转*/
        registry.addViewController("/schedule.html").setViewName("schedule");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/header.html").setViewName("header");

        /*学习模块页面跳转*/
        registry.addViewController("/planmodule.html").setViewName("planmodule");
        registry.addViewController("/studymodule.html").setViewName("studymodule");
        registry.addViewController("/gamemodule.html").setViewName("gamemodule");
        registry.addViewController("/testwords_s.html").setViewName("testwords_s");

        /*导航栏页面跳转*/
        registry.addViewController("/plibrary.html").setViewName("plibrary");
        registry.addViewController("/knowwords.html").setViewName("knowwords");
        registry.addViewController("/unknowwords.html").setViewName("unknowwords");
        registry.addViewController("/introduction.html").setViewName("introduction");

        /*个人库页面跳转*/
        registry.addViewController("/addword.html").setViewName("addword");
    }

    /**
     * 登录拦截器
     *
     * @param registry
     */
    public void addInterceptors(InterceptorRegistry registry) {
        String[] excludes = new String[]{"/login.html", "/essm", "/header.html", "/essm.html", "/static/**"};
        registry.addInterceptor(new MyInterceptor()).
                addPathPatterns("/**").
                excludePathPatterns(excludes);
    }

    /**
     * 添加静态资源文件，外部可以直接访问地址
     *
     * @param registry
     */
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
}
