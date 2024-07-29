/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong.interpreter;

/**
 * 距离解释 ： 终结符表达式
 * @author zhangchendong
 * @data 2024/7/29 下午7:29
 */
public class DistanceNode extends AbstractNode {

    private String distance;

    public DistanceNode(String distance){
        this.distance = distance;
    }
    @Override
    public String interpret() {
        return this.distance;
    }
}
