package com.leo.dto;

import lombok.Data;


/**
 * 设备报警通知记录数据传输
 *
 * @author leo
 * @version 1.0
 */
@Data
public class AlarmNoticeRecordDTO {

	/**
	 * 通知记录表 id
	 */
	private Integer noticeID;
	/**
	 * 类型 0 邮件 1 短信
	 */
	private Integer noticeIType;
	/**
	 * 设备地址
	 */
	private String deviceAddr;
	/**
	 * 节点名称
	 */
	private String factorName;
	/**
	 * 节点 id
	 */
	private String factorId;
	/**
	 * 联系人
	 */
	private String contact;
	/**
	 * 通知内容
	 */
	private String noticeIContent;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 创建时间
	 */
	private String createTime;


}
