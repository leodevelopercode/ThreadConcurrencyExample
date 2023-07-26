package com.leo.dto.met;

import lombok.Data;

import java.util.List;

/**
 * 气象设备--根据设备地址获取节点信息
 *
 * @author leo
 * @version 1.0
 */
@Data
public class ListTargetNodeInfoDTO {

    /**
     * 节点编号
	 */
	private Integer nodeId;
	/**
	 * 设备地址
	 */
	private String deviceAddr;
	/**
     * 节点名称
	 */
	private String nodeName;
	/**
	 * 节点是否开启 0：关闭 1：开启
	 */
	private Integer enable;
	/**
	 * 0 常规 ；1 雨量 ；2 蒸发量
	 */
	private Integer nodeMold;
	/**
	 * 1: 模拟量 1 使能模拟量 2 使能
	 * 2: 模拟量 1 使能模拟量 2 禁用
	 * 3: 模拟量 1 禁用模拟量 2 使能
	 * 4: 浮点型设备
	 * 5: 开关量型设备
	 * 6: 32 位有符号整形
	 * 7: 32 位无符号整形
	 * 8:遥调设备
	 */
	private Integer nodeType;
	/**
	 * 优先级
	 */
	private Integer priority;
	/**
	 * 小数位
	 */
	private Integer digits;
	/**
	 * 模拟量 1 名称
	 */
	private String temName;
	/**
	 * 模拟量 1 单位
	 */
	private String temUnit;
	/**
	 * 模拟量 1 偏差
	 */
	private Double temOffset;
	/**
	 * 模拟量 1 上限
	 */
	private Double temUpperLimit;
	/**
	 * 模拟量 1 下限
	 */
	private Double temLowerLimit;
	/**
	 * 模拟量 2 名称
	 */
	private String humName;
	/**
	 * 模拟量 2 单位
	 */
	private String humUnit;
	/**
     *  模拟量 2 系数
	 */
	private String humRatio;
	/**
	 * 模拟量 2 偏差
	 */
	private Double humOffset;
	/**
	 * 模拟量 2 上限
	 */
	private Double humUpperLimit;
	/**
	 * 模拟量 2 下限
	 */
	private Double humLowerLimit;
	/**
	 * 开关量闭合显示内容
	 */
	private String switchOnContent;
	/**
	 * 开关量断开显示内容
	 */
	private String switchOffContent;
	/**
	 * 开关量报警类型（0 不报警 1 闭合报警 2 断开报警）
	 */
	private Integer switchAlarmType;

	private List<String> regulatingInfoList;

}
