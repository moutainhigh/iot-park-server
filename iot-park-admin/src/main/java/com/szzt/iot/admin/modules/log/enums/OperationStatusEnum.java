/**
 * Copyright (c) 2019 证通电子 All rights reserved.
 *
 * https://www.szzt.com.cn
 *
 * 版权所有，侵权必究！
 */

package com.szzt.iot.admin.modules.log.enums;

/**
 * 操作状态枚举
 *
 * @author
 * @since 1.0.0
 */
public enum OperationStatusEnum {
    /**
     * 失败
     */
    FAIL(0),
    /**
     * 成功
     */
    SUCCESS(1);

    private int value;

    OperationStatusEnum(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }
}