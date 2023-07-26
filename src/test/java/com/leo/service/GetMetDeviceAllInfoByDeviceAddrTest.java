package com.leo.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.leo.constant.PeopleSoftOpenApiConstant;
import com.leo.dto.met.ListTargetNodeInfoDTO;
import com.leo.dto.WeatherDeviceAllInfoDTO;
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
public class GetMetDeviceAllInfoByDeviceAddrTest {

    public String TOKEN = "670091690341113866";

    /**
     * 得到了设备所有信息设备测试
     */
    @Test
    public void getMetDeviceAllInfoByDeviceTest(){

        RestTemplate  restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.set("token",TOKEN);

        String deviceAddr = "40268906,40268897";

        String url = PeopleSoftOpenApiConstant.WEATHER_GET_ALL_DEVICE_INFO + "?deviceStr=" +
                deviceAddr;

        HttpEntity<String> httpEntity = new HttpEntity<>(headers);

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                httpEntity,
                String.class
        );


        JSONObject jsonObject = JSON.parseObject(responseEntity.getBody());

        String jsonObjectString = jsonObject.getString("data");


        List<WeatherDeviceAllInfoDTO> weatherDeviceAllInfoDTOS = JSONObject.parseArray(jsonObjectString, WeatherDeviceAllInfoDTO.class);

        weatherDeviceAllInfoDTOS.forEach(System.out::println);

    }
    
    @Test
    public void getMetListTargetNodeInfoTest(){

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.set("token",TOKEN);

        String deviceAddr = "40268906";

        String url = PeopleSoftOpenApiConstant.WEATHER_DEVICE_BY_ADDR + "?deviceAddr=" + deviceAddr;

        HttpEntity<String> httpEntity = new HttpEntity<>(headers);

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                httpEntity,
                String.class
        );

        System.out.println("responseEntity.getBody() = " + responseEntity.getBody());

        JSONObject jsonObject = JSON.parseObject(responseEntity.getBody());

        String jsonObjectString = jsonObject.getString("data");

        List<ListTargetNodeInfoDTO> listTargetNodeInfoDTOS = JSONObject.parseArray(jsonObjectString, ListTargetNodeInfoDTO.class);

        listTargetNodeInfoDTOS.forEach(System.out::println);

    }

}
