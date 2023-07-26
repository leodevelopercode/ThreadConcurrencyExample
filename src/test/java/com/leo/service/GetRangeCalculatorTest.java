package com.leo.service;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 * @author leo
 * @version 1.0
 */
public class GetRangeCalculatorTest {

    @Test
    public void getRangeCalculatorByCalendar() {

        // 获取当前日期
        Calendar calendar = Calendar.getInstance();
        // 计算前面第十天的日期
        calendar.add(Calendar.DAY_OF_MONTH, -10);

        // 获取前面第十天的日期
        Calendar tenDaysAgo = (Calendar) calendar.clone();

        // 获取当前日期
        Calendar today = Calendar.getInstance();

        // 设置时间为23:59:59，以获取当天的最后一秒钟
        today.set(Calendar.HOUR_OF_DAY, 23);
        today.set(Calendar.MINUTE, 59);
        today.set(Calendar.SECOND, 59);

        // 格式化日期并输出
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("前面第十天的日期范围：");
        System.out.println("开始日期：" + sdf.format(tenDaysAgo.getTime()));
        System.out.println("结束日期：" + sdf.format(today.getTime()));
    }
    
    @Test
    public void getRangeCalculatorByLocalDate(){

        // 获取当前日期
        LocalDate today = LocalDate.now();
        // 计算前面第十天的日期
        LocalDate tenDaysAgo = today.minusDays(10);

        // 获取当前日期的最后一秒钟
        LocalDateTime endOfDay = LocalDateTime.of(today, LocalTime.MAX);

        // 获取前面第十天的日期的开始时间和结束时间
        LocalDateTime startDateTime = tenDaysAgo.atStartOfDay();
        LocalDateTime endDateTime = endOfDay;

        // 格式化日期并输出
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("前面第十天的日期范围：");
        System.out.println("开始日期：" + dtf.format(startDateTime));
        System.out.println("结束日期：" + dtf.format(endDateTime));

    }

}

