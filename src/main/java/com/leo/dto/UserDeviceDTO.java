package com.leo.dto;

import lombok.Data;

/**
 * 获取用户设备数据传输
 *
 * @author leo
 * @version 1.0
 */
@Data
public class UserDeviceDTO {

    /**
     * 设备地址
     */
    private String deviceAddr;
    /**
     * 区域 id
     */
    private String groupId;
    /**
     * 设备类型
     */
    private String deviceType;
    /**
     * 设备名称
     */
    private String deviceName;
    /**
     * 经度
     */
    private Double devicelng;
    /**
     * 纬度
     */
    private Double devicelat;
    /**
     * 设备 iccid
     */
    private String deviceIccId;

    private String deviceEnabled;

    private String correlationDeviceAddr;

    private String correlationTime;

    private String saveDateInterval;

    private String offlineInterval;

    private String httpUrl;

    private String rtmpUrl;

    private String city;

    private String createTime;

    private String iccIdData;


}
