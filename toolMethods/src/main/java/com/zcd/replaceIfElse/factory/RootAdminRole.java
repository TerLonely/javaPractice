/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zcd.replaceIfElse.factory;

import com.zcd.replaceIfElse.RoleOperation;

/**
 * @author zhangchendong
 * @data 2024/5/6 13:38
 */
public class RootAdminRole implements RoleOperation {

    private String roleName;

    public RootAdminRole(String roleName){
        this.roleName = roleName;
    }

    @Override
    public String op() {
        return "这是系统管理员角色";
    }
}
