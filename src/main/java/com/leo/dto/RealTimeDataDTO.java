package com.leo.dto;

import lombok.Data;

/**
 * 设备实时数据-数据传输
 *
 * @author leo
 * @version 1.0
 */
@Data
public class RealTimeDataDTO {

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
	 * 状态 online,offline,alarm
	 */
	private String status;
	/**
	 * 设备类型
	 */
	private String deviceType;


}
