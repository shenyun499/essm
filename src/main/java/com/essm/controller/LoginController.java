package com.essm.controller;

import com.essm.entity.User;
import com.essm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * 登录控制层
 * @Author xuexue
 * @Date 2020/5/24 22:22
 */
@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Map<String, String> loginCheck(User user, HttpServletResponse response) {
        Map<String, String> map = new HashMap<>();
        user = userService.queryByUser(user);
        //用户不为空，登录成功,设置状态码为1
        if (user != null) {
            map.put("status", "1");
            //设置用户权限，如果是1则是管理员，0为用户，前端控制跳转页面
            map.put("sign", user.getSign().toString());
            //设置cookie
            Cookie cookie = new Cookie("userid", user.getId().toString());
            cookie.setMaxAge(60*60*24);
            Cookie u_cookie = new Cookie("username", user.getUsername());
            u_cookie.setMaxAge(60*60*24);
            response.addCookie(cookie);
            response.addCookie(u_cookie);

            return map;
        }
        //用户为空，设置状态码为2
        map.put("status", "2");
        return map;
    }

    /**
     * 用户退出操作
     *
     * @param request
     * @param response
     * @return
     */
    @PostMapping("/exit")
    public String exit(HttpServletRequest request, HttpServletResponse response) {
        //清除session
        HttpSession session = request.getSession();
        session.invalidate();

        //清除cookie
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }
        return "success";
    }


}
