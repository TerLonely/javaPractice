/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong.chainOfResponsibility;

/**
 * 实现具体的处理者
 * @author zhangchendong
 * @data 2024/7/30 上午11:51
 */
public class ManagerHandler extends ReimbursementHandler {
    @Override
    public void handleRequest(ReimbursementRequest request) {
        if (request.getAmount() <= 1000) {
            System.out.println("经理处理报销请求："+ request.getDescription());
        }else if (successor != null){
            successor.handleRequest(request);
        }
    }
}
