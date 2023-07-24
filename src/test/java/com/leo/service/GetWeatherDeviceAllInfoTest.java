package com.leo.service;

import com.alibaba.fastjson.JSONObject;
import com.leo.constant.PeopleSoftOpenApiConstant;
import com.leo.dto.DeviceAllInfoDTO;
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
public class GetWeatherDeviceAllInfoTest {

    private String TOKEN = "499591689907547583";

    private final String deviceAddr = "0615230001";

    /**
     * 虫情设备--批量获取设备详情
     */
    @Test
    public void getWeatherDeviceAllInfo() {

        RestTemplate restTemplate = new RestTemplate();

        String url = PeopleSoftOpenApiConstant.WORM_BTCH_DEVICE_DETAIL + "?deviceAddr=" + deviceAddr;

        HttpHeaders headers = new HttpHeaders();
        headers.set("token", TOKEN);

        HttpEntity<String> httpEntity = new HttpEntity<>(headers);

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                httpEntity,
                String.class
        );

        String body = responseEntity.getBody();

        JSONObject jsonObject = JSONObject.parseObject(body);

        String data = jsonObject.getString("data");

        List<DeviceAllInfoDTO> deviceAllInfoDTOS = JSONObject.parseArray(
                data,
                DeviceAllInfoDTO.class
        );

        deviceAllInfoDTOS.forEach(System.out::println);


    }

}
