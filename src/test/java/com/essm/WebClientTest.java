package com.essm;

import io.netty.channel.ChannelOption;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * WebClient测试，通过http调用它方接口
 *
 * @author ：HUANG ZHI XUE
 * @date ：Create in 2020-09-03
 */
public class WebClientTest {
    private final static String host = "http://192.168.239.185:8830";
    private final static String path = "/cust/maintainPersonAddr/getNonStandardPersonAddr";

    /**
     * 通过WebClient调用它方接口
     *
     * @param reqDto
     * @return
     */
    public static GenericDTO<GetNonStandardPersonAddrRspDTO> getToByWebClientFromOther(GenericDTO<GetPersonAddrReqDTO> reqDto) {
        Mono<String> mono = null;
        //将请求参数转成json
        String reqDtos = JsonUtils.toJSON(reqDto);
        //post请求调用第三方接口
        mono = WebClient.create().post().uri(host + path)
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(reqDtos)
                //获取响应体
                .retrieve()
                //响应数据类型转换
                .bodyToMono(String.class);

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
        //创建HttpClient对象
        try(CloseableHttpClient httpClient = HttpClients.createDefault()) {
            //设置请求路径，请求格式
            HttpPost httpPost = new HttpPost(host + path);
            httpPost.setHeader("Content-Type", "application/json;charset=UTF-8");

            //格式化请求数据并设值
            String parameter = JsonUtils.toJSON(reqDto);
            StringEntity se = new StringEntity(parameter);
            se.setContentType("text/json");
            httpPost.setEntity(se);

            //设置超时,连接超时：setConnectTimeout；传输超时：setSocketTimeout
            RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(1000).setSocketTimeout(10000).build();
            httpPost.setConfig(requestConfig);

            try (CloseableHttpResponse response = httpClient.execute(httpPost)) {
                //返回信息
                if (response.getStatusLine().getStatusCode() == 200) {
                    String results = EntityUtils.toString(response.getEntity(), "UTF-8");
                    //转成对象
                    GenericDTO rspDto = JsonUtils.toBean(results, GenericDTO.class);
                    rspDto.setBody(JsonUtils.toBean(rspDto.getBody(), GetNonStandardPersonAddrRspDTO.class));
                    return rspDto;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Test
    public void getToByWebClientFromOtherTest() {
        GenericDTO<GetPersonAddrReqDTO> reqDto = new GenericDTO<>();
        GetPersonAddrReqDTO getDto = new GetPersonAddrReqDTO();
        getDto.setCiNo("50000032");
        getDto.setAddrNo(1);
        reqDto.setBody(getDto);

        //WebClient调用
        //GenericDTO<GetNonStandardPersonAddrRspDTO> rspDto = getToByWebClientFromOther(reqDto);
        //System.out.println(rspDto.getBody().toString());
        GenericDTO<GetNonStandardPersonAddrRspDTO> rspDto = synHttpClientToOther(reqDto);
        System.out.println(rspDto);

    }

    /*@Test
    public void test2() {
        //初始数组
        int[] arr = new int[]{-1, 8, -7, 6, -10, -3, 3, 2};
        //假设最大值起始索引initIndex=0，连续最大和为0
        int initIndex = 0, maxValue = -1 + 8 -7;
        for (int i = 1; i < arr.length - 2; i++) {
            int sum = arr[i] + arr[i + 1] + arr[i + 2];
            //如果遇到连续和比记录最大值大，则记录索引和最大值
            if (sum > maxValue) {
                maxValue = sum;
                initIndex = i;
            }
        }
        System.out.println(initIndex + "," + (initIndex + 1) + "," + (initIndex + 2));
    }*/
}
