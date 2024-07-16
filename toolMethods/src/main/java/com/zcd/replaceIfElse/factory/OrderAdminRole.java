/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zcd.replaceIfElse.factory;

import com.zcd.replaceIfElse.RoleOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author zhangchendong
 * @data 2024/5/6 13:38
 */
public class OrderAdminRole implements RoleOperation {

    private String roleName;

    public OrderAdminRole(String roleName){
        this.roleName = roleName;

        // List<OrderAdminRole> list = new ArrayList<>();
        // Optional.ofNullable().ifPresent();
    }

    @Override
    public String op() {
        return "这是订单管理员角色";
    }
}
