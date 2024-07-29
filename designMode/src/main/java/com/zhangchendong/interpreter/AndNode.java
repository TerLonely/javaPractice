/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong.interpreter;

/**
 * And 解释 非终结表达式
 * @author zhangchendong
 * @data 2024/7/29 下午6:19
 */
public class AndNode extends AbstractNode{

    private AbstractNode left;
    private AbstractNode right;

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public String interpret() {
        return left.interpret() + " 再 " +right.interpret();
    }
}
