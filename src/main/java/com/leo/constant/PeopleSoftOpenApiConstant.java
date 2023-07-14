package com.leo.constant;

/**
 * 农业四情测报API
 *
 * @author leo
 * @version 1.0
 */
public interface PeopleSoftOpenApiConstant {

	String PEOPLE_SOFT_DOMAIN = "http://api.farm.0531yun.cn";

	/**
	 * 用户登录接口
	 */
	String GLOBAL_USER_LOGIN =  PEOPLE_SOFT_DOMAIN + "/api/v2.0/entrance/user/userLogin";

	/**
	 * 获取用户信息
	 */
	String GLOBAL_USERINFO = PEOPLE_SOFT_DOMAIN + "/api/v2.0/entrance/user/getUser";

	/**
	 * 获取报警通知记录
	 */
	String GLOBAL_ALARM_RECORD = PEOPLE_SOFT_DOMAIN + "/api/v2.0/entrance/device/getAlarmNoticeRecord";

	/**
	 * 获取子用户信息
	 */
	String GLOBAL_SUPER_USERINFO = PEOPLE_SOFT_DOMAIN + "/api/v2.0/entrance/user/getChildUser";

	/**
	 * 获取用户区域
	 */
	String GLOBAL_USER_AREA = PEOPLE_SOFT_DOMAIN + "/api/v2.0/entrance/group/getsysUserGroup";

	/**
	 * 获取用户设备
	 */
	String GLOBAL_USER_DEVICE = PEOPLE_SOFT_DOMAIN + "/api/v2.0/entrance/device/getsysUserDevice";

	/**
	 * 获取设备实时数据
	 */
	String GLOBAL_DEVICE_REALTIME_DATA = PEOPLE_SOFT_DOMAIN + "/api/v2.0/entrance/device/getRealTimeData";

	/**
	 * 区域绑定设备
	 */
	String GLOBAL_AREA_BINDING_DEVICE = PEOPLE_SOFT_DOMAIN + "/api/v2.0/entrance/device/groupBoundDevice";

	/**
	 * 获取设备全部信息
	 */
	String WEATHER_GET_ALL_DEVICE_INFO = PEOPLE_SOFT_DOMAIN + "/api/v2.0/met/device/getDeviceAllInfo";

	/**
	 * 根据设备地址获取节点信息
	 */
	String WEATHER_DEVICE_BY_ADDR = PEOPLE_SOFT_DOMAIN + "/api/v2.0/met/device/listTargetNodeInfo";

	/**
	 * 设备地址获取已启用的节点信息
	 */
	String WEATHER_DEVICE_IS_OPEN = PEOPLE_SOFT_DOMAIN + "/api/v2.0/met/device/listTargetEnabledNode";

	/**
	 * 节点编号获取遥调信息
	 */
	String WEATHER_NODE_ID_REMOTE_INFO = PEOPLE_SOFT_DOMAIN + "/api/v2.0/met/device/listTargetRegulating";

	/**
	 * 修改指定设备全部节点的可用状态
	 */
	String WEATHER_UPDATE_DEVICE_ALL_NODE_STATUS = PEOPLE_SOFT_DOMAIN + "/api/v2.0/met/device/updateAllOfNodesEnable";

	/**
	 * 更新设备信息
	 */
	String WEATHER_UPDATE_DEVICE_INFO = PEOPLE_SOFT_DOMAIN + "/api/v2.0/met/device/updateDevice";

	/**
	 * 更新节点信息
	 */
	String WEATHER_UPDATE_NODE_INFO = PEOPLE_SOFT_DOMAIN + "/api/v2.0/met/device/updateNodeInfo";

	/**
	 * 更新遥调信息（此接口为删除原有信息重新添加）
	 */
	String WEATHER_UPDATE_REMOTE_CONTROL_INFO = PEOPLE_SOFT_DOMAIN + "/api/v2.0/met/device/updateRegulatingInfo";

	/**
	 * 根据条件获取历史数据
	 */
	String WEATHER_GET_HISTORY_DATA = PEOPLE_SOFT_DOMAIN + "/api/v2.0/met/history/getHistoryDataList";

	/**
	 * 获取设备所有信息
	 */
	String SOIL_GET_ALL_DEVICE_INFORMATION = PEOPLE_SOFT_DOMAIN + "/api/v2.0/soil/device/getDeviceAllInfo";

	/**
	 * 更新设备信息
	 */
	String SOIL_UPDATE_DEVICE_INFORMATION = PEOPLE_SOFT_DOMAIN + "/api/v2.0/soil/device/updateDevice";

	/**
	 * 更新节点信息
	 */
	String SOIL_UPDATE_NODE_INFORMATION = PEOPLE_SOFT_DOMAIN + "/api/v2.0/soil/device/updateNodeInfo";

	/**
	 * 根据条件获取历史数据
	 */
	String SOIL_GET_HISTORY_DATA = PEOPLE_SOFT_DOMAIN + "/api/v2.0/soil/history/getHistoryDataList";

	/**
	 * 批量获取设备详情
	 */
	String SPORE_GET_DEVICE_DETAIL = PEOPLE_SOFT_DOMAIN  + "/api/v2.0/spore/device/getBtchDeviceDO";

	/**
	 * 修改设备
	 */
	String SPORE_UPDATE_DEVICE = PEOPLE_SOFT_DOMAIN + "/api/v2.0/spore/device/updateDevice";

	/**
	 * 获取设备自动模式时间
	 */
	String SPORE_GET_AUTO_MODE = PEOPLE_SOFT_DOMAIN + "/api/v2.0/spore/device/getSporeAutoMode";

	/**
	 * 手自动模式切换
	 */
	String SPORE_DEVICE_MODE = PEOPLE_SOFT_DOMAIN + "/api/v2.0/spore/device/deviceMode";

	/**
	 * 孢子设备下发命令
	 */
	String SPORE_DEVICE_OPER = PEOPLE_SOFT_DOMAIN + "/api/v2.0/spore/device/deviceOper";

	/**
	 * 孢子设备历史记录
	 */
	String SPORE_GET_HISTORY_DATA = PEOPLE_SOFT_DOMAIN + "/api/v2.0/spore/device/deviceOper";

	/**
	 * 孢子设备分析报表记录
	 */
	String SPORE_DATA_AND_AI_BY_DO = PEOPLE_SOFT_DOMAIN + "/api/v2.0/spore/deviceData/getSporeDataAndSporeDataAIByDO";

	/**
	 * 虫情批量获取设备详情
	 */
	String WORM_BTCH_DEVICE_DETAIL = PEOPLE_SOFT_DOMAIN + "/api/v2.0/worm/device/getBtchDeviceDO";

	/**
	 * 修改设备信息
	 */
	String WORM_UPDATE_DEVICE_INFORMATION = PEOPLE_SOFT_DOMAIN + "/api/v2.0/worm/device/updateDevice";

	/**
	 * 获取设备自动模式时间
	 */
	String WORM_GET_AUTO_MODE = PEOPLE_SOFT_DOMAIN + "/api/v2.0/worm/device/getWormAutoMode";

	/**
	 * 修改设备自动模式时间
	 */
	String WORM_UPDATE_AUTO_MODE = PEOPLE_SOFT_DOMAIN + "/api/v2.0/worm/device/modWormAutoMode";

	/**
	 * 手自动模式切换
	 */
	String WORM_DEVICE_OPER = PEOPLE_SOFT_DOMAIN + "/api/v2.0/worm/device/deviceOper/wormMode";

	/**
	 * 虫情设备下发命令
	 */
	String WORM_OPER_DEVICE_ISSUE = PEOPLE_SOFT_DOMAIN + "/api/v2.0/worm/device/deviceOper/wormOper";

	/**
	 * 虫情设备历史记录
	 */
	String WORM_GET_HISTORY_DATA = PEOPLE_SOFT_DOMAIN + "/api/v2.0/worm/deviceData/getWormHistoryData";

	/**
	 * 虫情区域统计
	 */
	String WORM_STATISTICS_BY_GROUP = PEOPLE_SOFT_DOMAIN + "/api/v2.0/worm/deviceData/getWormStatisticsByGroup";

	/**
	 * 虫情设备分析报表记录（最新一条记录）
	 */
	String WORM_DATA_AND_AI_BY = PEOPLE_SOFT_DOMAIN  + "/api/v2.0/worm/deviceData/getWormDataAndWormDataAIBy";

	/**
	 *害虫自动识别
	 */
	String WORM_ANALYSIST_WORM = PEOPLE_SOFT_DOMAIN + "/api/v2.0/worm/deviceData/analysistWorm";

}
