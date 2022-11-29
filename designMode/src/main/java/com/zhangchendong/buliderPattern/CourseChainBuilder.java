/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong.buliderPattern;

/**
 * 建造者链式模式
 * @author 张琛栋
 * @data 2022/11/29 16:07
 */
public class CourseChainBuilder {

    private Course course = new Course();

    public CourseChainBuilder addName(String name){
        course.setName(name);
        return this;
    }

    public CourseChainBuilder addPPT(String ppt){
        course.setPpt(ppt);
        return this;
    }

    public CourseChainBuilder addVideo(String video){
        course.setVideo(video);
        return this;
    }

    public CourseChainBuilder addNote(String note){
        course.setNote(note);
        return this;
    }

    public CourseChainBuilder addHomework(String homework){
        course.setHomeWork(homework);
        return this;
    }

    public Course build(){
        return this.course;
    }

}
