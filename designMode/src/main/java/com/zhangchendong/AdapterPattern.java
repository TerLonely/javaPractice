/*
 * Haier.com lnc
 * Copyright(c) All Rights Reserved
 */

package com.zhangchendong;

/**
 * 适配器模式
 * @author zhangchendong
 * @data 2024/7/22 上午11:54
 */
public class AdapterPattern {

    public static void main(String[] args) {
        LegacyRectangle legacyRectangle = new LegacyRectangle();
        Shape shapeAdapter = new RectangleAdapter(legacyRectangle);

        shapeAdapter.draw(10, 10, 100, 100);
    }
}


/**
 * 统一的shape接口
 */
interface Shape{
    void draw(int x, int y, int width, int height);
}

/**
 * 创建一个已存在的类
 */
class LegacyRectangle{
    public void display(int x, int y, int width, int height){
        System.out.println("LegacyRectangle: (" + x + "," + y + ") " + width + "*" + height);
    }
}

/**
 * 适配器类 将LegacyRectangle类适配成Shape
 */
class RectangleAdapter implements Shape{

    private LegacyRectangle legacyRectangle;

    public RectangleAdapter(LegacyRectangle legacyRectangle){
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public void draw(int x, int y, int width, int height) {
        int x1 = x;
        int y1 = y;
        int x2 = x + width;
        int y2 = y + height;
        legacyRectangle.display(x1, y1, x2, y2);
    }
}

