/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong.chainOfResponsibility;

/**
 * @author zhangchendong
 * @data 2024/7/30 下午3:27
 */
public class Main {
    public static void main(String[] args) {
        ReimbursementHandler manager = new ManagerHandler();
        ReimbursementHandler department = new DepartmentHandhandler();
        ReimbursementHandler finance = new FinanceHandler();

        manager.setSuccessor(department);
        department.setSuccessor(finance);

        ReimbursementRequest request1 = new ReimbursementRequest(800.0, "购买办公用品");
        ReimbursementRequest request2 = new ReimbursementRequest(3000.0, "参加培训");
        ReimbursementRequest request3 = new ReimbursementRequest(10000.0, "团建活动");

        manager.handleRequest(request1);
        manager.handleRequest(request2);
        manager.handleRequest(request3);
    }
}
