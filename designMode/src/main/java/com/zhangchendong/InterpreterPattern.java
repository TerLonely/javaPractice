/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong;

/**
 * 解释器设计模式
 *
 * @author zhangchendong
 * @data 2024/7/29 下午5:52
 */
public class InterpreterPattern {
    public static void main(String[] args) {
        //构建表达式：2+（3-1）
        Expression expression = new AddExpression(
                new NumberExpression(2),
                new SubtractExpression(
                        new NumberExpression(3),
                        new NumberExpression(1)
                )
        );

        int result = expression.interpret();
        System.out.println("2+(3-1) = "+result);
    }
}

/**
 * 表达式接口
 */
interface Expression{
    int interpret();
}

/**
 * 数字表达式
 */
class NumberExpression implements Expression{

    private int number;

    public NumberExpression (int number){
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}

/**
 * 加法表达式
 */
class AddExpression implements Expression {
    private Expression leftOperand;
    private Expression rightOperand;

    public AddExpression(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }
    @Override
    public int interpret() {
        return leftOperand.interpret() +rightOperand.interpret();
    }
}

/**
 * 减法表达式
 */
class SubtractExpression implements Expression{
    private Expression leftOperand;
    private Expression rightOperand;

    public SubtractExpression(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret() {
        return leftOperand.interpret() - rightOperand.interpret();
    }
}
