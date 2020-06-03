package com.essm.controller;

import com.essm.common.CookieUtils;
import com.essm.entity.Word;
import com.essm.service.PlainService;
import com.essm.service.WordService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.net.Inet4Address;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * 单词表(Word)表控制层
 *
 * @author xuexue
 * @Date 2020-05-23 20:01:44
 */
@Controller
public class WordController {

    /**
     * 服务对象
     */
    @Resource
    private WordService wordService;

    @Autowired
    private CookieUtils cookieUtils;

    @Autowired
    private PlainService plainService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ResponseBody
    @GetMapping("selectOne/{id}")
    public Word selectOne(@PathVariable Integer id) {
        return this.wordService.queryById(id);
    }

    /**
     * 添加单词
     *
     * @param word 单词实体
     * @return
     */
    @PostMapping("word")
    public String addWord(Word word, HttpServletRequest request) {
        //根据cookie得到当前客户端的用户id
        Integer userid = cookieUtils.getUserIdByCookie(request.getCookies());
        //保存用户id
        word.setPid(userid);
        //添加单词
        wordService.insert(word);
        //计划记忆
        plainService.updateAddWord(userid);
        return "redirect:/plibrary.html";
    }

    /**
     * 跳转到更新页面
     *
     * @param id
     * @return
     */
    @ResponseBody
    @PostMapping("/word/{id}")
    public Word toUpdateWord(@PathVariable("id") Integer id) {
        Word word = wordService.queryById(id);
        return word;
    }

    /**
     * 更新单词
     *
     * @param word 单词
     * @return
     */
    @PutMapping("/word")
    public String queryWord(Word word) {
        wordService.update(word);
        System.out.println("更新成功");
        if (word.getSign() == 1) {
            return "redirect:/kwords/list/1";
        }
        return "redirect:/ukwords/list/1";
    }

    /**
     * 删除单词
     *
     * @param id 单词id
     * @param sign 决定跳转地址
     * @return
     */
    @DeleteMapping("/word/{id}")
    public String deleteWord(@PathVariable("id") Integer id, Integer sign) {
        wordService.deleteById(id);
        if (sign == 1) {
            return "redirect:/kwords/list/1";
        }
        return "redirect:/ukwords/list/1";
    }

    /**
     * 搜索获取信息
     *
     * @param request 请求封装
     * @param id
     * @param word 单词信息
     * @param model 视图封装
     * @return
     */
    @PostMapping("/kwords/search/{id}")
    public String searchByWord(HttpServletRequest request, @PathVariable Integer id, Word word, Model model) {
        //根据cookie得到当前客户端的用户id
        Integer userid = cookieUtils.getUserIdByCookie(request.getCookies());
        word.setPid(userid);
        PageInfo<Word> pageInfoList = wordService.searchWordByPageS(id, 1, word);
        model.addAttribute("words", pageInfoList);
        return "/knowwords.html";
    }

    /**
     * 搜索获取信息
     *
     * @param request 请求封装
     * @param id
     * @param word 单词信息
     * @param model 视图封装
     * @return
     */
    @PostMapping("/ukwords/search/{id}")
    public String searchByWordU(HttpServletRequest request, @PathVariable Integer id, Word word, Model model) {
        //根据cookie得到当前客户端的用户id
        Integer userid = cookieUtils.getUserIdByCookie(request.getCookies());
        word.setPid(userid);
        PageInfo<Word> pageInfoList = wordService.searchWordByPageS(id, 2, word);
        model.addAttribute("words", pageInfoList);
        return "/uknowwords.html";
    }

    /**
     * 得到掌握单词库的所有单词信息、分页信息
     *
     * @param request
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/kwords/list/{id}")
    public String queryPageInfo(HttpServletRequest request, @PathVariable Integer id, Model model) {
        //根据cookie得到当前客户端的用户id
        Integer userid = cookieUtils.getUserIdByCookie(request.getCookies());
        PageInfo<Word> pageInfoList = wordService.findAllWordByPageS(id, 2, userid, 1);
        model.addAttribute("words", pageInfoList);
        return "/knowwords.html";
    }

    /**
     * 得到未掌握单词库的所有单词信息、分页信息
     *
     * @param request
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/ukwords/list/{id}")
    public String queryPageInfoU(HttpServletRequest request, @PathVariable Integer id, Model model) {
        //根据cookie得到当前客户端的用户id
        Integer userid = cookieUtils.getUserIdByCookie(request.getCookies());
        PageInfo<Word> pageInfoList = wordService.findAllWordByPageS(id, 2, userid, 2);
        model.addAttribute("words", pageInfoList);
        return "/unknowwords.html";
    }

    /**
     * 将单词置为掌握状态
     *
     * @param word 单词
     * @param pageNum 当前页数
     * @return
     */
    @GetMapping("/addKnow")
    public String addWordKnow(Word word, Integer pageNum) {
        word.setSign(1);
        wordService.update(word);
        return "redirect:/ukwords/list/"+pageNum;
    }

    /**
     * 将单词置为未掌握状态
     *
     * @param word 单词
     * @param pageNum 当前页数
     * @return
     */
    @GetMapping("/removeKnow")
    public String removeWordKnow(Word word, Integer pageNum) {
        word.setSign(2);
        wordService.update(word);
        return "redirect:/kwords/list/"+pageNum;
    }
}