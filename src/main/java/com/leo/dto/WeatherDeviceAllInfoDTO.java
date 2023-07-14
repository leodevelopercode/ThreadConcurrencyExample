package com.leo.dto;

import com.leo.entities.NodeInfoList;
import lombok.Data;

/**
 * 气象设备--获取所有设备信息
 *
 * @author leo
 * @version 1.0
 */
@Data
public class WeatherDeviceAllInfoDTO {

	private String deviceAddr;

	private String deviceName;

	private Double lng;

	private Double lat;

	private Integer saveDataInterval;

	private Integer offlineInterval;

	private NodeInfoList nodeInfoList;

}
