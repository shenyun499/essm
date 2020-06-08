package com.essm.controller;

import com.essm.entity.User;
import com.essm.service.UserService;
import com.essm.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * 登录控制层
 * @Author xuexue
 * @Date 2020/5/24 22:22
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private WordService wordService;

    /**
     * 登录--跳转到主页
     * 查询所有数据
     * @param model
     * @return
     */
    @RequestMapping(value = "/admin")
    public String toIndex(Model model) {
        List<User> users = userService.queryAll();
        model.addAttribute("users", users);
        return "/admin";
    }

    /**
     * 用户添加功能实现
     * @param user
     * @return
     */
    @PostMapping(value = "/user")
    public String addUser(User user) {
        userService.insert(user);
        return "redirect:/admin";
    }

    /**
     * 根据id查询需要修改的变量，跳转到修改页面
     * @param id
     * @return
     */
    @GetMapping(value = "/user/{id}")
    public String toUpdateUserPage(@PathVariable("id") Integer id, Model model) {
        User user = userService.queryById(id);
        model.addAttribute("user", user);
        return "/admin_query.html";
    }

    /**
     * 更新功能
     * @param user
     * @return
     */
    @PutMapping(value = "/user")
    public String updateUser(User user) {
        userService.update(user);
        return "redirect:/admin";

    }

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "/user/{id}")
    public String deleteUser(@PathVariable Integer id) {
        //删除用户所有信息
        User user = userService.queryById(id);
        wordService.deleteAllWord(id, user.getPassword());
        userService.deleteById(id);
        return "redirect:/admin";
    }


}
