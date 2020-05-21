package com.essm.controller;

import com.essm.dao.UserMapper;
import com.essm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author xuexue
 * @Date 2020/4/25 11:20
 */
@Controller
public class TestController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/aa")
    public String test() {
        return "index";
    }

    @ResponseBody
    @GetMapping(value = "/dept/{id}")
    public User selectById(@PathVariable Integer id) {
        return userMapper.selectById(id);
    }

}
