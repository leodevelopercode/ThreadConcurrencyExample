package com.leo.dto;

import lombok.Data;

/**
 * 获取用户区域数据传输
 *
 * @author leo
 * @version 1.0
 */
@Data
public class UserGroupDTO {

	/**
	 * 区域 id
	 */
	private String groupId;
	/**
	 * 区域名称
	 */
	private String groupString;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 邮件可用发送条数
	 */
	private Integer emailQuantity;
	/**
	 * 短信可用发送条数
	 */
	private Integer smsQuantity;
	/**
	 * 创建时间
	 */
	private String createTime;
	/**
	 * 操作权限 1 为可操作，其他不可操作
	 */
	private Integer authority;
	/**
	 * 蒸发量和降雨量数据操作权限 1 为可操作，其他不可操作
	 */
	private Integer dataCrud;

}
