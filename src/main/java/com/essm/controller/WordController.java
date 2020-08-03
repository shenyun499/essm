package com.essm.controller;

import com.essm.common.CookieUtils;
import com.essm.common.JsonUtils;
import com.essm.common.RedisUtils;
import com.essm.entity.Plain;
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

    @Autowired
    private RedisUtils redisUtils;

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
     * 获取更新信息
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
        if (word.getSign() == 1) {
            return "redirect:/kwords/list/1";
        }
        return "redirect:/ukwords/list/1";
    }

    /**
     * 根据单词id查询单词信息
     *
     * @param id
     * @return
     */
    @ResponseBody
    @GetMapping("/word/{id}")
    public Word getWord(@PathVariable("id") Integer id) {
        return wordService.queryById(id);
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

    @ResponseBody
    @GetMapping("/addKnowWord")
    public void addKnowWord(Word word, HttpServletRequest request) {
        word.setSign(1);
        wordService.update(word);
        //记录今日计划加1
        //根据cookie得到当前客户端的用户id
        Integer userid = cookieUtils.getUserIdByCookie(request.getCookies());
        plainService.updateAddKnowWord(userid);
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
        PageInfo<Word> pageInfoList = wordService.searchWordByPageS(1, 1, word);
        System.out.println(pageInfoList);
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
        System.out.println(pageInfoList);
        return "/unknowwords.html";
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
        PageInfo<Word> pageInfoList = wordService.findAllWordByPageS(id, 9, userid, 1);
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
        PageInfo<Word> pageInfoList = wordService.findAllWordByPageS(id, 9, userid, 2);
        model.addAttribute("words", pageInfoList);
        return "/unknowwords.html";
    }

    /**
     * 得到未掌握单词库的所有单词信息、分页信息
     *
     * @param request
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/studys/list/{id}")
    public String queryPageInfoS(HttpServletRequest request, @PathVariable Integer id, Model model) {
        //根据cookie得到当前客户端的用户id
        Integer userid = cookieUtils.getUserIdByCookie(request.getCookies());
        PageInfo<Word> pageInfoList = wordService.findAllWordByPageS(id, 16, userid, 2);
        model.addAttribute("words", pageInfoList);
        return "/studydetail_c.html";
    }

    /**
     * 将单词置为掌握状态
     *
     * @param word 单词
     * @param pageNum 当前页数
     * @return
     */
    @GetMapping("/addKnow")
    public String addWordKnow(HttpServletRequest request, Word word, Integer pageNum) {
        word.setSign(1);
        wordService.update(word);
        //记录今日计划加1
        //根据cookie得到当前客户端的用户id
        Integer userid = cookieUtils.getUserIdByCookie(request.getCookies());
        plainService.updateAddKnowWord(userid);
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

    /**
     * 格式化库操作
     *
     * @param password 密码
     * @return
     */
    @ResponseBody
    @PostMapping("/deleteAllWord")
    public Map<String, Integer> deleteAllWord(HttpServletRequest request, @RequestParam("password") String password) {
        Map<String, Integer> map = new HashMap<>();
        Integer userId = cookieUtils.getUserIdByCookie(request.getCookies());
        Integer result = wordService.deleteAllWord(userId, password);
        map.put("status", result);
        return map;
    }

    /**
     * 接龙挑战--中文---初始化操作，直接开始或将单词放入redis中
     *
     * @param request
     */
    @ResponseBody
    @PostMapping("/study/start")
    public void studyStart(HttpServletRequest request) {
        Integer cookie = cookieUtils.getUserIdByCookie(request.getCookies());
        wordService.studyModule(cookie, 12, 3, cookie + "study");

        //盲式学习次数增加1
        plainService.updateAddStudy(cookie);
    }

    /**
     * 接龙挑战--中文---初始化操作，直接开始或将单词放入redis中
     *
     * @param request
     */
    @ResponseBody
    @PostMapping("/game/start")
    public void gameStart(HttpServletRequest request, @RequestParam("knum") Integer knum, @RequestParam("uknum") Integer uknum) {
        Integer cookie = cookieUtils.getUserIdByCookie(request.getCookies());
        wordService.studyModule(cookie, knum, uknum, cookie + "game");

        //状态记录英文接龙增加1
        plainService.updateAddGame(cookie);
    }

    /**
     * 测测实力---初始化操作，直接开始或将单词放入redis中
     *
     * @param request
     */
    @ResponseBody
    @PostMapping("/test/start")
    public void testStart(HttpServletRequest request) {
        Integer cookie = cookieUtils.getUserIdByCookie(request.getCookies());
        wordService.studyModule(cookie, 15, 5, cookie + "test");
    }

    /**
     * 从redis中得到一个单词
     *
     * @param request
     * @param key
     * @return
     */
    @ResponseBody
    @PostMapping("/getWord")
    public Word getWordFromRedis(HttpServletRequest request, @RequestParam("key") String key) {
        key = cookieUtils.getUserIdByCookie(request.getCookies()) + key;
        return JsonUtils.jsonToPojo(redisUtils.leftPeek(key).toString(), Word.class);
    }

    /**
     * 移除并从redis中得到一个单词
     *
     * @param request
     * @param key
     * @return
     */
    @ResponseBody
    @PostMapping("/getAndRemoveWord")
    public Word getAndRemoveWordFromRedis(HttpServletRequest request, @RequestParam("key") String key) {
        key = cookieUtils.getUserIdByCookie(request.getCookies()) + key;
        JsonUtils.jsonToPojo(redisUtils.leftPop(key).toString(), Word.class);
        return JsonUtils.jsonToPojo(redisUtils.leftPeek(key).toString(), Word.class);
    }

    /**
     * 从redis中移除一个单词
     *
     * @param request
     * @param key
     * @return
     */
    @ResponseBody
    @PostMapping("/removeWord")
    public Word removeFromRedis(HttpServletRequest request, @RequestParam("key") String key) {
        key = cookieUtils.getUserIdByCookie(request.getCookies()) + key;
        return JsonUtils.jsonToPojo(redisUtils.leftPop(key).toString(), Word.class);
    }

    /**
     * 清空对应的redis的key
     *
     * @param key
     */
    @ResponseBody
    @PostMapping("/clearAll")
    public Boolean clearRedisKey(HttpServletRequest request, @RequestParam("key") String key) {
        key = cookieUtils.getUserIdByCookie(request.getCookies()) + key;
        return redisUtils.delete(key);
    }

    /**
     * 记录位置，中文学习====记录对应的redis的key
     *
     * @param sign
     */
    @ResponseBody
    @PostMapping("/sign")
    public void setKey(HttpServletRequest request, String sign) {
        String key = cookieUtils.getUserIdByCookie(request.getCookies()) + "sign";
        redisUtils.set(key, sign);
    }

    /**
     * 获取位置，中文学习====获取对应的redis的key
     *
     */
    @ResponseBody
    @PostMapping("/getsign")
    public String getKey(HttpServletRequest request) {
        String key = cookieUtils.getUserIdByCookie(request.getCookies()) + "sign";
        return redisUtils.get(key);
    }
}