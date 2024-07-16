/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zcd.mainText;

import com.zcd.replaceIfElse.factory.RoleFactory;

/**
 *  测试方法运行入口
 * @author zhangchendong
 * @data 2024/5/6 11:21
 */
public class mainEntrance {
    public static void main(String[] args) {
        String roleName = "ROLE_NORMAL_ADMIN";
        String enumName = RoleFactory.getOp(roleName).op();
        System.out.println(enumName);

    }
}
