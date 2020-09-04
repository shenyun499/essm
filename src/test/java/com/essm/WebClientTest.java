package com.essm;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * WebClient测试，通过http调用它方接口
 *
 * @author ：HUANG ZHI XUE
 * @date ：Create in 2020-09-03
 */
public class WebClientTest {
    private final static String host = "http://192.168.239.32:8830";
    private final static String path = "/cust/maintainPersonAddr/getNonStandardPersonAddr";

    /**
     * 通过WebClient调用它方接口
     *
     * @param reqDto
     * @return
     */
    public static GenericDTO<GetNonStandardPersonAddrRspDTO> getToByWebClientFromOther(GenericDTO<GetPersonAddrReqDTO> reqDto) {
        //get提交
        /*WebClient webClient = WebClient.create();
        Mono<String> mono = webClient.get().uri("https://www.baidu.com").retrieve().bodyToMono(String.class);
        System.out.println(mono.block());*/

        Mono<String> mono = null;
        //将请求参数转成json
        String reqDtos = JsonUtils.toJSON(reqDto);
        //post请求调用第三方接口
        mono = WebClient.create().post().uri(host + path)
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(reqDtos)
                .retrieve().bodyToMono(String.class);

        //格式化响应信息
        String response = mono.block();
        GenericDTO rspDto = JsonUtils.toBean(response, GenericDTO.class);
        rspDto.setBody(JsonUtils.toBean(rspDto.getBody(), GetNonStandardPersonAddrRspDTO.class));
        return rspDto;
    }

    /**
     * 通过HttpClient调用它方接口
     *
     * @return 返回响应结果
     */
    public static GenericDTO<GetNonStandardPersonAddrRspDTO> synHttpClientToOther(GenericDTO<GetPersonAddrReqDTO> reqDto) {
        //通过http形式调用其它系统接口同步信息
        //调用接口
        HttpClient client = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(host + path);
        httpPost.setHeader("Content-Type", "application/json;charset=UTF-8");
        String results = null;
        String parameter = JsonUtils.toJSON(reqDto);
        try {
            StringEntity se = new StringEntity(parameter);
            se.setContentType("text/json");
            httpPost.setEntity(se);
            //设置超时
            //RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(5000).setSocketTimeout(2000).build();
            //httpPost.setConfig(requestConfig);

            //执行调用
            HttpResponse response = client.execute(httpPost);

            //返回信息
            HttpEntity entity = response.getEntity();
            results = EntityUtils.toString(entity, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //转成对象
        GenericDTO rspDto = JsonUtils.toBean(results, GenericDTO.class);
        rspDto.setBody(JsonUtils.toBean(rspDto.getBody(), GetNonStandardPersonAddrRspDTO.class));
        return rspDto;
    }

    @Test
    public void getToByWebClientFromOtherTest() {
        GenericDTO<GetPersonAddrReqDTO> reqDto = new GenericDTO<>();
        GetPersonAddrReqDTO getDto = new GetPersonAddrReqDTO();
        getDto.setCiNo("50000032");
        getDto.setAddrNo(1);
        reqDto.setBody(getDto);

        //WebClient调用
        GenericDTO<GetNonStandardPersonAddrRspDTO> rspDto = getToByWebClientFromOther(reqDto);
        System.out.println(rspDto.getBody().toString());
    }
}
