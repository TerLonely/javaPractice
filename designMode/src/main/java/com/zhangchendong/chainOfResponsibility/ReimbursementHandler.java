/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong.chainOfResponsibility;

/**
 * 抽象处理类
 * @author zhangchendong
 * @data 2024/7/30 上午11:47
 */
public abstract class ReimbursementHandler {
    protected ReimbursementHandler successor;

    public void setSuccessor(ReimbursementHandler successor){
        this.successor = successor;
    }

    public abstract void handleRequest(ReimbursementRequest request);
}
