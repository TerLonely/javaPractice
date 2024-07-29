/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong.interpreter;

import java.util.Stack;

/**
 * @author zhangchendong
 * @data 2024/7/29 下午7:32
 */
public class InstructionHandler {
    private AbstractNode node;

    public void handle(String instruction){
        AbstractNode left = null, right = null;
        AbstractNode direction = null, action = null, distance = null;

        //声明一个栈对象
        Stack stack = new Stack();
        //以空格分隔指令字符串
        String[] words = instruction.split(" ");

        for(int i = 0; i < words.length; i++){
            if(words[i].equalsIgnoreCase("and")){
                left = (AbstractNode) stack.pop();
                String word1 = words[++i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                right = new SentenceNode(direction, action, distance);
                stack.push(new AndNode(left, right));
            }else{
                String word = words[i];
                direction = new DirectionNode(word);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                left = new SentenceNode(direction, action, distance);
                stack.push(left);
            }
        }
        this.node = (AbstractNode) stack.pop();
    }

    public String outPut(){
        return this.node.interpret();
    }
}
