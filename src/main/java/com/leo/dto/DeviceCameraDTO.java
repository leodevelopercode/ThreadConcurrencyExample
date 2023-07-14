package com.leo.dto;

import lombok.Data;

/**
 * 批量获取摄像头设备-数据传输
 *
 * @author leo
 * @version 1.0
 */
@Data
public class DeviceCameraDTO {
	/**
	 * 设备地址
	 */
	private String deviceAddr;
	/**
	 * 摄像头名称
	 */
	private String cameraName;
	/**
	 * 摄像头 rtmpUrl 地址
	 */
	private String rtmpUrl;
	/**
	 * 摄像头 httpUrl 地址
	 */
	private String httpUrl;
	/**
	 * 是否支持云台 0：否 1：是
	 */
	private Integer type;
	/**
	 * key
	 */
	private String appKey;
	/**
	 * 秘钥
	 */
	private String secret;
	/**
	 * token
	 */
	private String accessToken;
	/**
	 *  token 过期时间
	 */
	private String expireTime;
	/**
	 * 设备序列号
	 */
	private String deviceSerial;
	/**
	 * 通道
	 */
	private Integer channelNo;
	/**
	 * 验证码
	 */
	private String validateCode;
	/**
	 * 是否自动播放 0：否 1：是
	 */
	private Integer autoPlay;
	/**
	 * 是否播放音频 0：否 1：是
	 */
	private Integer audioEnable;
	/**
	 * 播放类型 0：预览
	 */
	private Integer playType;
	/**
	 * 清晰度 0：高清 1：标清
	 */
	private Integer definition;
	/**
	 * 播放器模板 0：极简版 1：标准版 2：安防版
	 */
	private Integer playTemplate;
	/**
	 * 播放模式 0：仅直播 1：支持 EZOPEN 协议
	 */
	private Integer playMode;
	/**
	 * 经度
	 */
	private Double devicelng;
	/**
	 * 纬度
	 */
	private Double devicelat;

}
