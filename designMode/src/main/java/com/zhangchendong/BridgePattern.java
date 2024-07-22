
package com.zhangchendong;

/**
 * 桥接模式
 * @author zhangchendong
 * @data 2024/7/22 下午5:17
 */
public class BridgePattern {
    public static void main(String[] args) {
        Color redColor = new RedColor();
        Color blueColor = new BlueColor();

        B_Shape redCircle = new Circle(redColor);
        B_Shape blueSquare = new Square(blueColor);

        redCircle.draw();
        blueSquare.draw();
    }
}

/**
 * 现实部分 -- 颜色接口
 */
interface Color{
    void applyColor();
}

class RedColor implements Color{
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}

class BlueColor implements Color{
    @Override
    public void applyColor() {
        System.out.println("Applying blue color");
    }
}

/**
 * 抽象部分 -- 形状类
 */
abstract class B_Shape{
    protected Color color;

    public B_Shape(Color color){
        this.color = color;
    }
    abstract void draw();
}
//图形-圆
class Circle extends B_Shape{
    public Circle(Color color){
        super(color);
    }
    @Override
    void draw() {
        System.out.println("Drawing a circle");
        color.applyColor();
    }
}
//图形 - 方形
class Square extends B_Shape{
    public Square (Color color){
        super(color);
    }
    @Override
    void draw() {
        System.out.println("Drawing a square");
        color.applyColor();
    }
}