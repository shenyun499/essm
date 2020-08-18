package com.essm.controller;

import com.essm.entity.WordDO;
import com.essm.remote.WordReqDTO;
import com.essm.remote.WordRspDTO;
import com.essm.service.WordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 单词控制层
 *
 * @author ：HUANG ZHI XUE
 * @date ：Create in 2020-08-18
 */
@RestController
@Api(tags = "单词管理")
public class WordController {

    @Autowired
    WordService wordService;

    @ApiOperation(notes = "单词管理", value = "单词管理-查询接口")
    @ApiResponse(code = 200, message = "查询成功")
    @PostMapping("/listWordInfo")
    public List<WordRspDTO> listWordInfo(@Validated @RequestBody WordReqDTO reqDto) {
        return wordService.listWordInfo(reqDto);
    }
}
