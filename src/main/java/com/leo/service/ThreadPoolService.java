package com.leo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.function.Consumer;

/**
 * @author leo
 * @version 1.0
 */
@Service
public class ThreadPoolService implements Runnable {

    private final ExecutorService executorService;
    private final GetAlarmNoticeRecordService getAlarmNoticeRecordService;
    private final GetRealTimeDataService getRealTimeDataService;
    private final GetSoilDeviceAllInfoService getSoilDeviceAllInfoService;
    private final GetWeatherDeviceAllInfoService getWeatherDeviceAllInfoService;

    public ThreadPoolService(ExecutorService executorService,
                             GetAlarmNoticeRecordService getAlarmNoticeRecordService,
                             GetRealTimeDataService getRealTimeDataService,
                             GetSoilDeviceAllInfoService getSoilDeviceAllInfoService,
                             GetWeatherDeviceAllInfoService getWeatherDeviceAllInfoService) {
        this.executorService = executorService;
        this.getAlarmNoticeRecordService = getAlarmNoticeRecordService;
        this.getRealTimeDataService = getRealTimeDataService;
        this.getSoilDeviceAllInfoService = getSoilDeviceAllInfoService;
        this.getWeatherDeviceAllInfoService = getWeatherDeviceAllInfoService;
    }


    @Override
    public void run() {

        List<Runnable> runnableList = new ArrayList<>();

        runnableList.add(getAlarmNoticeRecordService::AlarmNoticeRecord);

        runnableList.add(getRealTimeDataService::RealTimeData);

        runnableList.add(getSoilDeviceAllInfoService::SoilDeviceAllInfo);

        runnableList.add(getWeatherDeviceAllInfoService::WeatherDeviceAllInfo);

        runnableList.forEach(runnable -> {
//            executorService.execute(runnable);
            System.out.println("ThreadPoolService.accept");
        });


    }
}
