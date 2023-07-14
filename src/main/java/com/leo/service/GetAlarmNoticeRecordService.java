package com.leo.service;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.leo.constant.PeopleSoftOpenApiConstant;
import com.leo.entities.Rows;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;


/**
 * @author leo
 * @version 1.0
 */
@Service
public class GetAlarmNoticeRecordService {


    /**
     * 报警通知记录
     */
    public void AlarmNoticeRecord() {

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("loginName", "cq230614yny");
        hashMap.put("loginPwd", "cq230614yny");

        String uriString = UriComponentsBuilder.fromHttpUrl(PeopleSoftOpenApiConstant.GLOBAL_USER_LOGIN)
                .toUriString();

        WebClient webClient = WebClient.builder()
                .defaultHeader("Content-Type", "application/json")

                .build();

        Object requestBody = "{\n" +
                "\"loginName\":\"cq230614yny\",\n" +
                "\"loginPwd\":\"cq230614yny\"\n" +
                "}";

        // 处理响应结果
        webClient.method(HttpMethod.POST)
                .uri(uriString)
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(requestBody))
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(string -> {

                    ObjectMapper objectMapper = new ObjectMapper();

                    try {
                        JsonNode jsonNode = objectMapper.readTree(string);

                        Rows data = JSONObject.parseObject(jsonNode.asText("data"), Rows.class);

                        // 提取需要的值
                        String loginSign = jsonNode.get("data").get("loginSign").asText();
                        long currDate = jsonNode.get("data").get("currDate").asLong();
                        long expDate = jsonNode.get("data").get("expDate").asLong();
                        String token = jsonNode.get("data").get("token").asText();

                        // 输出提取的值
                        System.out.println("loginSign: " + loginSign);
                        System.out.println("currDate: " + currDate);
                        System.out.println("expDate: " + expDate);
                        System.out.println("token: " + token);
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }

                });

        System.out.println("GetAlarmNoticeRecordService:获取设备告警记录中...");

    }


    public void RestTemplateAlarmNoticeRecord() {




    }


}
