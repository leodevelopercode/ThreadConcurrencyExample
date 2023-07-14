package com.leo.service;

import com.leo.constant.PeopleSoftOpenApiConstant;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leo
 * @version 1.0
 */
@SpringBootTest
public class GetTokenTest {

    @Test
    public void SendApiBeLogin() {

        RestTemplate restTemplate = new RestTemplate();

        Map<String, Object> requestMap = new HashMap<>();
        requestMap.put("loginName", "cq230614yny");
        requestMap.put("loginPwd", "cq230614yny");

        ResponseEntity<String> stringResponseEntity = restTemplate.postForEntity(
                PeopleSoftOpenApiConstant.GLOBAL_USER_LOGIN,
                requestMap,
                String.class
        );

        String body = stringResponseEntity.getBody();

        RedisTemplate<String,Object> redisTemplate = new RedisTemplate<>();


        System.out.println("stringResponseEntity.getBody() = " + stringResponseEntity.getBody());

    }

}
