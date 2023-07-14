package com.leo.entities;

import lombok.Data;

/**
 * @author leo
 * @version 1.0
 */
@Data
public class Rows {
    /**
     * 记录表 id
     */
    private Integer historyId;
    /**
     * 节点编号
     */
    private Integer nodeId;
    /**
     * 设备地址
     */
    private String deviceAddress;
    /**
     * 模拟量 1 值
     */
    private String temStr;
    /**
     * 模拟量 2 值
     */
    private String humStr;
    /**
     *  模拟量 1 值
     */
    private Double temValue;
    /**
     * 模拟量 2 值
     */
    private Double humValue;
    /**
     * 是否是报警数据 0：正常 1：报警
     */
    private Integer alarmStatus;
    /**
     * 保存时间（时间戳）
     */
    private Long recordTime;

}
