/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong;

/**
 * 备忘录模式
 * @author zhangchendong
 * @data 2024/8/5 上午10:35
 * Memento 类表示备忘录对象，保存了特定时刻的状态
 * Caretaker 类负责保存和获取备忘录对象
 */
public class MementoPattern {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // 设置初始状态
        originator.setState("State 1");
        System.out.println("Current State: " + originator.getState());

        // 创建备忘录并保存状态
        caretaker.setMemento(originator.createMemento());

        //修改状态
        originator.setState("State 2");
        System.out.println("Updated State: " + originator.getState());

        // 恢复到备忘录状态
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("Restored State: " + originator.getState());
    }
}


/**
 * 备忘录类
 */
class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}

/**
 * 原始对象类
 */
class Originator{
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento memento){
        state = memento.getState();
    }
}

/**
 * 管理者类
 */
class Caretaker{
    private Memento memento;

    public Memento getMemento(){
        return memento;
    }

    public void setMemento(Memento memento){
        this.memento = memento;
    }
}


