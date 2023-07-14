package com.leo.entities;

import lombok.Data;

/**
 * @author leo
 * @version 1.0
 */
@Data
public class NodeInfoList {

    /**
     * 节点编号
     */
    private Integer nodeId;
    /**
     * 设备地址
     */
    private String deviceAddr;
    /**
     * 设备名称
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


}
