/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong;

/**
 *
 * 一般的代理模式
 * @author zhangchendong
 * @data 2024/7/27 上午11:34
 */
public class ProxyNormalPattern {
    public static void main(String[] args) {
        Image image = new ProxyImage("sample.jpg");

        // 图像未加载 直达调用display()方法
        image.display();

        // 图像已加载 无需再次加载
        image.display();
    }
}

/**
 * 图像接口
 */
interface Image{
    void display();
}

/**
 * 真实图像类
 */
class RealImage implements Image{

    private String fileName;

    private void loadImageFromDisk(){
        System.out.println("loading image from disk: " + fileName);
    }

    public RealImage(String fileName){
        this.fileName = fileName;
        this.loadImageFromDisk();
    }

    @Override
    public void display() {
        System.out.println("displaying image: " + fileName);
    }
}

/**
 * 代理图像类
 */
class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;


    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {

        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}


