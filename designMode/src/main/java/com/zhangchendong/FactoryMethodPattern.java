
package com.zhangchendong;

/**
 * 工厂模式
 * @author zhangchendong
 * @data 2024/7/17 下午4:43
 */
public class FactoryMethodPattern {
    /**
     * 定义一个图形接口
     */
    interface Shape{
        void draw();
    }

    // 实现具体的图形 一个圆形 一个矩形
    static class Circle implements Shape{
        @Override
        public void draw() {
            System.out.println("Drawing a Circle");
        }
    }
    static class RectAngle implements Shape{
        @Override
        public void draw() {
            System.out.println("Drawing a RectAngle");
        }
    }

    /**
     *  创建一个抽象工厂类 ShapeFactory
     */
    static abstract class ShapeFactory{
        abstract Shape createShape();
    }

    // 实现shapeFactory并且重写createShape 返回响应的图形对象
    static class CircleFactory extends ShapeFactory{
        @Override
        Shape createShape() {
            return new Circle();
        }
    }
    static class RectAngleFactory extends ShapeFactory{
        @Override
        Shape createShape() {
            return new RectAngle();
        }
    }
    /**
     * 工厂测试方法
     */
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        Shape circleShape = circleFactory.createShape();
        circleShape.draw();

        ShapeFactory rectAngleFactory = new RectAngleFactory();
        Shape rectShape = rectAngleFactory.createShape();
        rectShape.draw();
    }
}
