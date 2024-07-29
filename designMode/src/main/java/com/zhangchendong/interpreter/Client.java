/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong.interpreter;

/**
 * @author zhangchendong
 * @data 2024/7/29 下午7:45
 */
public class Client {
    public static void main(String[] args) {
        // String instruction = "turn left 100 and turn right 50";
        String instruction = "up move 5 and down run 10 and left move 5";
        InstructionHandler handler = new InstructionHandler();
        handler.handle(instruction);

        String outString;
        outString = handler.outPut();
        System.out.println(outString);
    }
}
