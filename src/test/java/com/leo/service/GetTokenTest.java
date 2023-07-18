package com.leo.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.leo.constant.PeopleSoftOpenApiConstant;
import com.leo.dto.LoginDTO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leo
 * @version 1.0
 */
public class GetTokenTest {


    /**
     * 农业四情登录接口
     */
    @Test
    public void SendApiBeLogin() throws JsonProcessingException {

        RestTemplate restTemplate = new RestTemplate();

        Map<String, Object> requestMap = new HashMap<>();


        ResponseEntity<String> stringResponseEntity = restTemplate.postForEntity(
                PeopleSoftOpenApiConstant.GLOBAL_USER_LOGIN,
                requestMap,
                String.class
        );

        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();

        String stringResponseEntityBody = stringResponseEntity.getBody();

        JSONObject jsonObject = JSON.parseObject(stringResponseEntityBody);

        Object dataObject = jsonObject.get("data");

        // JSON 转换为实体类对象
        LoginDTO javaObject = JSON.toJavaObject((JSON) dataObject, LoginDTO.class);
        System.out.println("javaObject.getToken() = " + javaObject.getToken());

    }

}
