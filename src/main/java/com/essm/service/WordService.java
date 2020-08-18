package com.essm.service;

import com.essm.remote.WordReqDTO;
import com.essm.remote.WordRspDTO;

import java.util.List;

/**
 * 单词业务接口层
 *
 * @author ：HUANG ZHI XUE
 * @date ：Create in 2020-08-18
 */
public interface WordService {
    /**
     * 查询单词集合
     *
     * @param reqDto 请求dto
     * @return 单词集合
     */
    List<WordRspDTO> listWordInfo(WordReqDTO reqDto);
}
