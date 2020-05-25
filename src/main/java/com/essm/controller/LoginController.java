package com.essm.controller;

import com.essm.entity.User;
import com.essm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpCookie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * 登录控制层
 * @Author xuexue
 * @Date 2020/5/24 22:22
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/login")
    public Map<String, String> loginCheck(User user, HttpServletResponse response) throws IOException {
        Map<String, String> map = new HashMap<>();
        user = userService.queryByUser(user);
        System.out.println(user);
        if (user != null) {
            map.put("status", "1");

            //设置cookie
            Cookie cookie = new Cookie("cookie", "true");
            cookie.setMaxAge(60*60*24);
            Cookie u_cookie = new Cookie("u_cookie", user.getUsername());
            u_cookie.setMaxAge(60*60*24);
            response.addCookie(cookie);
            response.addCookie(u_cookie);

            return map;
        }
        map.put("status", "2");
        return map;
    }

}
