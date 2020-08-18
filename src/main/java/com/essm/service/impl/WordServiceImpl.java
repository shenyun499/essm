package com.essm.service.impl;

import com.essm.entity.WordDO;
import com.essm.mybatis.dao.WordDAO;
import com.essm.remote.WordReqDTO;
import com.essm.remote.WordRspDTO;
import com.essm.service.WordService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：HUANG ZHI XUE
 * @date ：Create in 2020-08-17
 */
@Service("WordServiceImpl")
public class WordServiceImpl implements WordService {

    @Resource
    WordDAO wordDAO;

    @Override
    public List<WordRspDTO> listWordInfo(WordReqDTO reqDto) {
        List<WordRspDTO> rspDto = new ArrayList<>();
        //获取请求信息
        Integer id = reqDto.getId();
        WordDO wordDO = new WordDO();
        wordDO.setId(id);
        List<WordDO> wordDOS = wordDAO.listWordInfo(wordDO);
        for (WordDO word : wordDOS) {
            WordRspDTO wordRspDTO = new WordRspDTO();
            wordRspDTO.setId(word.getId());
            wordRspDTO.setTrl(word.getTrl());
            wordRspDTO.setChinese(word.getChinese());
            wordRspDTO.setEnglish(word.getEnglish());
            wordRspDTO.setSign(word.getSign());
            rspDto.add(wordRspDTO);
        }
        return rspDto;
    }
}
