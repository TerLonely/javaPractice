/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong.designMode.buliderPattern;

/**
 * 建造者基本模式
 * @author 张琛栋
 * @data 2022/11/29 15:51
 */
public class CourseBuilder {

    private Course course = new Course();

    public void addName(String name){
        course.setName(name);
    }

    public void addPPT(String ppt){
        course.setPpt(ppt);
    }

    public void addVideo(String video){
        course.setVideo(video);
    }

    public void addNote(String note){
        course.setNote(note);
    }

    public void addHomework(String homework){
        course.setHomeWork(homework);
    }

    public Course build(){
        return course;
    }
}
