/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong.interpreter;

/**
 * 方向解释 ： 终结符表达式
 * @author zhangchendong
 * @data 2024/7/29 下午7:13
 */
public class DirectionNode extends AbstractNode {
    private String direction;

    public DirectionNode(String direction){
        this.direction = direction;
    }

    @Override
    public String interpret() {
        if(direction.equalsIgnoreCase("up")){
            return "向上";
        }else if(direction.equalsIgnoreCase("down")){
            return "向下";
        }else if(direction.equalsIgnoreCase("left")){
            return "向左";
        }else if(direction.equalsIgnoreCase("right")){
            return "向右";
        }else{
            return "无效方向";
        }
    }
}
