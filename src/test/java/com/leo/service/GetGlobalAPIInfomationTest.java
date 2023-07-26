package com.leo.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.leo.constant.PeopleSoftOpenApiConstant;
import com.leo.dto.AlarmNoticeRecordDTO;
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
public class GetGlobalAPIInfomationTest {

    public String TOKEN = "305291690337089044";

    @Test
    public void getAlarmInformation(){

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();

        headers.set("token",TOKEN);

        HttpEntity<String> httpEntity = new HttpEntity<>(headers);

        String url = PeopleSoftOpenApiConstant.GLOBAL_ALARM_RECORD +
                "?beginTime=2023-07-10 11:39:58" +
                "&endTime=2023-07-21 11:39:58";

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                httpEntity,
                String.class
        );

        JSONObject jsonObject = JSON.parseObject(responseEntity.getBody());

        String jsonObjectString = jsonObject.getString("data");

        List<AlarmNoticeRecordDTO> alarmNoticeRecordDTOS = JSONObject.parseArray(jsonObjectString, AlarmNoticeRecordDTO.class);

        alarmNoticeRecordDTOS.forEach(System.out::println);


    }





}
