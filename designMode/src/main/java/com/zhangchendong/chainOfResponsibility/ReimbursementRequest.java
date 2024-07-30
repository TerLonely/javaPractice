/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong.chainOfResponsibility;

/**
 * 表示一个请求的类
 * @author zhangchendong
 * @data 2024/7/30 上午11:44
 */
public class ReimbursementRequest {
    private Double amount;
    private String description;

    public ReimbursementRequest(Double amount, String description){
        this.amount = amount;
        this.description = description;
    }

    public Double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}
