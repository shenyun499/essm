package com.essm.controller;

import com.essm.config.HttpAPIService;
import com.essm.entity.GenericDTO;
import com.essm.entity.GetNonStandardPersonAddrRspDTO;
import com.essm.entity.GetPersonAddrReqDTO;
import com.essm.entity.JsonUtils;
import io.swagger.annotations.Api;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author ：HUANG ZHI XUE
 * @date ：Create in 2020-09-07
 */
@Api(tags = "测试http")
@RestController
public class TestCon {
    @Autowired
    private HttpAPIService httpAPIService;

    private final static String host = "http://192.168.239.185:8830";
    private final static String path = "/cust/maintainPersonAddr/getNonStandardPersonAddr";

    @PostMapping("/essm/")
    public GenericDTO<GetNonStandardPersonAddrRspDTO> getRe(@Validated @RequestBody GenericDTO<GetPersonAddrReqDTO> reqDto) {
        return this.synHttpClientToOther(reqDto);
    }

    @PostMapping("/essm/test")
    public GenericDTO<GetNonStandardPersonAddrRspDTO> test(@Validated @RequestBody GenericDTO<GetPersonAddrReqDTO> reqDto) {
        GenericDTO<GetNonStandardPersonAddrRspDTO> rsp = new GenericDTO<>();
        GetNonStandardPersonAddrRspDTO getNonStandardPersonAddrRspDTO = new GetNonStandardPersonAddrRspDTO();
        getNonStandardPersonAddrRspDTO.setCiNo("22");
        getNonStandardPersonAddrRspDTO.setAddrNo(1);
        rsp.setBody(getNonStandardPersonAddrRspDTO);
        return rsp;
    }

    /**
     * 通过HttpClient调用它方接口
     *
     * @return 返回响应结果
     */
    public GenericDTO<GetNonStandardPersonAddrRspDTO> synHttpClientToOther(GenericDTO<GetPersonAddrReqDTO> reqDto) {
        GenericDTO<GetNonStandardPersonAddrRspDTO> rspDto = new GenericDTO<>();
        //格式化请求参数
        String parameter = JsonUtils.toJSON(reqDto);

        //调用它方接口
        try {
            String result = httpAPIService.doPostByJsonParm(host + path, parameter);
            //不为kong则，转成对象返回
            if (StringUtils.isNotEmpty(result)) {
                //转成对象
                rspDto = JsonUtils.toBean(result, GenericDTO.class);
                rspDto.setBody(JsonUtils.toBean(rspDto.getBody(), GetNonStandardPersonAddrRspDTO.class));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rspDto;
    }
}
