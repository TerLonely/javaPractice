/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong.interpreter;

/**
 * 简单句子解释 非非终结符表达式
 * @author zhangchendong
 * @data 2024/7/29 下午6:35
 */
public class SentenceNode extends AbstractNode {

    //方向
    private AbstractNode direction;
    //行动
    private AbstractNode action;
    //距离
    private AbstractNode distance;

    public SentenceNode (AbstractNode direction, AbstractNode action, AbstractNode distance){
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

    @Override
     public String interpret() {
        return direction.interpret() + action.interpret() + distance.interpret();
    }
}
