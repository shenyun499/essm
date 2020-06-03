package com.essm.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.Cookie;

/**
 * @Description
 * @Author xuexue
 * @Date 2020/5/27 20:31
 */
@Configuration
public class CookieUtils {
    /**
     * 根据cookie得到当前客户端的id
     *
     * @param cookies cookie数组
     * @return
     */
    public Integer getUserIdByCookie(Cookie[] cookies) {
        Integer id = 0;
        for (Cookie cookie : cookies) {
            if ("userid".equals(cookie.getName())) {
                id = Integer.parseInt(cookie.getValue());
            }
        }
        return id;
    }

}
