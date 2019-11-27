/**
 * Copyright (c) 2019 证通电子 All rights reserved.
 *
 * https://www.szzt.com.cn
 *
 * 版权所有，侵权必究！
 */

package com.szzt.iot.admin.modules.log.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.szzt.iot.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 登录日志
 *
 * @author
 * @since 1.0.0
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("sys_log_login")
public class SysLogLoginEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户操作   0：用户登录   1：用户退出
	 */
	private Integer operation;
	/**
	 * 状态  0：失败    1：成功    2：账号已锁定
	 */
	private Integer status;
	/**
	 * 用户代理
	 */
	private String userAgent;
	/**
	 * 操作IP
	 */
	private String ip;
	/**
	 * 用户名
	 */
	private String creatorName;

}