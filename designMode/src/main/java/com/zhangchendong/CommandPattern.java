/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong;

/** 命令设计模式
 * @author zhangchendong
 * @data 2024/7/31 上午9:36
 *
 * 设置不同的命令，执行方法触发相应的操作
 * 这样，命令的发送者、和命令的接收者实现了解耦
 */
public class CommandPattern {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        RemoteControl remoteControl = new RemoteControl();

        //设置命令 打开电灯
        remoteControl.setCommand(livingRoomLightOn);
        remoteControl.pressButton();

        //设置命令 关闭电灯
        remoteControl.setCommand(livingRoomLightOff);
        remoteControl.pressButton();
    }
}

/**
 * 命令接口
 */
interface Command{
    void execute();
}

/**
 * 具体命令 ：控制电灯打开
 */
class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

/**
 * 具体命令 ：控制电灯关闭
 */
class LightOffCommand implements Command{
    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

/**
 * 电灯类
 */
class Light {
    void turnOn(){
        System.out.println("Light is on");
    }
    void turnOff(){
        System.out.println("Light is off");
    }
}

/**
 * 遥控器类
 */
class RemoteControl{
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}
