package com.leo.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 获取用户区域数据传输
 *
 * @author leo
 * @version 1.0
 */
@Data
public class UserGroupDTO implements Serializable {

	private Integer code;

	private String message;

	private MyBody[] data;

	@Data
	public static class MyBody{
		/**
		 * 区域 id
		 */
		private String groupId;
		/**
		 * 区域名称
		 */
		private String groupName;
		/**
		 * 备注
		 */
		private String remark;
		private Integer parentId;
		/**
		 * 邮件可用发送条数
		 */
		private Integer emailQuantity;
		/**
		 * 短信可用发送条数
		 */
		private Integer smsQuantity;
		private Integer voiceQuantity;
		private String groupLocation;

		private String chief;
		private String chiefPhone;
		/**
		 * 创建时间
		 */
		private String createTime;
		private String deviceList;
		private String deviceDOS;
		/**
		 * 操作权限 1 为可操作，其他不可操作
		 */
		private Integer authority;
		private Boolean select;
		/**
		 * 蒸发量和降雨量数据操作权限 1 为可操作，其他不可操作
		 */
		private Integer dataCrud;
	}


}
