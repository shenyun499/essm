package com.essm.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description
 * 登录拦截器
 * @Author xuexue
 * @Date 2020/5/24 21:54
 */
public class MyInterceptor implements HandlerInterceptor {

    /**
     * 登录前拦截
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            return false;
        } else {
            for (Cookie cookie : cookies) {
                if ("userid".equals(cookie.getName())) {
                    return true;
                }
            }
            return false;
        }
    }
}
