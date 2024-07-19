/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong;

/**
 * 抽象工厂模式
 * @author zhangchendong
 * @data 2024/7/18 上午10:18
 */
public class AbstractFactoryPattern {


    /**
     * 定义一个抽象产品接口 操作系统
     */
    interface OperatingSystem{
        void run();
    }
    static class WindowsOS implements OperatingSystem{
        @Override
        public void run() {
            System.out.println("Running Windows OS");
        }
    }
    static class MacOS implements OperatingSystem{
        @Override
        public void run() {
            System.out.println("Running MAC OS");
        }
    }

    /**
     * 定义一个抽象产品 应用程序
     */
    interface Application{
        void open();
    }

    static class Word implements Application{
        @Override
        public void open() {
            System.out.println("Running Word Application");
        }
    }
    static class Excel implements Application {
        @Override
        public void open() {
            System.out.println("Running Excel Application");
        }
    }

    interface SoftWareFactory{
        OperatingSystem createOperatingSystem();
        Application createApplication();
    }

    static class WindowsFactory implements SoftWareFactory{
        @Override
        public OperatingSystem createOperatingSystem() {
            return new WindowsOS();
        }

        @Override
        public Application createApplication() {
            return new Word();
        }
    }

    static class MacFactory implements SoftWareFactory{
        @Override
        public OperatingSystem createOperatingSystem() {
            return null;
        }

        @Override
        public Application createApplication() {
            return null;
        }
    }

    public static void main(String[] args) {

        //运行windows 执行 应用
        SoftWareFactory windowsFactory = new WindowsFactory();
        OperatingSystem windowsOS = windowsFactory.createOperatingSystem();
        Application  windowsApplication = windowsFactory.createApplication();

        windowsOS.run();
        windowsApplication.open();

        //运行 MAC 执行 运行

        SoftWareFactory macFactory = new MacFactory();
        OperatingSystem macOS = macFactory.createOperatingSystem();
        Application  macApplication = macFactory.createApplication();

        macOS.run();
        macApplication.open();


    }
}
