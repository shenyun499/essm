package com.essm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author xuexue
 * @Date 2020/4/25 11:20
 */
@RestController
public class TestController {
    @RequestMapping(value = "/")
    public String test() {
        return "hello";
    }
}
