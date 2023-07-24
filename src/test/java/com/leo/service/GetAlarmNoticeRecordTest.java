package com.leo.service;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.leo.constant.PeopleSoftOpenApiConstant;
import com.leo.dto.AlarmNoticeRecordDTO;
import com.leo.dto.UserDeviceDTO;
import com.leo.dto.UserGroupDTO;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.*;

/**
 * @author leo
 * @version 1.0
 */
public class GetAlarmNoticeRecordTest {

    private final static String TOKEN = "499591689907547583";

    /**
     * 获取设备报警统计记录信息
     */
    @Test
    public void getAlarmNoticeRecordTest() {

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.set("token", TOKEN);

        // 创建HttpEntity对象，将请求体和请求头信息放入其中
        HttpEntity<String> httpEntity = new HttpEntity<>(headers);



        String beginTime = "2023-07-10 11:39:58";
        String endTime = "2023-07-21 11:39:58";
        String deviceAddr = "0615230001";


        String url = PeopleSoftOpenApiConstant.GLOBAL_ALARM_RECORD + "?" +
                "beginTime=" + beginTime +
                "&endTime=" + endTime ;

        // 发送POST请求
        ResponseEntity<String> responseEntity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                httpEntity,
                String.class
        );

        String body = responseEntity.getBody();

        JSONObject jsonObject = JSONObject.parseObject(body);

        String  data = jsonObject.getString("data");

        List<AlarmNoticeRecordDTO> alarmNoticeRecordDTOS = JSONObject.parseArray(data, AlarmNoticeRecordDTO.class);


        alarmNoticeRecordDTOS.forEach(System.out::println);


        System.out.println("responseEntity.getStatusCode() = " + responseEntity.getStatusCode());
        System.out.println("responseEntity.getBody() = " + responseEntity.getBody());


    }

    @Test
    public void getSysUserDevice() {

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.set("token", TOKEN);

        // 创建HttpEntity对象，将请求体和请求头信息放入其中
        HttpEntity<String> httpEntity = new HttpEntity<>(headers);


        // 发送GET请求，并将响应解析为String
        ResponseEntity<String> responseEntity = restTemplate.exchange(
                PeopleSoftOpenApiConstant.GLOBAL_USER_DEVICE,
                HttpMethod.GET,
                httpEntity,
                String.class
        );

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // 解析JSON字符串中的"data"字段，转换为对象列表
            List<UserDeviceDTO> dataList = objectMapper.readValue(
                    objectMapper.readTree(responseEntity.getBody()).get("data").toString(),
                    objectMapper.getTypeFactory().constructCollectionType(List.class, UserDeviceDTO.class)
            );

            // 处理 dataList，这里是你的业务逻辑
            for (UserDeviceDTO userDeviceDTO : dataList) {
                System.out.println(userDeviceDTO.getDeviceAddr());
            }
        } catch (IOException e) {
            e.printStackTrace();
            // 处理异常
        }

    }

    /**
     * 获取用户区域
     */
    @Test
    public void getSysUserGroup(){
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.set("token",TOKEN);

        HttpEntity<String>  httpEntity = new HttpEntity<>(headers);

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                PeopleSoftOpenApiConstant.GLOBAL_USER_AREA,
                HttpMethod.GET,
                httpEntity,
                String.class
        );

        System.out.println("responseEntity.getBody() = " + responseEntity.getBody());


        ObjectMapper objectMapper = new ObjectMapper();
        try {

            UserGroupDTO userGroupDTO = objectMapper.readValue(responseEntity.getBody(), UserGroupDTO.class);

            System.out.println("userGroupDTO.getCode() = " + userGroupDTO.getCode());

            System.out.println("userGroupDTO = " + userGroupDTO);
        } catch (IOException e) {
            e.printStackTrace();
            // 处理异常
        }



    }


}
