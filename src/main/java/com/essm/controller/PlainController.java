package com.essm.controller;

import com.essm.common.CookieUtils;
import com.essm.entity.Plain;
import com.essm.service.PlainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 计划表(Plain)表控制层
 *
 * @author makejava
 * @since 2020-06-03 10:28:34
 */
@Controller
@RequestMapping("plain")
public class PlainController {
    /**
     * 服务对象
     */
    @Resource
    private PlainService plainService;

    @Autowired
    private CookieUtils cookieUtils;

    /**
     * 查询计划状态
     *
     * @param request
     * @param plain 对象实例，接收请求信息
     * @return
     */
    @ResponseBody
    @PostMapping("/status")
    public Plain queryByDate(HttpServletRequest request, Plain plain) {
        Integer userId = cookieUtils.getUserIdByCookie(request.getCookies());
        plain.setPid(userId);
        return plainService.queryByDate(plain);
    }

    @RequestMapping("/add")
    public String addPlain(HttpServletRequest request, Plain plain) {
        Integer userId = cookieUtils.getUserIdByCookie(request.getCookies());
        plain.setPid(userId);
        plainService.update(plain);
        return "redirect:/planmodule.html";
    }

}