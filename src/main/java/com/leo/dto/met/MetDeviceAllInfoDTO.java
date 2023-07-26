package com.leo.dto.met;

import lombok.Data;

import java.util.List;

/**
 * @author leo
 * @version 1.0
 */
@Data
public class MetDeviceAllInfoDTO {

    private int nodeId;

    private String deviceAddr;

    private String nodeName;

    private int enable;

    private String nodeMold;

    private int nodeType;

    private int priority;

    private int digits;

    private String temName;

    private String temUnit;

    private double temRatio;

    private int temOffset;

    private int temUpperLimit;

    private int temLowerLimit;

    private String humName;

    private String humUnit;

    private double humRatio;

    private int humOffset;

    private int humUpperLimit;

    private int humLowerLimit;

    private String switchOnContent;

    private String switchOffContent;

    private int switchAlarmType;

    private List<String> regulatingInfoList;

}
