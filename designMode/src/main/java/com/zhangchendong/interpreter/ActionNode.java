/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong.interpreter;

/**
 * 动作解释 ； 终结符解释器
 * @author zhangchendong
 * @data 2024/7/29 下午7:26
 */
public class ActionNode extends AbstractNode{
    public String action;

    public ActionNode(String action)
    {
        this.action = action;
    }

    @Override
    public String interpret() {
        if(action.equalsIgnoreCase("move")){
            return "移动";
        }else if(action.equalsIgnoreCase("run")){
            return "快速移动";
        }else{
            return "无效动作";
        }
    }
}
