package com.essm.config;

import org.springframework.web.servlet.HandlerInterceptor;

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
        Object obj = request.getSession().getAttribute("essm");
        /*if (obj == null) {
            //request.getRequestDispatcher("/essm").forward(request, response);
            //response.sendRedirect(request.getContextPath() + "/essm");
            return false;
        }*/
        return true;
    }
}
