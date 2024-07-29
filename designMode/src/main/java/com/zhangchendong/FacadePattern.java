/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong;

/**
 *  外观模式
 *  隐藏了系统的复杂性，并向客户端提供了一个可以访问系统的接口。
 * @author zhangchendong
 * @data 2024/7/25 上午10:01
 */
public class FacadePattern {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        //开启 对外接口
        homeTheaterFacade.watchMovie();
        //关闭 对外接口
        homeTheaterFacade.endMovie();
    }
}


/**
 * 子系统: 音响
 */
class StereoSystem{
    public void turnOn(){
        System.out.println("Stereo System is turned on");
    }
    public void turnOff(){
        System.out.println("Stereo System is turned off");
    }
}

/**
 * 子系统 ：投影仪
 */
class Projector{
    public void turnOn(){
        System.out.println("Projector is turned on");
    }
    public void turnOff(){
        System.out.println("Projector is turned off");
    }
}

/**
 * 子系统 ： 灯光控制
 */
class LightsControl{
    public void turnOn(){
        System.out.println("Lights are turned on");
    }
    public void turnOff(){
        System.out.println("Lights are turned off");
    }
}

/**
 * 对外统一接口 外观类
 * 家庭影院
 */
class HomeTheaterFacade{
    private StereoSystem stereoSystem;
    private Projector projector;
    private LightsControl lightsControl;

    /**
     * 空参构造器
     */
    public HomeTheaterFacade(){
        stereoSystem = new StereoSystem();
        projector = new Projector();
        lightsControl = new LightsControl();
    }

    public void watchMovie(){
        System.out.println("Getting ready to watch a movie .. ");
        stereoSystem.turnOn();
        projector.turnOn();
        lightsControl.turnOn();
    }

    public void endMovie(){
        System.out.println("Ending the movie ...");
        stereoSystem.turnOff();
        projector.turnOff();
        lightsControl.turnOff();

    }
}