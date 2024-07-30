/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong.chainOfResponsibility;

/**
 * @author zhangchendong
 * @data 2024/7/30 下午3:26
 */
public class FinanceHandler extends ReimbursementHandler{
    @Override
    public void handleRequest(ReimbursementRequest request) {
        System.out.println("财务部门处理报销请求：" + request.getDescription());
    }
}
