package com.leo.config;

import com.leo.service.ThreadPoolService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author leo
 * @version 1.0
 */

@Configuration
public class ThreadPoolConfig {


    @Bean
    public ExecutorService executorService() {
        return Executors.newFixedThreadPool(4);
    }

    @Bean
    public ScheduledExecutorService scheduledExecutorServiceTow(ThreadPoolService threadPoolService)  {

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        // 执行定时任务，每两个小时执行一次
        scheduledExecutorService.scheduleAtFixedRate(
                threadPoolService,
                0,
                5,
                TimeUnit.SECONDS
        );

        return scheduledExecutorService;
    }

}

