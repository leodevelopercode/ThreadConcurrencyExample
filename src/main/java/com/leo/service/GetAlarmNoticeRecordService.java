package com.leo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author leo
 * @version 1.0
 */
@Service
public class GetAlarmNoticeRecordService {

    @Async
    public void AlarmNoticeRecord(){

        System.out.println("获取设备告警记录中...");

    }

}
