package com.essm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author xuexue
 * @Date 2020/4/25 11:20
 */
@Controller
public class TestController {
    @RequestMapping(value = "/aa")
    public String test() {
        return "index";
    }
}
