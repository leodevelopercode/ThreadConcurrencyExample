package com.leo.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.leo.constant.PeopleSoftOpenApiConstant;
import com.leo.dto.worm.WormStatisticItemDTO;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author leo
 * @version 1.0
 */
public class GetWormDeviceInfomationTest {

    public String TOKEN = "540091690182776887";

    @Test
    public void getWormDeviceInfomation(){

        RestTemplate restTemplate = new RestTemplate();

        String url = PeopleSoftOpenApiConstant.WORM_STATISTICS_BY_GROUP +
                "?beginTime=2023-07-10 11:39:58" +
                "&endTime=2023-07-21 11:39:58";

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("token",TOKEN);

        HttpEntity<String> httpEntity = new HttpEntity<>(httpHeaders);

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                httpEntity,
                String.class
        );



        JSONObject jsonObject = JSON.parseObject(responseEntity.getBody());

        if ("10001".equals(jsonObject.getString("code"))){
            System.out.println("GetWormDeviceInfomationTest.getWormDeviceInfomation");
        }

        String jsonObjectString = jsonObject.getString("data");

        List<WormStatisticItemDTO> wormStatisticItemDTOS = JSONObject.parseArray(
                jsonObjectString,
                WormStatisticItemDTO.class
        );

        wormStatisticItemDTOS.forEach(System.out::println);

    }


}
