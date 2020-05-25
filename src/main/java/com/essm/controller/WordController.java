package com.essm.controller;

import com.essm.entity.Word;
import com.essm.service.WordService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

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
    public String addWord(Word word) {
        wordService.insert(word);
        return "redirect:/plibrary.html";
    }

}