/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zcd.replaceIfElse.Enum;

import com.zcd.replaceIfElse.RoleOperation;

/**
 * 通过枚举来 替代 多个if/else
 * @author zhangchendong
 * @data 2024/5/6 10:34
 */
public enum RoleEnum implements RoleOperation {
    ROLE_ROOT_ADMIN{
        @Override
        public String op() {
            return "当前为管理员权限";
        }
    },
    ROLE_ORDER_ADMIN{
        @Override
        public String op(){
            return "当前为订单管理员权限";
        }
    },
    ROLE_NORMAL{
        @Override
        public String op() {
            return "当前为普通用户权限";
        }
    };
}
