package com.zhangchendong;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/** 享元模式
 *  通过共享的方式高效的支持大量细粒度的对象。
 * @author zhangchendong
 * @data 2024/7/25 上午10:14
 */
public class FlyweightPattern {


    public static void main(String[] args) {
        Color[] colors = {Color.red, Color.GREEN, Color.BLUE, Color.YELLOW};

        for (Color color: colors){

        }
    }
}

/**
 * 享元接口
 */
interface FlyweightShape{
    void draw(int x, int y);
}

/**
 * 具体的享元接口
 */
class FlyweightCircle implements FlyweightShape{
    private Color color;

    public FlyweightCircle(Color color){
        this.color = color;
    }
    @Override
    public void draw(int x, int y) {
        System.out.println("Circle: Draw() [Color : " + color.toString() + ", x : " + x + ", y : " + y + "]");
    }
}

/**
 * 享元工厂类
 */
class ShapeFactory{
    private static final Map<Color, FlyweightShape> circleMap = new HashMap<>();
    public static FlyweightShape getCircle(Color color){
        FlyweightShape circle = circleMap.get(color);
        if(circle == null){
            circle = new FlyweightCircle(color);
            circleMap.put(color, circle);
        }
        return circle;
    }
}

