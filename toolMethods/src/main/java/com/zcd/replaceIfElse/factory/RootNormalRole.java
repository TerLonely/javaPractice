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
public class RootNormalRole implements RoleOperation {

    private String roleName;

    public RootNormalRole(String roleName){
        this.roleName = roleName;
    }

    @Override
    public String op() {
        return "这是普通用户角色";
    }
}
