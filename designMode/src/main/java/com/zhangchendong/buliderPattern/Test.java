/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong.buliderPattern;

/**
 * 创建者模式测试类
 * @author 张琛栋
 * @data 2022/11/29 16:01
 */
public class Test {

    public static void main(String[] args){

        //一般模式
        CourseBuilder builder = new CourseBuilder();

        builder.addName("设计模式");
        builder.addPPT("ppt");
        builder.addVideo("视频");
        builder.addNote("笔记");
        builder.addHomework("信息图");

        System.out.println(builder.build());

        //链式模式
        CourseChainBuilder build = new CourseChainBuilder()
                .addName("设计模式")
                .addPPT("ppt")
                .addVideo("视频")
                .addNote("笔记")
                .addHomework("信息图");
        System.out.println(build.build());




    }
}
