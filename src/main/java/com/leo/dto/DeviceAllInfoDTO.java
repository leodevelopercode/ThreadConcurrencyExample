package com.leo.dto;

import lombok.Data;

/**
 * @author leo
 * @version 1.0
 */
@Data
public class DeviceAllInfoDTO {

	/**
	 * 设备地址
	 */
	private String deviceAddr;
	/**
	 * 设备名称
	 */
	private String deviceName;
	/**
	 * 纬度
	 */
	private Double lat;
	/**
	 * 经度
	 */
	private Double lng;
	/**
	 * 数据保存间隔（分钟）
	 */
	private Integer saveDataInterval;
	/**
	 * 离线判断间隔（分钟）
	 */
	private Integer offlineInterval;




}
