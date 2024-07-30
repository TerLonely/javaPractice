/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong.chainOfResponsibility;

/**
 * @author zhangchendong
 * @data 2024/7/30 下午3:06
 */
public class DepartmentHandhandler extends ReimbursementHandler{

    @Override
    public void handleRequest(ReimbursementRequest request) {
        if (request.getAmount() <= 5000) {
            System.out.println("部门主管处理报销请求"+ request.getDescription());
        }else if (successor != null){
            successor.handleRequest(request);
        }
    }
}
