/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zcd.replaceIfElse.factory;

import com.zcd.replaceIfElse.RoleOperation;

import javax.management.relation.Role;
import java.util.HashMap;
import java.util.Map;

/**
 * 创建工厂方法 将角色判断统一加载到map中去
 * @author zhangchendong
 * @data 2024/5/6 13:51
 */
public class RoleFactory {

    static Map<String, RoleOperation> map = new HashMap<>();

    //在静态块中先把初始化工作全部做完
    static{
        map.put("ROLE_ROOT_ADMIN", new RootAdminRole("ROLE_ROOT_ADMIN"));
        map.put("ROLE_ORDER_ADMIN", new OrderAdminRole("ROLE_ORDER_ADMIN"));
        map.put("ROLE_NORMAL_ADMIN", new RootNormalRole("ROLE_NORMAL_ADMIN"));
    }

    public static RoleOperation getOp(String roleName){
        return map.get(roleName);
    }

}
